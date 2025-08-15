// Quiz Application JavaScript Functions

// Global variables
let quizTimer = null;
let timeRemaining = 60; // 60 seconds for quiz

// Initialize application when DOM is loaded
document.addEventListener('DOMContentLoaded', function() {
    initializeApp();
});

// Main initialization function
function initializeApp() {
    // Add smooth scrolling to all links
    addSmoothScrolling();
    
    // Initialize form validations
    initializeFormValidations();
    
    // Add loading animations
    addLoadingAnimations();
    
    // Initialize tooltips if Bootstrap is available
    if (typeof bootstrap !== 'undefined') {
        var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'));
        var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
            return new bootstrap.Tooltip(tooltipTriggerEl);
        });
    }
}

// Add smooth scrolling to all anchor links
function addSmoothScrolling() {
    const links = document.querySelectorAll('a[href^="#"]');
    links.forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            const target = document.querySelector(this.getAttribute('href'));
            if (target) {
                target.scrollIntoView({
                    behavior: 'smooth',
                    block: 'start'
                });
            }
        });
    });
}

// Initialize form validations
function initializeFormValidations() {
    // Real-time validation for all forms
    const forms = document.querySelectorAll('form');
    forms.forEach(form => {
        form.addEventListener('submit', function(e) {
            if (!validateForm(this)) {
                e.preventDefault();
                showAlert('Please fill in all required fields correctly.', 'danger');
            }
        });
        
        // Add real-time validation to input fields
        const inputs = form.querySelectorAll('input[required]');
        inputs.forEach(input => {
            input.addEventListener('blur', function() {
                validateField(this);
            });
            
            input.addEventListener('input', function() {
                clearValidation(this);
            });
        });
    });
}

// Validate individual form field
function validateField(field) {
    const value = field.value.trim();
    const fieldName = field.name;
    
    // Clear previous validation
    clearValidation(field);
    
    // Check if field is empty
    if (field.hasAttribute('required') && value === '') {
        showFieldError(field, `${capitalizeFirst(fieldName)} is required`);
        return false;
    }
    
    // Specific field validations
    switch (fieldName) {
        case 'username':
            if (value.length < 3) {
                showFieldError(field, 'Username must be at least 3 characters long');
                return false;
            }
            if (!/^[a-zA-Z0-9_]+$/.test(value)) {
                showFieldError(field, 'Username can only contain letters, numbers, and underscores');
                return false;
            }
            break;
            
        case 'email':
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(value)) {
                showFieldError(field, 'Please enter a valid email address');
                return false;
            }
            break;
            
        case 'password':
            if (value.length < 6) {
                showFieldError(field, 'Password must be at least 6 characters long');
                return false;
            }
            break;
            
        case 'confirmPassword':
            const password = document.querySelector('input[name="password"]');
            if (password && value !== password.value) {
                showFieldError(field, 'Passwords do not match');
                return false;
            }
            break;
    }
    
    // If validation passes, show success
    showFieldSuccess(field);
    return true;
}

// Clear field validation styling
function clearValidation(field) {
    field.classList.remove('is-invalid', 'is-valid');
    const feedback = field.parentNode.querySelector('.invalid-feedback');
    if (feedback) {
        feedback.style.display = 'none';
    }
}

// Show field error
function showFieldError(field, message) {
    field.classList.add('is-invalid');
    field.classList.remove('is-valid');
    
    let feedback = field.parentNode.querySelector('.invalid-feedback');
    if (!feedback) {
        feedback = document.createElement('div');
        feedback.className = 'invalid-feedback';
        field.parentNode.appendChild(feedback);
    }
    feedback.textContent = message;
    feedback.style.display = 'block';
}

// Show field success
function showFieldSuccess(field) {
    field.classList.add('is-valid');
    field.classList.remove('is-invalid');
}

// Validate entire form
function validateForm(form) {
    let isValid = true;
    const inputs = form.querySelectorAll('input[required]');
    
    inputs.forEach(input => {
        if (!validateField(input)) {
            isValid = false;
        }
    });
    
    return isValid;
}

