package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream  = new FileInputStream(args[0]);

        HashMap<Character, Integer> map = new HashMap(); //<ASCII-код, количество>
        int asciiValue;
        int mapValue;
        boolean addedToMap;


        while (fileInputStream.available() > 0) {
             addedToMap = false;
            asciiValue = fileInputStream.read();

            if (map.size() > 0) {
                for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                    if (asciiValue == pair.getKey()) {
                        mapValue = pair.getValue() + 1;
                        pair.setValue(mapValue);
                        addedToMap = true;
                        break;
                    }
                }
                if (!addedToMap) {
                    map.put((char)asciiValue, 1);
                }
            } else {
                map.put((char)asciiValue, 1);
            }

        }

        fileInputStream.close();

        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>(map);
        printMap(treeMap);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey()
                    + " " + entry.getValue());
        }
    }
}
