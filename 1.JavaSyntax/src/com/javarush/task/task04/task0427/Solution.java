package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_a = reader.readLine();
        int i_a = Integer.parseInt(s_a);

        if (chet(i_a) && one_char(i_a)) System.out.println("четное однозначное число");
        if (!chet(i_a) && one_char(i_a)) System.out.println("нечетное однозначное число");
        if (chet(i_a) && two_char(i_a)) System.out.println("четное двузначное число");
        if (!chet(i_a) && two_char(i_a)) System.out.println("нечетное двузначное число");
        if (chet(i_a) && three_char(i_a)) System.out.println("четное трехзначное число");
        if (!chet(i_a) && three_char(i_a)) System.out.println("нечетное трехзначное число");

    }

    public static boolean chet(int a) {
        double b = a * 1.0;
        return (a / 2) == (b / 2.0);
    }

    public static boolean one_char(int a){
        return (a > 0) && (a < 10);
    }

    public static boolean two_char(int a){
        return (a > 9) && (a < 100);
    }

    public static boolean three_char(int a){
        return (a > 99) && (a < 1000);
    }
}
