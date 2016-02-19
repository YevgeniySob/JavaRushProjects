package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.14, "forever");
        labels.put(1.73, "forever");
        labels.put(2.78, "forever");
        labels.put(9.01, "forever");
        labels.put(2.54, "forever");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
