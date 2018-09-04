package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        ArrayList<FileInputStream> fileInputStreams = new ArrayList<>();

        while (true) {
            fileName = reader.readLine();
            try {
                fileInputStreams.add(new FileInputStream(fileName));
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                for (int i = 0; i < fileInputStreams.size(); i++) {
                    fileInputStreams.get(i).close();
                }
                break;
            }
        }

    }
}
