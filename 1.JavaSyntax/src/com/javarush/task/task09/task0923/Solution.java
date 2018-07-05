package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine().toString();
        String glass = "";
        String soglas = "";
        int lengthOfString = inputString.length();
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < lengthOfString; i++) {
            if (isVowel(charArray[i])) {
                glass += charArray[i];
                glass += ' ';
            }
            else {
                if(charArray[i] != ' ') {
                    soglas += charArray[i];
                    soglas += ' ';
                }
//                else soglas += charArray[i];

            }
        }

        System.out.println(glass);
        System.out.println(soglas);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}