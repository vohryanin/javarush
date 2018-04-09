package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_a = reader.readLine();
        int i_a = Integer.parseInt(s_a);

        if (negative(i_a) && chet(i_a)) System.out.println("отрицательное четное число");
        if (negative(i_a) && !chet(i_a)) System.out.println("отрицательное нечетное число");
        if (zero(i_a)) System.out.println("ноль");
        if (positive(i_a) && chet(i_a)) System.out.println("положительное четное число");
        if (positive(i_a) && !chet(i_a)) System.out.println("положительное нечетное число");
    }
    public static boolean positive(int a){
        return a > 0;
    }

    public static boolean negative(int a){
        return a < 0;
    }

    public static boolean zero(int a){
        return a == 0;
    }

    public static boolean chet(int a){
        double b = a;
        return (a / 2) == (b / 2.0);
    }


}
