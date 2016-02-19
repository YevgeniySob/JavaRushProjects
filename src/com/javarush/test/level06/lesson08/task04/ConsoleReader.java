package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.io.StringReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        return read;

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readInt = reader.readLine();
        int num = Integer.parseInt(readInt);
        return num;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readDouble = reader.readLine();
        double doubleNum = Double.parseDouble(readDouble);
        return doubleNum;
    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readBool = reader.readLine();
        boolean bool = Boolean.parseBoolean(readBool);
        return bool;

    }
}
