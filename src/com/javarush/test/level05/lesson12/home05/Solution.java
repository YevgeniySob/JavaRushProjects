package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int x;
        int sum = 0;
        while (true)
        {
            s = reader.readLine();
            if (s.equals("сумма"))
            {
                break;
            } else
                x = Integer.parseInt(s);

            sum += x;
        }
        System.out.println(sum);
    }
}
