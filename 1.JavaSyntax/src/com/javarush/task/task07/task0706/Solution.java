package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ints = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum_chet = 0, sum_nechet = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < ints.length; i++) {
            if (((double) i%2) == 0.0) sum_chet += ints[i];
            else sum_nechet += ints[i];
        }

//        System.out.println("sum_chet = " + sum_chet);
//        System.out.println("sum_nechet = " + sum_nechet);

        if (sum_chet > sum_nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (sum_chet < sum_nechet) System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