// Quiz Timer Functions
function startQuizTimer(duration) {
    timeRemaining = duration;
    const timerElement = document.getElementById('timeLeft');
    
    quizTimer = setInterval(function() {
        const minutes = Math.floor(timeRemaining / 60);
        const seconds = timeRemaining % 60;
        
        if (timerElement) {
            timerElement.textContent = timeRemaining;
            
            // Change color as time runs out
            const timerContainer = timerElement.closest('.badge, .alert, #timer');
            if (timerContainer) {
                if (timeRemaining <= 10) {
                    timerContainer.classList.remove('bg-warning', 'bg-info');
                    timerContainer.classList.add('bg-danger');
                } else if (timeRemaining <= 30) {
                    timerContainer.classList.remove('bg-info');
                    timerContainer.classList.add('bg-warning');
                }
            }
        }
        
        timeRemaining--;
        
        // Time's up!
        if (timeRemaining < 0) {
            clearInterval(quizTimer);
            handleTimeUp();
        }
    }, 1000);
}

// Handle when time is up
function handleTimeUp() {
    showAlert('Time\'s up! Quiz will be submitted automatically.', 'warning');
    
    // Auto-submit the quiz form
    const quizForm = document.getElementById('quizForm');
    if (quizForm) {
        setTimeout(() => {
            quizForm.submit();
        }, 2000);
    }
}

// Stop quiz timer
function stopQuizTimer() {
    if (quizTimer) {
        clearInterval(quizTimer);
        quizTimer = null;
    }
}

// Show custom alerts
function showAlert(message, type = 'info', duration = 5000) {
    // Remove existing alerts
    const existingAlerts = document.querySelectorAll('.custom-alert');
    existingAlerts.forEach(alert => alert.remove());
    
    // Create new alert
    const alertDiv = document.createElement('div');
    alertDiv.className = `alert alert-${type} custom-alert fade show`;
    alertDiv.style.cssText = `
        position: fixed;
        top: 20px;
        right: 20px;
        z-index: 9999;
        min-width: 300px;
        max-width: 500px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.15);
    `;
    
    alertDiv.innerHTML = `
        <div class="d-flex align-items-center">
            <div class="flex-grow-1">${message}</div>
            <button type="button" class="btn-close" onclick="this.parentElement.parentElement.remove()"></button>
        </div>
    `;
    
    document.body.appendChild(alertDiv);
    
    // Auto-remove after duration
    if (duration > 0) {
        setTimeout(() => {
            if (alertDiv.parentNode) {
                alertDiv.remove();
            }
        }, duration);
    }
}

// Loading animations
function addLoadingAnimations() {
    // Add fade-in animation to cards
    const cards = document.querySelectorAll('.card');
    cards.forEach((card, index) => {
        card.style.opacity = '0';
        card.style.transform = 'translateY(20px)';
        
        setTimeout(() => {
            card.style.transition = 'all 0.6s ease';
            card.style.opacity = '1';
            card.style.transform = 'translateY(0)';
        }, index * 100);
    });
}

// Utility Functions
function capitalizeFirst(str) {
    return str.charAt(0).toUpperCase() + str.slice(1);
}

// Format date for display
function formatDate(dateString) {
    const date = new Date(dateString);
    const options = { 
        year: 'numeric', 
        month: 'short', 
        day: 'numeric', 
        hour: '2-digit', 
        minute: '2-digit' 
    };
    return date.toLocaleDateString('en-US', options);
}

// Calculate percentage
function calculatePercentage(score, total) {
    return total > 0 ? Math.round((score / total) * 100) : 0;
}

// Get grade based on percentage
function getGrade(percentage) {
    if (percentage >= 90) return 'A+';
    if (percentage >= 80) return 'A';
    if (percentage >= 70) return 'B';
    if (percentage >= 60) return 'C';
    if (percentage >= 50) return 'D';
    return 'F';
}

// Local Storage Functions (for offline data)
function saveToLocal(key, data) {
    try {
        localStorage.setItem(key, JSON.stringify(data));
    } catch (e) {
        console.error('Could not save to localStorage:', e);
    }
}

