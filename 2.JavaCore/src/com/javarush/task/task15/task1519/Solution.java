package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        Double d;
        Short sh;
        Integer integer;
        Long l;
        while (!(line = reader.readLine()).equals("exit")) {
            try {
                if (line.contains(".") && ((d = Double.parseDouble(line)) instanceof Double)) print(d);
                else if ((l = Long.parseLong(line)) instanceof Long) {
                    if ((l > 0 && l < 128) && ((sh = Short.parseShort(line)) instanceof Short)) print((short) Short.parseShort(line));
                    else if (((l <= 0 || l >= 128) && l > -65535 && l < 65536) && ((integer = Integer.parseInt(line)) instanceof Integer)) print((Integer) Integer.parseInt(line));
                    else print(line.toString());
                } else print(line.toString());
            } catch (NumberFormatException e) {
                print(line.toString());
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
