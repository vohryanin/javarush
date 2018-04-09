package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String s_one = reader.readLine();
//        String s_two = reader.readLine();
//        String s_tchee = reader.readLine();
        int one = input_int();
        int two = input_int();
        int thee = input_int();

        compare(one, two, thee);
    }
    public static int input_int () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        return i;
    }

    public static void compare(int a, int b, int c) {
        int all_in_one = 0;

        if (a == b & a == c & b == c) {
            System.out.println(a + " " + b + " " + c);
            all_in_one = 1;
        }

        if (all_in_one == 0) {
            if (a == b ) System.out.println(a + " " + b);
            if (a == c) System.out.println(a + " " + c);
            if (b == c) System.out.println(b + " " + c);
        }

    }
}