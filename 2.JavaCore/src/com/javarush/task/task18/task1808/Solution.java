package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            FileInputStream inputStream = new FileInputStream(reader.readLine());
            FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
            FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int halfKolByte = inputStream.available() / 2;
        while (inputStream.available() > 0) {
            if (inputStream.available() <= halfKolByte) {
                outputStream2.write(inputStream.read());
            } else outputStream1.write(inputStream.read());
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
