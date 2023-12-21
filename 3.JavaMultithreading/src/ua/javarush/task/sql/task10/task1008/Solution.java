package ua.javarush.task.sql.task10.task1008;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
setFirstResult і setMaxResults
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getSorted(3, 5).forEach(System.out::println);
    }

    public static List<Employee> getSorted(int offset, int limit) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee ORDER BY age", Employee.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.getResultList();
        }

    }
}