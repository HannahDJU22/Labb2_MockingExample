package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDCalculatorTest {
    int expected = 10;


@Test
    void addingTwoNumbersTest(){
        assertEquals(expected, addingTwoNumbers(a, b));
    }
}
