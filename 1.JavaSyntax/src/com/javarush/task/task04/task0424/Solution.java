package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_1 = reader.readLine();
        String s_2 = reader.readLine();
        String s_3 = reader.readLine();
        int i_1 = Integer.parseInt(s_1);
        int i_2 = Integer.parseInt(s_2);
        int i_3 = Integer.parseInt(s_3);

        if (i_1 == i_2 || i_1 == i_3 || i_2 == i_3) {
            if (i_1 == i_2 && i_1 != i_3) System.out.println("3");
            if (i_1 == i_3 && i_1 != i_2) System.out.println("2");
            if (i_2 == i_3 && i_2 != i_1) System.out.println("1");
        }


    }
}
