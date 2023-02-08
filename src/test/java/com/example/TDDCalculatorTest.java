package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TDDCalculatorTest {
    TDDCalc calc = new TDDCalc();

    @Test
    public void AddingNumbersShouldWork(){
        assertEquals(10, calc.add(5, 5));
    }

/*   @Test
    public void AddingNumbersWithIncorrectTypeSHouldFail(){
        assertEquals(10, calc.add(6, 4L));
    }*/

    @Test
    public void AddingSeveralNUmbersShouldWork(){
        assertEquals(20, calc.add(5, 5, 3, 7));
    }
}
