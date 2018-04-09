package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minString = 0;
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) { //заполняем strings
            strings.add(reader.readLine());
        }
        minString = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++) { //вычисляем длину минимальной строки
            if (strings.get(i).length() < minString) minString = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) { //выводим все строки, длина которых равно minString
            if (minString == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}
