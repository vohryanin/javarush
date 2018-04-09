package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public void initialize(String name){
        this.name = name;
        this.color = "Black";
        this.age = 1;
        this.weight = 1;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.color = "Black";
        this.age = age;
        this.weight = 1;
    }
    public void initialize(int weight, String color){
        this.color = color;
        this.age = 1;
        this.weight = weight;
    }
    public void initialize(int weight, String color, String address){
        this.color = color;
        this.age = 1;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
