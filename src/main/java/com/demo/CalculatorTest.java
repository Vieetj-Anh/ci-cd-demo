package com.demo;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @org.testng.annotations.Test
    void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(2,3));
    }
}
