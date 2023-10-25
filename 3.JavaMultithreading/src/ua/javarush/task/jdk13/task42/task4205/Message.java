package ua.javarush.task.jdk13.task42.task4205;

import java.util.Comparator;
import java.util.concurrent.*;

public class Message implements Delayed {
    private Integer messageId;
    private String messageText;
    private long lifetime;
    private long endTime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
        this.endTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(lifetime, TimeUnit.MILLISECONDS);
    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(endTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long res = this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        if (res > 0) return 1;
        if (res < 0) return -1;
        return 0;
    }
}
