package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

import com.javarush.test.level06.lesson08.task05.StringHelper;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String methodName = stackTraceElement[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String methodName = stackTraceElement[2].getMethodName();
        System.out.println(methodName);
        return methodName;

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String methodName = stackTraceElement[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String methodName = stackTraceElement[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String method = stackTraceElements[2].getMethodName();
        System.out.println(method);
        return method;
    }
}
