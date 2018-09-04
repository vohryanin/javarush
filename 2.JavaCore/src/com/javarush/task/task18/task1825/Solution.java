package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String currentFile; // имя файла-части
        ArrayList<String> files = new ArrayList<>(); // список файлов-частей
        String baseFileName; //файл без суффикса [.partN] в папке, где находятся все считанные файлы
        String fileNameSuffix = ".partN";

        while (!(currentFile= reader.readLine()).equals("end")) {
            files.add(currentFile);
        }
        reader.close();

        Collections.sort(files);
        baseFileName = files.get(0).substring(0, (files.get(0).length() - fileNameSuffix.length()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(baseFileName)));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < files.size(); i++) {

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(files.get(i)));
            byte[] bytes = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bytes, 0,bufferedInputStream.available());
            bufferedInputStream.close();

            for (int j = 0; j < bytes.length; j++) {
                sb.append((char) bytes[j]);
            }
        }
        bufferedWriter.write(sb.toString());
        bufferedWriter.close();
    }


}