function getFromLocal(key) {
    try {
        const data = localStorage.getItem(key);
        return data ? JSON.parse(data) : null;
    } catch (e) {
        console.error('Could not read from localStorage:', e);
        return null;
    }
}

// Quiz Navigation Functions
function navigateToQuestion(questionNumber) {
    // Save current answer before navigation
    const currentAnswer = document.querySelector('input[name="answer"]:checked');
    if (currentAnswer) {
        saveCurrentAnswer(questionNumber, currentAnswer.value);
    }
    
    // Show loading animation
    showLoadingSpinner();
    
    // Submit form to navigate
    const form = document.getElementById('quizForm');
    if (form) {
        const actionInput = document.createElement('input');
        actionInput.type = 'hidden';
        actionInput.name = 'action';
        actionInput.value = questionNumber > getCurrentQuestion() ? 'next' : 'prev';
        form.appendChild(actionInput);
        form.submit();
    }
}

function getCurrentQuestion() {
    // Extract current question number from URL or page title
    const title = document.title;
    const match = title.match(/Question (\d+)/);
    return match ? parseInt(match[1]) : 1;
}

function saveCurrentAnswer(questionNumber, answer) {
    const answers = getFromLocal('quizAnswers') || {};
    answers[questionNumber] = answer;
    saveToLocal('quizAnswers', answers);
}

// Loading spinner
function showLoadingSpinner() {
    const spinner = document.createElement('div');
    spinner.id = 'loadingSpinner';
    spinner.className = 'spinner-custom';
    spinner.style.cssText = `
        position: fixed;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        z-index: 10000;
    `;
    
    const overlay = document.createElement('div');
    overlay.id = 'loadingOverlay';
    overlay.style.cssText = `
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0,0,0,0.5);
        z-index: 9999;
    `;
    
    document.body.appendChild(overlay);
    document.body.appendChild(spinner);
}

function hideLoadingSpinner() {
    const spinner = document.getElementById('loadingSpinner');
    const overlay = document.getElementById('loadingOverlay');
    
    if (spinner) spinner.remove();
    if (overlay) overlay.remove();
}

// Keyboard shortcuts
document.addEventListener('keydown', function(e) {
    // Only handle shortcuts on quiz pages
    if (document.getElementById('quizForm')) {
        switch(e.key) {
            case '1':
            case '2':
            case '3':
            case '4':
                const optionLabels = ['A', 'B', 'C', 'D'];
                const option = optionLabels[parseInt(e.key) - 1];
                const radio = document.getElementById('option' + option);
                if (radio) {
                    radio.checked = true;
                    radio.focus();
                }
                break;
                
            case 'Enter':
                if (e.ctrlKey) {
                    // Ctrl+Enter submits the form
                    const submitBtn = document.querySelector('button[name="action"][value="next"], button[name="action"][value="finish"]');
                    if (submitBtn) {
                        submitBtn.click();
                    }
                }
                break;
        }
    }
});

// Auto-save functionality for quiz answers
setInterval(function() {
    if (document.getElementById('quizForm')) {
        const selectedAnswer = document.querySelector('input[name="answer"]:checked');
        if (selectedAnswer) {
            const questionNum = getCurrentQuestion();
            saveCurrentAnswer(questionNum, selectedAnswer.value);
        }
    }
}, 5000); // Auto-save every 5 seconds

// Prevent accidental page refresh during quiz
window.addEventListener('beforeunload', function(e) {
    if (document.getElementById('quizForm') && quizTimer) {
        e.preventDefault();
        e.returnValue = 'You have an active quiz. Are you sure you want to leave?';
        return e.returnValue;
    }
});

// Initialize page-specific functionality
window.addEventListener('load', function() {
    // Start timer if on quiz page
    const timerElement = document.getElementById('timeLeft');
    if (timerElement && !quizTimer) {
        const initialTime = parseInt(timerElement.textContent) || 60;
        startQuizTimer(initialTime);
    }
    
    // Hide loading spinner if present
    hideLoadingSpinner();
});