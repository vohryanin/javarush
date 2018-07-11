package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private byte age;
        private float wheight;
        private long height;
        private boolean sex;
        private double tors;

        public Human(byte age) {
            this.age = age;
        }
        public Human(String name) {
            this.name = name;
        }
        public Human(float wheight) {
            this.wheight = wheight;
        }
        public Human(long height){
            this.height = height;
        }
        public Human(boolean sex) {
            this.sex = sex;
        }
        public Human(double tors){
            this.tors = tors;
        }
        public Human(String name, byte age){
            this.name = name;
            this.age = age;
        }
        public Human(byte age, float wheight, double tors){
            this.age = age;
            this.wheight = wheight;
            this.tors = tors;
        }
        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, byte age, float wheight, long height, boolean sex, double tors){
            this.name = name;
            this.age = age;
            this.wheight = wheight;
            this.height = height;
            this.sex = sex;
            this.tors = tors;
        }
    }
}
