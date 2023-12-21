package ua.javarush.task.sql.task10.task1006;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Параметри до запитів
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getBetween(25, 32).forEach(System.out::println);
    }

    public static List<Employee> getBetween(int from, int to) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE age > :from AND age < :to ORDER BY age", Employee.class);
            query.setParameter("from", from);
            query.setParameter("to", to);
            return query.getResultList();
        }

    }
}