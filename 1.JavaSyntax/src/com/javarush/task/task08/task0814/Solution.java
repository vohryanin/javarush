package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(10);
        set.add(21);
        set.add(31);
        set.add(41);
        set.add(51);
        set.add(61);
        set.add(71);
        set.add(81);
        set.add(91);
        set.add(11);
        set.add(231);

        System.out.println(set);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        for (Integer a : set) {
            if (a > 10) set.remove(a);
        }
        System.out.println(set);
        return set;
    }

    public static void main(String[] args) {
        createSet();
//        removeAllNumbersMoreThan10((HashSet<Integer>) createSet());
    }
}
