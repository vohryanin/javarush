package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Float> floats = new ArrayList<Float>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean e = true;

        while (e) {
            try {
                floats.add(Float.parseFloat(reader.readLine()));
            } catch (Exception e1) {
                for (int i=0; i <= floats.size() - 1; i++) {
                    System.out.println(floats.get(i));
                }
                e = false;
            }
        }
    }
}
