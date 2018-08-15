package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> inputStreams = new ArrayList<>();

        do {
            FileInputStream currentInpuStream = new FileInputStream(reader.readLine());
            if (currentInpuStream.available() < 1000) {
                inputStreams.add(currentInpuStream);
                break;
            }
            else inputStreams.add(currentInpuStream);
        } while (true);

        for (int i = 0; i < inputStreams.size(); i++) {
            inputStreams.get(i).close();
        }
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
