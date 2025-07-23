package com.aurionpro.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.aurionpro.model.Calculator;

public class CalculatorTest {

	Calculator cal = new Calculator();

    @Test
    public void testAddition() {
        int sum = cal.addition(10, 2);
        assertEquals(12, sum);
    }
}

