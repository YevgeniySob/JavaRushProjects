package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] r = new int[20];
        for (int i = 0; i < r.length; i++)
        {
            r[i] = Integer.parseInt(reader.readLine());
        }
        int  maximum = r[0];
        int  minimum = r[0];
        for (int i = 0; i < r.length; i++)
        {
            if (r[i] > maximum)
                maximum=r[i];
            if (r[i] < minimum)
                minimum = r[i];
        }

        System.out.println(maximum + " " + minimum);
    }
}
