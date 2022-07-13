package com.otumian.androidsimplecalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addTwoNumbers() {
        double resultAdd = Operation.add(1d, 1d);
        assertEquals(resultAdd, 3d, 0.0001);
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = Operation.add(-1d, 2d);
        assertEquals(resultAdd, 1d, 0.0001);
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = Operation.add(1.111f, 1.111d);
        assertEquals(resultAdd, 2.222, 0.0001);
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = Operation.sub(1d, 1d);
        assertEquals(resultSub, 0d, 0.0001);
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = Operation.sub(1d, 17d);
        assertEquals(resultSub, -16d, 0.0001);
    }

    @Test
    public void mulTwoNumbers() {
        double resultMul = Operation.mul(32d, 2d);
        assertEquals(resultMul, 64d, 0.0001);
    }

    @Test
    public void divTwoNumbers() {
        double resultDiv = Operation.div(32d, 2d);
        assertEquals(resultDiv, 16d, 0.0001);
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = Operation.div(32d, 0);
        assertEquals(resultDiv, Double.POSITIVE_INFINITY, 0.0001);
    }

}