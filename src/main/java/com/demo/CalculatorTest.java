package com.demo;


import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @org.testng.annotations.Test
    void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(2,3));
        assertEquals(999, cal.add(2,3));
    }
}
