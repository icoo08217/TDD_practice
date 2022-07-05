package com.ll.exam;

public class Calculator {
    public static int add(String s){
        String[] sSplit = s.split(" \\+ ");
        int num1 = Integer.parseInt(sSplit[0]);
        int num2 = Integer.parseInt(sSplit[1]);

        return num1 + num2 ;
    }
}
