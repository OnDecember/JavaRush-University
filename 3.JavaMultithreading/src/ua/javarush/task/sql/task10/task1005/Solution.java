package ua.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import ua.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
join в HQL
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "FROM Book WHERE author.fullName = 'Mark Twain' AND publisher.name = 'Chatto & Windus'";
            books = session.createQuery(hql, Book.class).getResultList();
        }

        books.forEach(System.out::println);
    }
}