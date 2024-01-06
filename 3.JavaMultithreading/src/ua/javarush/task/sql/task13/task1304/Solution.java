package ua.javarush.task.sql.task13.task1304;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.javarush.task.sql.task13.task1304.entities.Author;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "FROM Author WHERE fullName = :full_name";
            Query<Author> query = session.createQuery(hql, Author.class);
            query.setParameter("full_name", "Mark Twain");
            Author author = query.uniqueResult();
            author.getBooks().forEach(System.out::println);
        }
    }
}
