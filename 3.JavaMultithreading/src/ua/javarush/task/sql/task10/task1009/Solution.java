package ua.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Функції в HQL
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT SUM(salary) FROM Employee", Long.class);
            return query.uniqueResult();
        }
    }

    public static Double getAverageAge() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Double> query = session.createQuery("SELECT AVG(age) FROM Employee", Double.class);
            return query.uniqueResult();
        }
    }
}