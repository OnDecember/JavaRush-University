package ua.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return values.listIterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        return values.add(o);
    }

    @Override
    public String poll() {
        if (values.size() == 0) {
            return null;
        }
        String e = values.get(0);
        values.remove(e);
        return e;
    }

    @Override
    public String peek() {
        if (values.size() == 0) {
            return null;
        }
        return values.get(0);
    }
}
