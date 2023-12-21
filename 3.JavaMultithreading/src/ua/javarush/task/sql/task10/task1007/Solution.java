package ua.javarush.task.sql.task10.task1007;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Метод setParameterList
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE smth IN (:in) ORDER BY age", Employee.class);
            query.setParameterList("in", in);
            return query.getResultList();
        }
    }
}