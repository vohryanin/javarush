package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grangFutherName = reader.readLine();
        Cat catGrandFuther = new Cat(grangFutherName);

        String grangMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grangMotherName);

        String fatherName = reader.readLine();
        Cat catFuther = new Cat(fatherName, null, catGrandFuther);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catMother, catFuther);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFuther);

        System.out.println(catGrandFuther);
        System.out.println(catGrandMother);
        System.out.println(catFuther);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent, parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat (String name, Cat parent, Cat parent2){
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {

            if (parent == null & parent2 == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parent == null & parent2 != null)
                return "Cat name is " + name + ", no mother, father is " + parent2.name;
            else if (parent != null & parent2 == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father";
            else if (parent != null & parent2 != null)
                return "Cat name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
            else if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }

}
