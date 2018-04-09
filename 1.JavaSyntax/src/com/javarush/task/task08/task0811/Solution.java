package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        long msArrayListSetTime, msLinkedListSetTime;
        Date startTime, endTime;
        final int kolIterations = 10000;

        for (int i = 0; i < kolIterations; i++) {
            arrayList.add("0");
            linkedList.add("0");
        }

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            arrayList.get(i);
        }
        endTime = new Date();

        msArrayListSetTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            linkedList.get(i);
        }
        endTime = new Date();

        msLinkedListSetTime = endTime.getTime() - startTime.getTime();

        if (msArrayListSetTime <= msLinkedListSetTime) return arrayList;
        else return linkedList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        long msArrayListSetTime, msLinkedListSetTime;
        Date startTime, endTime;
        final int kolIterations = 10000;

        for (int i = 0; i < kolIterations; i++) {
            arrayList.add("0");
            linkedList.add("0");
        }

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            arrayList.set(i,"1");
        }
        endTime = new Date();

        msArrayListSetTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            linkedList.set(i, "0");
        }
        endTime = new Date();

        msLinkedListSetTime = endTime.getTime() - startTime.getTime();

        if (msArrayListSetTime <= msLinkedListSetTime) return arrayList;
        else return linkedList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        long msArrayListSetTime, msLinkedListSetTime;
        Date startTime, endTime;
        final int kolIterations = 10000;

        for (int i = 0; i < kolIterations; i++) {
            arrayList.add("0");
            linkedList.add("0");
        }

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            arrayList.add(i,"0");
        }
        endTime = new Date();
        msArrayListSetTime = endTime.getTime() - startTime.getTime();
        System.out.println(msArrayListSetTime);

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            linkedList.add(i,"0");
        }
        endTime = new Date();

        msLinkedListSetTime = endTime.getTime() - startTime.getTime();
        System.out.println(msLinkedListSetTime);

//        if (msArrayListSetTime <= msLinkedListSetTime) return arrayList;
//        else return linkedList;
        return linkedList;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        long msArrayListSetTime, msLinkedListSetTime;
        Date startTime, endTime;
        final int kolIterations = 10000;

        for (int i = 0; i < kolIterations; i++) {
            arrayList.add("0");
            linkedList.add("0");
        }

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            arrayList.remove(0);
        }
        endTime = new Date();

        msArrayListSetTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = 0; i < kolIterations; i++) {
            linkedList.remove(0);
        }
        endTime = new Date();

        msLinkedListSetTime = endTime.getTime() - startTime.getTime();

        if (msArrayListSetTime <= msLinkedListSetTime) return arrayList;
        else return linkedList;

    }

    public static void main(String[] args) {
//        System.out.println(getListForAddOrInsert());
    }
}
