package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = fileNameReader.readLine();
        String fileName2 = fileNameReader.readLine();
        String fileName3 = fileNameReader.readLine();

        FileWriter fileWriter = new FileWriter(fileName1);
        FileReader fileReader2 = new FileReader(fileName2);
        FileReader fileReader3 = new FileReader(fileName3);

        int b;

        while ((b = fileReader2.read()) != -1) {
            fileWriter.write(b);
        }

        while ((b = fileReader3.read()) != -1) {
            fileWriter.write(b);
        }
        fileWriter.close();
        fileReader2.close();
        fileReader3.close();
    }
}
