package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        long kolCharsInFile = 0;
        int kolProbelsInFile = 0;

        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.toCharArray().length; i++) {
                if (line.toCharArray()[i] == ' ') {
                    kolProbelsInFile++;
                } else {
                    kolCharsInFile++;
                }
            }
        }
        reader.close();
        Double result = (kolProbelsInFile * 1.0) / (kolCharsInFile + kolProbelsInFile) * 100;
        System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_DOWN).doubleValue());
    }
}
