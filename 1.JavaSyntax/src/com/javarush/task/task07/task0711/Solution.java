package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            strings.get(i);
        }
    }
}
