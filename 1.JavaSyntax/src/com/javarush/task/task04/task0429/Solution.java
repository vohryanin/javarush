package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {

//    public static int a = 0;
//    public static int b = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_a = reader.readLine();
        String s_b = reader.readLine();
        String s_c = reader.readLine();
        int i_a = Integer.parseInt(s_a);
        int i_b = Integer.parseInt(s_b);
        int i_c = Integer.parseInt(s_c);

        int minusCount = 0;
        int plusCount  = 0;

//        check(i_a);
//        check(i_b);
//        check(i_c);
        if (i_a < 0) minusCount++;
        else if (i_a > 0) plusCount++;

        if (i_b < 0) minusCount++;
        else if (i_b > 0) plusCount++;

        if (i_c < 0) minusCount++;
        else if (i_c > 0) plusCount++;

        System.out.println("количество отрицательных чисел:  " + minusCount);
        System.out.println("количество положительных чисел:  " + plusCount);
    }

//    public static void check(int x){
//        if (x < 0) a += 1;
//        else if (x > 0) b += 1;
//    }
}
