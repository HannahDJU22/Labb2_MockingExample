package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TDDCalculatorTest {
    TDDCalc calc = new TDDCalc();

    @Test
    public void testAddingTwoNumbers(){
    assertEquals(33, calc.addingFiveNumbers(6, 4, 3, 8, 12));

    }
}
