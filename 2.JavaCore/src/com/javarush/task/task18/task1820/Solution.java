package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        String line;
        Double d;
        List<String> strings = new ArrayList<>();

        while ((line = fileReader.readLine()) != null) {
            Collections.addAll(strings, line.split(" "));
            for (int i = 0; i < strings.size(); i++) {
                if ((d = Double.valueOf(strings.get(i))) > 0) {
                    fileWriter.write(Integer.valueOf(new BigDecimal(d).setScale(0, RoundingMode.HALF_UP).intValue()).toString());
                    fileWriter.write(" ");

                } else {
                    fileWriter.write(Integer.valueOf(new BigDecimal(d).setScale(0, RoundingMode.HALF_DOWN).intValue()).toString());
                    fileWriter.write(" ");
                }
            }
            strings.clear();
        }
        fileReader.close();
        fileWriter.close();
    }
}
