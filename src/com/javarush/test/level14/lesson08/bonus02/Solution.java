package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine;
        int firstN = Integer.parseInt(readLine = reader.readLine());
        int secondN = Integer.parseInt(readLine = reader.readLine());

        nod(firstN, secondN);
    }

    public static void nod(int a, int b)
    {
        if (a > b) a = a - b;
        else b = b - a;
        if (b == 0)
        {
            System.out.println(a);
            return;
        }
        nod(a, b); //рИкурсивно вызываю функцию с Валерой и его Машей, где она весит 160кг, а он трогает её матку.
    }
}
