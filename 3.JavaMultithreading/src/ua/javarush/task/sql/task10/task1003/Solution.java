package ua.javarush.task.sql.task10.task1003;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.createQuery("UPDATE Employee SET smth = CONCAT('senior ', smth)").executeUpdate();
            transaction.commit();
        }
    }
}