package ua.javarush.task.sql.task10.task1001;

import org.hibernate.Session;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String query = "SELECT DISTINCT smth FROM Employee WHERE age > 18 ORDER BY smth";
            session.createQuery(query, String.class).list().forEach(System.out::println);
        }
    }
}