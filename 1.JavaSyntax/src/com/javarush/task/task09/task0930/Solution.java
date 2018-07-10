package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i <array.length-1 ; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (isNumber(array[i]) && isNumber(array[j])) { //оба элемента - числа, сравниваем их между собой, меняем местами в случае необходимости
                        Integer a = Integer.parseInt(array[i]);
                        Integer b = Integer.parseInt(array[j]);
                        Integer c;
                        if (a < b) {
                            c = a;
                            a = b;
                            b = c;
                            array[i] = a.toString();
                            array[j] = b.toString();
                            flag = true;
                        }
                    }
                    else if (!isNumber(array[i]) && !isNumber(array[j])) { //оба элемента - строки, сравниваем их между собой, меняем местами в случае необходимости
                        if (isGreaterThan(array[i], array[j])){
                            String tmpString = array[i];
                            array[i] = array[j];
                            array[j] = tmpString;
                            flag = true;
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
