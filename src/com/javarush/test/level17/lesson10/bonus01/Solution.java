package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String crud = args[0];
        if (args.length < 2 || args.length > 5 || args.length == 3)

            if (crud.equals("-c")) {
                if (args.length != 4) return;
                else addPerson(args[1], args[2], args[3]);
            }

        if (crud.equals("-u")) {
            if (args.length != 5) return;
            else parseID(args[1], args[2], args[3], args[4]);
        }

        if (crud.equals("-d")) {
            if (args.length != 2) return;
            else logicDeletion(args[1]);
        }

        if (crud.equals("-i")) {
            if (args.length != 2) return;
            else sendData(args[1]);

        }

    }

    private static Date addDate(String date) throws ParseException {
        Date bDate;
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
        bDate = format.parse(date);

        return bDate;
    }

    private static int getID(String id) {
        int index = Integer.parseInt(id);
        return index;
    }

    private static void addPerson(String name, String sex, String bDate) throws ParseException {
        Date date = addDate(bDate);
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, date));
            System.out.println(allPeople.size() - 1);
            return;
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, date));
            System.out.println(allPeople.size() - 1);
            return;
        }
    }

    private static void parseID(String id, String name, String sex, String bDate) throws ParseException {
        Date date = addDate(bDate);
        if (sex.equals("м")) {
            allPeople.add(getID(id), Person.createMale(name, date));
            return;
        }
        if (sex.equals("ж")) {
            allPeople.add(getID(id), Person.createFemale(name, date));
            return;
        }
    }

    private static void logicDeletion(String id) {
        Person person = Person.createFemale(null, null);
        person.setSex(null);
        person.setBirthDay(null);
        person.setName(null);


    }

    //-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
    private static void sendData(String id) {
        Person person = allPeople.get(getID(id));
        String pattern = "dd-MMM-yyyy";
        Date date = person.getBirthDay();
        SimpleDateFormat bd = new SimpleDateFormat(pattern, Locale.ENGLISH);
        String birth = bd.format(date);

        System.out.println(person.getName() + " " + person.getSex().toString().toLowerCase() + " " + birth);

    }


}



//To pass the test use the one below.

/*
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        Person person = null;
        if (args[0].equals("-c"))
        {
            if (args[2].equals("м"))
                person = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
            else if (args[2].equals("ж"))
                person = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        } else if (args[0].equals("-u"))
        {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
            if (args[3].equals("-м"))
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            else if (args[3].equals("ж"))
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
        } else if (args[0].equals("-d"))
        {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setBirthDay(null);
        } else if ((args[0].equals("-i")))
        {
            person = allPeople.get(Integer.parseInt(args[1]));
            String name = person.getName();
            String sex;
            if (person.getSex() == Sex.MALE)
                sex = "м";
            else
                sex = "ж";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = simpleDateFormat.format(person.getBirthDay());
            System.out.println(name + " " + sex + " " + date);
        }
    }
}*/
