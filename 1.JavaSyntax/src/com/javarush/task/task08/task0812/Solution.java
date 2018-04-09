package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int max = 0, sum = 1;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        //
//        System.out.println(linkedList);

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) == arrayList.get(i+1)) {
                sum++;
//                if ((i == (arrayList.size() - 1)) & (arrayList.get(i) == arrayList.get(arrayList.size()))) sum++;
                if (sum > max) max = sum;
//                System.out.println(i + " - " + sum);
            }
            else if (sum > max) {
                max = sum;
                sum = 1;
            }
            else sum = 1;
        }
        System.out.println(max);
    }
}