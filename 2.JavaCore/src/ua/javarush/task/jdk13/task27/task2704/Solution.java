package ua.javarush.task.jdk13.task27.task2704;

/* 
Прибираємо deadlock
*/

public class Solution {
    public void safeMethod(Object obj1, Object obj2) {
        int first = obj1.hashCode();
        int second = obj2.hashCode();

        Object one = first > second ? obj1 : obj2;
        Object two = first < second ? obj1 : obj2;
        synchronized (one) {
            longTimeMethod();
            synchronized (two) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final Solution solution = new Solution();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o1, o2);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o2, o1);
            }
        }.start();
    }
}
