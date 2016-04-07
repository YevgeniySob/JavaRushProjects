package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        reader.close();

        List<Integer> list = new ArrayList<>();
        List<Integer> compareList = new ArrayList<>();

        while (stream.available() > 0) {
            int data = stream.read();
            list.add(data);
        }
        stream.close();
        int[] count = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) count[i]++;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x : count){
            if (min > x)
                min = x;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!compareList.contains(list.get(i))&&count[i]==min) compareList.add(list.get(i));
        }
        for (int x : compareList)
            System.out.println(x + " ");

    }
}
