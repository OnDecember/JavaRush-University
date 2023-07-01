package ua.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread{
    public static final AtomicInteger integer = new AtomicInteger(1);

    {
        int number = integer.getAndIncrement();
        int maxPriority = getThreadGroup().getMaxPriority();
        number = Math.min(number, maxPriority);
        if (integer.get() > 10) integer.set(1);
        setPriority(number);
    }

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
    }

    @Override
    public void run() {

    }
}
