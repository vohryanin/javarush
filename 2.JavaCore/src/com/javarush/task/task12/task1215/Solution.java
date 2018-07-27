package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Мурзик";
        }

        public Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog {
        public String getName() {
            return "Борбоссо";
        }

        public Dog getChild() {
            return new Dog();
        }
    }

}
