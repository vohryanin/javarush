package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        String s_min = reader.readLine();
        double d_min = Double.parseDouble(s_min);

        get_color(d_min);
    }

    public static void get_color (double min) {
//        System.out.println("min = " + min);
        if (0.0 <= min & min < 3.0) System.out.println("зелёный");
        if (3.0 <= min & min < 4.0) System.out.println("жёлтый");
        if (4.0 <= min & min < 5.0) System.out.println("красный");
        if (min - 5.0 >= 0) {

            Double min2 = min - 5.0;
//            System.out.println("входим в рекурсию, min2 = " + min2);
            get_color(min2);
        }
    }

}