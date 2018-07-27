package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String string;
        do {
            string = reader.readLine();
            writer.write(string);
            writer.newLine();
        } while (!string.equals("exit"));
        reader.close();
        writer.close();
    }
}
