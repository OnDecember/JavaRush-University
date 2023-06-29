package ua.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1., "1");
        labels.put(2., "1");
        labels.put(3., "1");
        labels.put(4., "1");
        labels.put(5., "1");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
