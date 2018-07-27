package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly{
        void move(int x, int y, int h);
    }

    public interface Run{
        void move(int x, int y);
    }

    public interface Swim {
        void move(int x, int y, int z);
    }
}
