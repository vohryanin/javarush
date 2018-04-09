package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max_length = 0;
        Solution.strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            Solution.strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            max_length = max_length > string.length() ? max_length : string.length();
        }

        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if (max_length == string.length()) System.out.println(string);
        }
    }
}
