package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 19 1980"));
        map.put("Ivanov", new Date("MAY 18 1980"));
        map.put("Osorkov", new Date("APRIL 17 1980"));
        map.put("Yanevsky", new Date("JULY 16 1980"));
        map.put("Shegelsky", new Date("DECEMBER 15 1980"));
        map.put("Oppa", new Date("JANUARY 14 1980"));
        map.put("Tkachenko", new Date("OCTOBER 12 1980"));
        map.put("Ostrovsky", new Date("JUNE 4 1980"));
        map.put("Sobolev", new Date("AUGUST 2 1980"));
        map.put("Miller", new Date("SEPTEMBER 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            int month = iterator.next().getValue().getMonth() + 1;
            if (month > 5 && month < 9)
                iterator.remove();
        }
    }

    public static void main(String[] args){

        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}
