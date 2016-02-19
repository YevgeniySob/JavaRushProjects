package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Tommy", true, 65, new ArrayList<Human>());
        Human child2 = new Human("Bobby", true, 65, new ArrayList<Human>());
        Human child3 = new Human("Liza", false, 65, new ArrayList<Human>());
        ArrayList<Human> child = new ArrayList<>();
        child.add(child1);
        child.add(child2);
        child.add(child3);

        Human Pa1 = new Human("Alexander", true, 65, child);
        Human Ma1 = new Human("Lilia", false, 65, child);
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        parents1.add(Pa1);
        parents2.add(Ma1);

        Human grandPa1 = new Human("Donald", true, 65, parents1);
        Human grandPa2 = new Human("Lucas", true, 65, parents2);
        Human grandMa1 = new Human("Debby", false, 65, parents1);
        Human grandMa2 = new Human("Linda", false, 65, parents2);

        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(child3.toString());
        System.out.println(Pa1.toString());
        System.out.println(Ma1.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children ){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }
}
