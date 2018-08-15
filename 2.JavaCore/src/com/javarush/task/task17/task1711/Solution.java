package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static volatile   String[] argsArray;

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        argsArray = args;

        switch (args[0]) {
            case "-c": synchronized (allPeople){
                create(); break;
            }
            case "-u": synchronized (allPeople) {
                update(); break;
            }
            case "-d": synchronized (allPeople) {
                delete(); break;
            }
            case "-i": synchronized (allPeople) {
                info(); break;
            }
        }
    }

    public static void create() {
        //-c name1 sex1 bd1 name2 sex2 bd2 ...
        //-c Миронов м 15/04/1990 Петров м 14/03/1992

        for (int i = 1; i < argsArray.length; i+=3) {
            String name = argsArray[i];
            String sex = argsArray[i+1];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            try {
                Date bd = dateFormat.parse(argsArray[i+2]);
                if (sex.equals("м")) {
                    allPeople.add(Person.createMale(name, bd));
                } else if (sex.equals("ж")) {
                    allPeople.add(Person.createFemale(name, bd));
                }
                System.out.println(allPeople.size()-1);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

    public static void update() {
        //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...

        for (int i = 1; i < argsArray.length; i+=4) {
            int index = Integer.parseInt(argsArray[i]);
            String name = argsArray[i+1];
            String sex = argsArray[i+2];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            try {

                Date bd = dateFormat.parse(argsArray[i+3]);
                allPeople.get(index).setBirthDay(bd);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            allPeople.get(index).setName(name);
            if (sex.equals("м")) allPeople.get(index).setSex(Sex.MALE);
            else if (sex.equals("ж")) allPeople.get(index).setSex(Sex.FEMALE);

        }
    }

    public static void delete() {
        //-d id1 id2 id3 id4 ...
        //-d 0 1

        int index = -1;

        for (int i = 1; i < argsArray.length; i++) {
            try {
                index = Integer.parseInt(argsArray[i]);
                allPeople.get(index).setName(null);
                allPeople.get(index).setSex(null);
                allPeople.get(index).setBirthDay(null);
            } catch (Exception e) {
                System.out.println("Значение параметра id не соответствует условию задачи");
            }
        }
    }

    public static void info() {
        //-i id1 id2 id3 id4 ...
        //-i 0 1
        int index = -1;

        for (int i = 1; i < argsArray.length; i++) {
            try {

                index = Integer.parseInt(argsArray[i]);
                String name = allPeople.get(index).getName();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String bd = dateFormat.format(allPeople.get(index).getBirthDay());

                String sex = null;
                if (allPeople.get(index).getSex().name().equals("MALE")) sex = "м";
                else if (allPeople.get(index).getSex().name().equals("FEMALE")) sex = "ж";
                else System.out.println("Параметр \"sex\" у записи с индексом " + index + " не соответствует условию задачи");

                System.out.println(name + " " + sex + " " + bd);

            } catch (Exception e) {
                System.out.println("Значение параметра id не соответствует условию задачи");
            }
        }

    }
}
