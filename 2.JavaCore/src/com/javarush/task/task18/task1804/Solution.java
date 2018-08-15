package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map;// = new HashMap<>(); // <byteValue, kolOfRepeat>
        int minValueIntoMap = 0;
        map = createMapFromFile();
        minValueIntoMap = getMinValueFromMap(map);
        printKeysWithMaxValueIntoMap(map, minValueIntoMap);
    }

    public static Map<Integer, Integer> createMapFromFile() throws IOException {
        Map<Integer, Integer> map = new HashMap<>(); // <byteValue, kolOfRepeat>
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
        return map;
    }

    public static int getMinValueFromMap(Map<Integer, Integer> map) {
        int minValueIntoMap = 0;
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            if (minValueIntoMap == 0) minValueIntoMap = pair.getValue();
            if (minValueIntoMap > pair.getValue()) minValueIntoMap = pair.getValue();
        }
        return minValueIntoMap;
    }

    public static void printKeysWithMaxValueIntoMap(Map<Integer, Integer> map, int minValueIntoMap) {
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            if (pair.getValue() == minValueIntoMap) {
                System.out.printf(pair.getKey() + " ");
            }
        }
    }
}
