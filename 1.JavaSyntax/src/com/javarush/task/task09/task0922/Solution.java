package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringDate = reader.readLine().toString();
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        Date date = new Date();

        try {
            date = inputDateFormat.parse(stringDate);
        } catch (Throwable t) {
            System.out.println("Введите дату в формате yyyy-MM-dd");
            t.printStackTrace();
        }
        System.out.println(outputDateFormat.format(date).toUpperCase());
    }
}
