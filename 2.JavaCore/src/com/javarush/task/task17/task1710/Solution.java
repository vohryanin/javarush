package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        String[] argsArray = args;

        //выбор операции CRUD
        if (argsArray[0].equals("-c")) createPerson(argsArray[1], argsArray[2], argsArray[3]);
        else if (argsArray[0].equals("-u")) updatePerson(argsArray[1], argsArray[2], argsArray[3], argsArray[4]);
        else if (argsArray[0].equals("-d")) deletePerson(argsArray[1]);
        else if (argsArray[0].equals("-i")) getInfoById(argsArray [1]);
        else System.out.println("Введенные параметры не соответствую условию задачи");
    }

    //-c Миронов м 15/04/1990
    public static void createPerson(String name, String sex, String bd) {
        //-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        //id соответствует индексу в списке.

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        try {
            Date birthday =  dateFormat.parse(bd);
            if (sex.equals("м")) {
                allPeople.add(Person.createMale(name, birthday));
            } else if (sex.equals("ж")) {
                allPeople.add(Person.createFemale(name, birthday));
            } else System.out.println("Параметр \"пол\" не соответствует условию задачи");
            System.out.println(allPeople.size()-1);
        } catch (ParseException e) {
            System.out.println("Формат введенной даты не соответствует условию задачи");
        }


    }

    //-u 1 Миронов м 15/04/1990
    public static void updatePerson(String id, String name, String sex, String bd) {

        int index = -1;
        try {
            index = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Значение параметра id не соответствует условию задачи");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            Date birthdat = dateFormat.parse(bd);
            allPeople.get(index).setBirthDay(birthdat);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        allPeople.get(index).setName(name);
        if (sex.equals("м")) allPeople.get(index).setSex(Sex.MALE);
        else if (sex.equals("ж")) allPeople.get(index).setSex(Sex.FEMALE);

    }

    //-d 1
    public static void deletePerson(String id) {
        //-d - производит логическое удаление человека с id, заменяет все его данные на null
        String name = null;
        Date bd = null;
        Sex sex = null;
        int index = -1;

        try {
            index = Integer.parseInt(id);
            allPeople.get(index).setName(name);
            allPeople.get(index).setSex(sex);
            allPeople.get(index).setBirthDay(bd);
        } catch (Exception e) {
            System.out.println("Значение параметра id не соответствует условию задачи");
        }

    }

    //-i 1
    public static void getInfoById(String id) {
        //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

        int index = -1;
        try {

            index = Integer.parseInt(id);
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
