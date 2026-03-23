package com.demo;

import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(2,3));
        assertEquals(999, cal.add(2,3)); // FAIL
    }
}