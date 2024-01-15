package ua.javarush.task.sql.task16.task1605;

import org.hibernate.Session;
import org.hibernate.Transaction;

/* 
Транзакції
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        switchToRemote();
    }

    public static void switchToRemote() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.getTransaction();
            String q1 = "UPDATE Employee SET smth = 'virtual ' + smth WHERE smth LIKE 'office%'";
            String q2 = "DELETE Task WHERE title = 'Buy coffee' OR title = 'Clean up the office'";
            transaction.begin();
            session.createQuery(q1).executeUpdate();
            session.createQuery(q2).executeUpdate();
            transaction.commit();
        }
    }
}