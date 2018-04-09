package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0.0;
        int kol = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_current_input;
        double d_current_input = 0.0;

        while (d_current_input != -1) {
            s_current_input = reader.readLine();
            d_current_input = Integer.parseInt(s_current_input);

            if (d_current_input == -1) break;
            else {
                kol++;
                sum += d_current_input;
            }
        }
        System.out.println(sum/kol);
    }
}

