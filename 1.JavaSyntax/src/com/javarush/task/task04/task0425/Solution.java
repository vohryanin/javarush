package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_x = reader.readLine();
        String s_y = reader.readLine();
        int i_x = Integer.parseInt(s_x);
        int i_y = Integer.parseInt(s_y);

        if (i_x > 0 && i_y > 0) System.out.println("1");
        if (i_x < 0 && i_y > 0) System.out.println("2");
        if (i_x < 0 && i_y < 0) System.out.println("3");
        if (i_x > 0 && i_y < 0) System.out.println("4");
    }
}
