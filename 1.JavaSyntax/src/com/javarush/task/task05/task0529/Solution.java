package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aString;
        int aInt, sum = 0;
        final String SUM = "сумма";

        while (true) {
            aString = reader.readLine();
            if (aString.equals("сумма")) break;
            else {
                aInt = Integer.parseInt(aString);
                sum += aInt;

            }
        }
        System.out.println(sum);
    }
}
