package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    //напишите тут ваш код
    Cat(){
        Cat.catCount++;
    }
    protected void finalize() {
        Cat.catCount--;
    }

    public static void main(String[] args) {

    }
}