package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] arrayOfLength = {5, 2, 4, 7, 0}; //содержит размерности вложенных в список массивов
        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < arrayOfLength.length; i++) {
//            System.out.println("Создаем массив " + i + " размерностью " + arrayOfLength[i]);
            int[] array = new int[arrayOfLength[i]];
            for (int j = 0; j < array.length; j++) {
//                System.out.println("Добавляем элемент номер " + j + " в массив " + i);
                array[j] = i + j;
            }
            arrayList.add(array);
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
