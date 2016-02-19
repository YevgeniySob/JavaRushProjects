package com.javarush.test.level09.lesson11.home05;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] charArray = s.toCharArray();
        String vowels = "";
        String consonants = "";

        for (int i=0;i<charArray.length;i++) {
            if (isVowel(charArray[i])) {
                vowels = vowels + charArray[i]+ " ";
            }
            else if (charArray[i]==' ')  { continue;}
            else consonants = consonants + charArray[i] + " ";
        }

        System.out.println(vowels);
        System.out.println(consonants);


    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}