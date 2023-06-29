package ua.javarush.task.jdk13.task16.task1625;

/* 
Знову interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }


    public static class TestThread extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }
}