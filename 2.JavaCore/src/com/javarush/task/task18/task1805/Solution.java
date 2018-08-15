package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list;

        list = getListFromFile();

        Set<Integer> uniq = new HashSet<Integer>();
        for (int i = 0; i < list.size(); i++) {
            uniq.add(list.get(i));
        }

        Integer[] uniqArray = uniq.toArray(new Integer[0]);
        Arrays.sort(uniqArray);

        for (int i = 0; i <uniqArray.length ; i++) {
            System.out.printf(String.valueOf(uniqArray[i]) + " ");
        }
    }

    public static List<Integer> getListFromFile() {
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            FileInputStream inputStream = new FileInputStream(reader.readLine());
            reader.close();

            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }


}
