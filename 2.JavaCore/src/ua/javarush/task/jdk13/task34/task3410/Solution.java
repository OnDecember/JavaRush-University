package ua.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* 
Обнулення об'єкту
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> Modifier.isPrivate(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive())
                .peek(field -> field.setAccessible(true))
                .forEach(field -> {
                    try {
                        field.set(object, null);
                    } catch (IllegalAccessException ignore) {
                    }
                });
    }
}
