package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigInts = new int[20];
        int[] smallInts1 = new int[10];
        int[] smallInts2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigInts.length; i++) {
            bigInts[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            smallInts1[i] = bigInts[i];
            smallInts2[i] = bigInts[10+i];
            System.out.println(smallInts2[i]);
        }
    }
}
