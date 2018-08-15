package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream is = new FileInputStream(file1);
        int[] file1Array = new int[is.available()];

        for (int i = 0; i < file1Array.length; i++) {
            file1Array[i] = is.read();
        }

        is.close();
        is = new FileInputStream(file2);
        FileOutputStream os = new FileOutputStream(file1);

        while (is.available() > 0) {
            os.write(is.read());
        }

        for (int i = 0; i < file1Array.length; i++) {
            os.write(file1Array[i]);
        }

        os.close();
        is.close();
    }
}
