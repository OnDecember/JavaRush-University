package ua.javarush.task.sql.task14.task1404;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
JOIN FETCH
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Task> tasks = getTasks();
        tasks.forEach(System.out::println);
    }

    public static List<Task> getTasks() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "SELECT DISTiNCT t FROM Task t LEFT JOIN FETCH t.employees ORDER BY t.deadline";
            Query<Task> query = session.createQuery(hql, Task.class);
            return query.list();
        }
    }
}