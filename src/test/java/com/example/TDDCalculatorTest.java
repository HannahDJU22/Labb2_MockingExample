package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TDDCalculatorTest {

    @Test
    public void testAddingTwoNumbers(){
        TDDCalc calc = new TDDCalc();

    assertEquals(10, calc.addingTwoNumbers(6, 4));

    }
}
