package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public Solution()
    {
    }

    public static class Human
    {
        String name;
        int age;
        int height;
        int weight;
        String nickName;
        String eyeColor;


        public Human(String name, int age, int height, int weight, String nickName, String eyeColore)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.nickName = nickName;
            this.eyeColor = eyeColore;
        }

        public Human(String name, int age, int height, int weight, String nickName)
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.nickName = nickName;
        }

        public Human(String name, int age, int height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String eyeColor, String name, int age)
        {
            this.eyeColor = eyeColor;
            this.name = name;
            this.age = age;
        }

        public Human(int age, int height, int weight)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String eyeColor)
        {
            this.eyeColor = eyeColor;
        }

        public Human(String name, String nickName)
        {
            this.name = name;
            this.nickName = nickName;
        }

        public Human(String eyeColor, int age)
        {
            this.eyeColor = eyeColor;
            this.age = age;
        }

        public Human(int height, int weight)
        {
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, String eyeColor, String nickName)
        {
            this.age = age;
            this.eyeColor = eyeColor;
            this.nickName = nickName;
        }
    }
}