package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void divisionByZero () {
        float div;

        div = 23 / 0;
        System.out.println(div);

    }
}
