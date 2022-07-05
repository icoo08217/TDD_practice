package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void 더하기() {
        int test = Calculator.calc("10 + 50");
        assertEquals(60 , test);
    }

    @Test
    public void 더하기_2(){
        int test = Calculator.calc("20 + 30");

        assertEquals(50 , test);
    }

    @Test
    public void 더하기_3(){
        int test = Calculator.calc("10 + 10");

        assertEquals(20, test);
    }

    @Test
    public void 빼기() {
        int test = Calculator.calc("20 - 25");

        assertEquals(-5, test);
    }

    @Test
    public void 곱하기() {
        int test = Calculator.calc("10 * 10");

        assertEquals(100 , test);
    }

    @Test
    public void 나누기() {
        int test = Calculator.calc("10 / 10");

        assertEquals(1, test);
    }
}
