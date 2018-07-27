package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0) {
            throw new NumberFormatException();
        }
        int min;
        int nod = 1;
        if (a <= b) min = a;
        else min = b;

        for (int i = 1; i <= min; i++) {
            if ((a % i) == 0 && (b % i) == 0) {
                nod = i;
            }
        }
        System.out.println(nod);
    }
}
