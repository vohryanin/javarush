package com.javarush.task.task01.task0127;

/* 
Число в квадрате
*/

public class Solution {
    public static void main(String[] args) {
        String sqr_result = "" + sqr(5);
        System.out.println(sqr_result);//напишите тут ваш код
    }

    public static int sqr(int a) {
        return a * a;
    }
}
