package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testSum() {
        Hello hello = new Hello();
        assertEquals(hello.sum(1, 2), 3);
    }
}
