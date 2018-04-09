package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> stringsORIG = new ArrayList<String>();
//        ArrayList<String> stringsSORT = new ArrayList<>()
        int lengthOfString = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            stringsORIG.add(reader.readLine());
        }

        lengthOfString = stringsORIG.get(0).length();

        for (int i = 1; i < stringsORIG.size(); i++) {
            if (stringsORIG.get(i).length() < lengthOfString) {
                System.out.println(i);
                break;
            }
            else lengthOfString = stringsORIG.get(i).length();
        }
    }
}

