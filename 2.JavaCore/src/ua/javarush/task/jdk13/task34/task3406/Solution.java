package ua.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/* 
Класні методи
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> map = new HashMap<>();
        for (Class<?> clazz : classes) {
            map.put(clazz, Arrays.stream(clazz.getDeclaredMethods())
                            .filter(method -> Modifier.isStatic(method.getModifiers()))
                            .map(Method::getName)
                            .collect(Collectors.toSet()));
        }
        return map;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
