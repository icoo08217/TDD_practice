package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void 더하기_테스트() {
        int test = Calculator.add("10 + 50");

        assertEquals(60 , test);
    }

    @Test
    public void 더하기_테스트2(){
        int test = Calculator.add("20 + 30");

        assertEquals(50 , test);
    }

    @Test
    public void 더하기_테스트3(){
        int test = Calculator.add("10 + 10");

        assertEquals(20, test);
    }
}
