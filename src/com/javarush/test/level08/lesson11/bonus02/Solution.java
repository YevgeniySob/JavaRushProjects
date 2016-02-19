package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую фуtest.level08.lesson11.bonus02;нкциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> cityAndLastName = new HashMap<>();

        while (true)
        {

            String key = reader.readLine();
            if (key.isEmpty())
                break;
            else{
                String value = reader.readLine();
                cityAndLastName.put(key, value);
            }
        }

        String nameOfTheCity = reader.readLine();

        if (nameOfTheCity.equals(cityAndLastName.containsKey(nameOfTheCity)));
        {
            String familySecondName = cityAndLastName.get(nameOfTheCity);
            System.out.println(familySecondName);
        }
    }
}
