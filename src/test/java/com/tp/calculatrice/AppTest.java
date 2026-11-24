package com.tp.calculatrice;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(15, App.addition(10, 5));
    }
}