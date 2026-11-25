package com.tp.calculatrice;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(15, App.addition(10, 5));
    }

    @Test
    public void testSoustraction() {
        assertEquals(5, App.soustraction(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, App.multiplication(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, App.division(10, 5), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionParZero() {
        App.division(10, 0);
    }
}