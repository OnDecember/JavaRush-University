package ua.javarush.task.sql.task10.task1002;

import org.hibernate.Session;

/* 
Метод uniqueResult
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            return session.createQuery("FROM Employee WHERE smth = 'director'", Employee.class).uniqueResult();
        }
    }
}