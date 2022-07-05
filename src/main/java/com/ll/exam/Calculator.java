package com.ll.exam;

public class Calculator {
    public static int calc(String s) {

        boolean isMinus = s.indexOf(" - ") != -1; // - 가 포함되어 있으면 해당 인덱스의 값을 반환하는 함수 string.indexOf
        // - 가 없다면 -1을 반환한다.
        boolean isMulti = s.indexOf(" * ") != -1;

        if (isMinus) {
            return calcMinus(s);
        } else if (isMulti) {
            return calcMulti(s);
        } else if (!isMulti) {
            return calcDiv(s);
        }

        return calcPlus(s);
    }

    public static int calcDiv(String s) {
        String[] sSplit = s.split(" \\/ ");
        int num1 = Integer.parseInt(sSplit[0]);
        int num2 = Integer.parseInt(sSplit[1]);

        return num1 / num2;
    }

    public static int calcMinus(String s){
        String[] sSplit = s.split(" \\- ");
        int num1 = Integer.parseInt(sSplit[0]);
        int num2 = Integer.parseInt(sSplit[1]);

        return num1 - num2;
    }

    public static int calcPlus(String s){
        String[] sSplit = s.split(" \\+ ");
        int num1 = Integer.parseInt(sSplit[0]);
        int num2 = Integer.parseInt(sSplit[1]);

        return num1 + num2;
    }

    public static int calcMulti(String s){
        String[] sSplit = s.split(" \\* ");
        int num1 = Integer.parseInt(sSplit[0]);
        int num2 = Integer.parseInt(sSplit[1]);

        return num1 * num2;
    }
}
