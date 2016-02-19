package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(1, "a");
        print(2, 5);
        print(4);
        print("asd");
        print("rdw", 2);
    }

    //Напишите тут ваши методы
    public static void print(String a){}
    public static void print(String lol, int c){}
    public static void print(int x, int y){}
    public static void print(int y){}
    public static void print(int a, String b){}
}
