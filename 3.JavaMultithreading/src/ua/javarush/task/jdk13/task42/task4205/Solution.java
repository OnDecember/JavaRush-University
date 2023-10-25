package ua.javarush.task.jdk13.task42.task4205;

import java.util.Random;
import java.util.concurrent.DelayQueue;

/* 
Черга повідомлень
*/

public class Solution {
    private static final DelayQueue<Message> QUEUE = new DelayQueue<>();
    private static final int COUNT = 10;
    private static final long MULTIPLIER = 100;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= COUNT; i++) {
            long lifetime = getRandomInt(1, COUNT) * MULTIPLIER;
            Message message = new Message(i, "test " + i, lifetime);
            QUEUE.offer(message);
            System.out.println("Повідомлення id#" + message.getMessageId() +
                    " додано в чергу, термін зберігання спливає через " + message.getLifetime() + " мс");
        }

        while (!QUEUE.isEmpty()) {
            try {
                Message message = QUEUE.take();
                System.out.println("Повідомлення id#" + message.getMessageId() +
                        ". Термін зберігання (" + message.getLifetime() + " мс) минув! Повідомлення видалено з черги повідомлень");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
