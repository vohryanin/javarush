package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.color = "Black";
        this.age = 1;
        this.weight = 2;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.color = "Black";
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int age){
        this.name = name;
        this.color = "Black";
        this.age = age;
        this.weight = 2;
    }
    public Cat(int weight, String color){
        this.color = color;
        this.age = 1;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address){
        this.color = color;
        this.age = 1;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
