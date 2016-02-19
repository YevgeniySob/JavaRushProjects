package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly{
        int wingsSpeed(int a);
    }
    public interface Run{
        int runSpeed(int a);
    }
    public interface Swim{
        int speed(int a);
    }
//add interfaces here - добавь интерфейсы тут

}
