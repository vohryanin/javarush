package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kol = 0;
        try {
            FileInputStream inputStream = new FileInputStream(reader.readLine());

            while (inputStream.available() > 0) {
                if (inputStream.read() == 44) {
                    kol++;
                }
            }

            System.out.printf(String.valueOf(kol));

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
