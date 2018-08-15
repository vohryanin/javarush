package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        ArrayList<ReadThread> readThreads = new ArrayList<>();

        while (!(filename = reader.readLine()).equals("exit")) {
            readThreads.add(new ReadThread(filename));
        }
        reader.close();

        for (int i = 0; i < readThreads.size(); i++) {
            readThreads.get(i).start();
        }
        System.out.println();
    }

    public static class ReadThread extends Thread {
        private String filename;
        private HashMap<Integer, Integer> fileBytes = new HashMap<>(); //<Byte, количество вхождений>
        private int currentByte;
        private int kolOfCurrentByte;

        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        @Override
        public void run() {

            try {
                FileInputStream fileInputStream = new FileInputStream(filename);

                while ((currentByte = fileInputStream.read()) != -1) {
                    if (!fileBytes.isEmpty()) {
                        for(Map.Entry<Integer, Integer> pair: fileBytes.entrySet()) {
                            kolOfCurrentByte = pair.getValue();
                            if (pair.getKey() == currentByte) {
                                pair.setValue(kolOfCurrentByte + 1);
                                break;
                            }
                        }
                    } else fileBytes.put(currentByte, 1);
                }

                fileInputStream.close();
                getMaxByte();
                Thread.currentThread().interrupt();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void getMaxByte() {
            int maxByte = 0;
            int maxValue = 0;

            for (Map.Entry<Integer, Integer> pair: fileBytes.entrySet()) {
                if (pair.getValue() > maxValue) {
                    maxValue = pair.getValue();
                    maxByte = pair.getKey();
                }
            }

            resultMap.put(filename, maxByte);
        }
    }
}
