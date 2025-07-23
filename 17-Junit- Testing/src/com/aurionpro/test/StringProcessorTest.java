package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.StringProcessor;

@DisplayName("StringProcessor Test Suite")
public class StringProcessorTest {

    StringProcessor processor;

    @BeforeEach
    void init() {
        processor = new StringProcessor();
        System.out.println(" Setup for test...");
    }

    @AfterEach
    void clean() {
        System.out.println("Teardown after test...\n");
    }

    // ✅ 1. Palindrome Tests with @Tag
    @Nested
    @Tag("fast")
    @DisplayName("Palindrome Tests")
    class PalindromeTests {

        @Test
        @DisplayName("Check if 'madam' is a palindrome")
        void testPalindromeTrue() {
            assertTrue(processor.isPalindrome("madam"));
        }

        @Test
        @DisplayName("Check if 'hello' is not a palindrome")
        void testPalindromeFalse() {
            assertFalse(processor.isPalindrome("hello"));
        }

        @Test
        @DisplayName("Null input should return false")
        void testPalindromeNull() {
            assertFalse(processor.isPalindrome(null));
        }
    }

    // ✅ 2. Reverse Tests using @Nested
    @Nested
    @DisplayName("Reverse String Tests")
    class ReverseTests {

        @Test
        @DisplayName("Reverse of 'hello' should be 'olleh'")
        void testReverseSimple() {
            assertEquals("olleh", processor.reverse("hello"));
        }

        @RepeatedTest(3)
        @DisplayName("Repeat test to reverse 'Java'")
        void repeatedReverseTest(RepetitionInfo repetitionInfo) {
            System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());
            assertEquals("avaJ", processor.reverse("Java"));
        }

        @Test
        @Disabled("Under development")
        @DisplayName("Disabled test for reverse null")
        void testReverseNull() {
            assertNull(processor.reverse(null));
        }
    }
}

