package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        List<Integer> contentFile = new ArrayList<>();

        while (inputStream.available() > 0) {
            contentFile.add(inputStream.read());
        }

        Collections.reverse(contentFile);

        for (int i = 0; i < contentFile.size(); i++) {
            outputStream.write(contentFile.get(i));
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
