package ua.javarush.task.sql.task16.task1604;

import org.hibernate.Session;

import java.util.List;

/* 
Метод list
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            List<Object[]> list = session.createNativeQuery("SELECT id, title, created_time FROM project").list();
            list.forEach(o -> System.out.printf("%s, %s, %s%n", o[0], o[1], o[2]));
        }
    }
}