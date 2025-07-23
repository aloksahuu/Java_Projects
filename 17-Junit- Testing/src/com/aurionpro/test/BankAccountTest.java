package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.BankAccount;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class BankAccountTest {

    private BankAccount account;

    @BeforeAll
    static void before_all_tests() {
        System.out.println("=== Starting all BankAccount tests ===");
    }

    @AfterAll
    static void after_all_tests() {
        System.out.println("=== Finished all BankAccount tests ===");
    }

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    // ✅ Deposit Tests
    @Nested
    @Tag("regression")
    class DepositTests {

        @Test
        void test_deposit_positive_amount() {
            account.deposit(1000);
            assertEquals(1000, account.getBalance());
        }

        @Test
        void test_deposit_negative_amount_should_throw_exception() {
            assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
        }
    }

    // ✅ Withdraw Tests
    @Nested
    @Tag("critical")
    class WithdrawalTests {

        @Test
        void test_withdraw_valid_amount() {
            account.deposit(1000);
            account.withdraw(400);
            assertEquals(600, account.getBalance());
        }

        @Test
        void test_withdraw_more_than_balance_should_throw_exception() {
            account.deposit(500);
            assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000));
        }

        @Test
        void test_withdraw_negative_amount_should_throw_exception() {
            assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
        }
    }
}

