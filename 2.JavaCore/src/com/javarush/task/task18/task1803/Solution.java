package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static Map<Integer, Integer> map = new HashMap<>(); // <byteValue, kolOfRepeat>
    public static int maxValueIntoMap = 0;

    public static void main(String[] args) throws Exception {
        createMapFromFile();
        getMaxValueFromMap();
        printKeysWithMaxValueIntoMap();
    }

    public static void createMapFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int currentByteValue;

        while (inputStream.available() > 0) {

            if (!map.isEmpty()) {
                currentByteValue = inputStream.read();
                boolean isNewKey = true;
                for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
                    if (pair.getKey() == currentByteValue) {
                        int currentValue = pair.getValue();
                        pair.setValue(currentValue+1);
                        isNewKey = false;
                    }
                }
                if (isNewKey) map.put(currentByteValue, 1);

            } else {
                map.put(inputStream.read(), 1);
            }
        }
        reader.close();
        inputStream.close();
    }

    public static void getMaxValueFromMap() {
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            if (maxValueIntoMap < pair.getValue()) maxValueIntoMap = pair.getValue();
        }
    }

    public static void printKeysWithMaxValueIntoMap() {
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            if (pair.getValue() == maxValueIntoMap) {
                System.out.printf(pair.getKey() + " ");
            }
        }
    }
}
