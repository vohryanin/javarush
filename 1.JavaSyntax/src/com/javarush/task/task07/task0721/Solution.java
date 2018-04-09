package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] array20 = new int[20];
        maximum = minimum = array20[0] = Integer.parseInt(reader.readLine());
        for (int i = 1; i < 20; i++) {
            array20[i] = Integer.parseInt(reader.readLine());
            if (array20[i] < minimum) minimum = array20[i];
            else if (array20[i] > maximum) maximum = array20[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
