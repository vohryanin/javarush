package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string_a = reader.readLine();
        String string_b = reader.readLine();
        String string_c = reader.readLine();

        int int_a = Integer.parseInt(string_a);
        int int_b = Integer.parseInt(string_b);
        int int_c = Integer.parseInt(string_c);

        int first = max(int_a, int_b, int_c);
        int second = avg(int_a, int_b, int_c);
        int third = min(int_a, int_b, int_c);

        System.out.println(first + " " + second + " " + third);
    }

    public static int min(int a, int b, int c){
        if (a <= b && a <= c) {
//            System.out.println("min = " + a);
            return a;
        }
        else if (b <= a && b <= c) {
//            System.out.println("min = " + b);
            return b;
        }
        else {
//            System.out.println("min = " + c);
            return c;
        }

    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
//            System.out.println("max = " + a);
            return a;
        }
        else if (b >= a && b >= c) {
//            System.out.println("max = " + b);
            return b;
        }
        else {
//            System.out.println("max = " + c);
            return c;
        }
    }
    public static int avg(int a, int b, int c){
        if (a <= b && a >= c || a >= b && a <= c) {
//            System.out.println("avg = " + a);
            return a;
        }
        else if (b <= a && b >= c || b >= a && b <= c) {
//            System.out.println("avg = " + b);
            return b;
        }
        else {
//            System.out.println("avg = " + c);
            return c;
        }
    }
}
