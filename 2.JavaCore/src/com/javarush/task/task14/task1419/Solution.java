package com.javarush.task.task14.task1419;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] ints = {0, 1};
            System.out.println(ints[2]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException( );
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchElementException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ClassCastException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalAccessException();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
