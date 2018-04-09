package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfuther1 = new Human("дедушка1", true, 70);
        Human grandfuther2 = new Human("дедушка2", true, 80);
        Human grandmother1 = new Human("бабушка1", false, 71);
        Human grandmother2 = new Human("бабушка2", false, 71);
        Human father1 = new Human("отец", true, 50, grandfuther1, grandmother1);
        Human mother1 = new Human("мать", false, 51, grandfuther2, grandmother2);
        Human sun1 = new Human("сын1", true, 30, father1, mother1);
        Human sun2 = new Human("сын2", true, 28, father1, mother1);
        Human dauter1 = new Human("дочь1", true, 18, father1, mother1);

        System.out.println(grandfuther1);
        System.out.println(grandfuther2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(dauter1);
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human father, mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















