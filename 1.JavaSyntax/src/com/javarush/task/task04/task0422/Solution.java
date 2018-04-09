package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String s_age = reader.readLine();
        int i_age = Integer.parseInt(s_age);

        if (i_age < 18) System.out.println("Подрасти еще");
    }
}
