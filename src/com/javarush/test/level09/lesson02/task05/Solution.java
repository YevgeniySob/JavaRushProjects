package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

import java.util.Map;

public class Solution
{
    public static int getStackTraceDeep()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int result = 0;
        for (StackTraceElement element : stackTraceElements){
            result++;
        }
        System.out.println(result);
        return result;

    }
}
