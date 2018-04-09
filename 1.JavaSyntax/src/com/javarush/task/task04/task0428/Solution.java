package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {

    public static int kol = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_a = reader.readLine();
        String s_b = reader.readLine();
        String s_c = reader.readLine();
        int i_a = Integer.parseInt(s_a);
        int i_b = Integer.parseInt(s_b);
        int i_c = Integer.parseInt(s_c);

        chek_pol(i_a);
        chek_pol(i_b);
        chek_pol(i_c);

        System.out.println(kol);
    }

    public static void chek_pol(int a){
        if (a > 0) kol += 1;
    }
}
