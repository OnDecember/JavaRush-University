package ua.javarush.task.jdk13.task28.task2806;

import java.util.*;
import java.util.concurrent.FutureTask;

/* 
Паралельний парсинг
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lines.add(scanner.nextLine());
        }

        Map<Thread, FutureTask<Link>> tasks = new HashMap<>();
        for (String line : lines) {
            ParseLinkTask parseLinkTask = new ParseLinkTask(line);
            FutureTask<Link> task = new FutureTask<>(parseLinkTask);
            Thread thread = new Thread(task);
            tasks.put(thread, task);
            thread.start();
        }

        for (Map.Entry<Thread, FutureTask<Link>> entry : tasks.entrySet()) {
            entry.getKey().join();
            System.out.println(entry.getValue().get());
        }
    }
}