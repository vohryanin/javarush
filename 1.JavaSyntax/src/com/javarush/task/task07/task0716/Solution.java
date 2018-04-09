package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        /*list.add("роза"); //2
        list.add("мера"); //2
        list.add("лоза"); //2
        list.add("лира"); //2
        list.add("вода"); //2
        list.add("кора"); //2*/
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size();) {
//            System.out.println("В начале цикла i = " + i);
            if (list.get(i).contains("р") & list.get(i).contains("л")) {
                i++;
//                System.out.println("В р или л  i = " + i);
                continue;
            }
            else if (list.get(i).contains("р")) {
                list.remove(i);
//                System.out.println("После удаления слова i = " + i);
            }
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i+=2;
//                System.out.println("После добавления слова i = " + i);
            }
            else i++;
//            System.out.println("После оператора if i = " + i);
        }
        return list;
    }
}