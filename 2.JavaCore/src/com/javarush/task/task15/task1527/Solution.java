package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<String> values = new ArrayList<String>();
        String objValue = "";
        try {
            String url = reader.readLine();
            List<String> list = new ArrayList<String>(Arrays.asList(url.substring(url.indexOf('?')+1).split("&")));
            for (int i = 0; i < list.size(); i++) {
                String key = getKey(list.get(i), '=');
                System.out.printf(key + " ");
                if (key.equals("obj")) {
                    objValue = getValue(list.get(i), '=');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        if (!objValue.equals("")) {
//            if (objValue.contains(".")) {
            try {
                Double d;
                if ((d = Double.parseDouble(objValue)) instanceof Double) {
                    alert(d);
                } else alert(objValue);
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static String getKey(String element, char splitter) {
        if (element.contains("=")) {
            return element.substring(0, element.indexOf(splitter));
        } else return element;
    }

    private static String getValue(String element, char splitter) {
        return element.substring(element.indexOf(splitter)+1);
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
