package ua.javarush.task.jdk13.task34.task3408;

import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    private final Class<T> clazz;

    public Generator(Class<T> aClass) {
        this.clazz = aClass;
    }

    T newInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return clazz.getConstructor().newInstance();
    }
}
