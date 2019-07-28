package com.animals.cats.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

public class MathUtilsTest {

    MathUtils mathUtils;

    @Before
    public void create() {
        mathUtils = new MathUtils();
        System.out.print("Create before");
    }

    @After
    public void cleanup() {
        System.out.print("Cleaning up...");
    }

    @Test
    public void testMultiply() {
        assertEquals(4, mathUtils.multiply(2,2));
    }

    @Test
    public void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computerCircleArea(10), 0.1);
    }

    @Test
    public void testDivide() {
        assertEquals(2, mathUtils.divide(4, 2));
    }
}
