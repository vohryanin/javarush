package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aString = reader.readLine(), bString = reader.readLine();
        int a = Integer.parseInt(aString), b = Integer.parseInt(bString);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
