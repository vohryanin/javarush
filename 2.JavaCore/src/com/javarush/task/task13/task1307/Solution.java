package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject//допишите здесь ваш код
    {
        @Override
        public SimpleObject getInstance() {
            return null;
        }

        public String getInstance(String string) {
            return string;
        }
    }
}