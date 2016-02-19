package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution{
    public static void main(String[] args){

        Human vasya = new Human("vasya", true, 65, null, null);
        Human petya = new Human("petya", true, 56, null, null);
        Human sasha = new Human("sasha", false, 57, null, null);
        Human katya= new Human("katya", false, 63, null, null);
        Human jora = new Human("jora", true, 40, petya, katya);
        Human sveta = new Human("sveta", false, 38, vasya, sasha);
        Human max = new Human("mac", true, 17, jora, sveta);
        Human paul = new Human("paul", true, 12, jora, sveta);
        Human lora = new Human("lora", false, 11, jora, sveta);

        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(sasha);
        System.out.println(katya);
        System.out.println(jora);
        System.out.println(sveta);
        System.out.println(max);
        System.out.println(paul);
        System.out.println(lora);

    }

    public static class Human{
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString(){
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
