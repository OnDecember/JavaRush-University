package ua.javarush.task.sql.task13.task1303;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.javarush.task.sql.task13.task1303.entities.Publisher;

import java.util.List;

/* 
Знову книжки
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Publisher> publishers;

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "SELECT DISTINCT b.publisher FROM Book b WHERE b.author.fullName = :AUTHOR_FULLNAME";
            Query<Publisher> query = session.createQuery(hql, Publisher.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            publishers = query.list();
        }

        publishers.stream().map(Publisher::getName).forEach(System.out::println);
    }
}
