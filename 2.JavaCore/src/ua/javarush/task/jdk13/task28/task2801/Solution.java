package ua.javarush.task.jdk13.task28.task2801;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишемо свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {

        private final AtomicInteger number = new AtomicInteger(1);
        public static AtomicInteger integer = new AtomicInteger(1);
        private final int factoryNumber;

        public AmigoThreadFactory() {
            factoryNumber = integer.getAndIncrement();
        }
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);
            thread.setName(String.format("%s-pool-%d-thread-%d", thread.getThreadGroup().getName(), factoryNumber, number.getAndIncrement()));
            return thread;
        }
    }
}
