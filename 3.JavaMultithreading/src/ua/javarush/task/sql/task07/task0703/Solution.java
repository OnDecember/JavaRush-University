package ua.javarush.task.sql.task07.task0703;

import java.sql.*;

/* 
Виконання запиту
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM employee");
        statement.close();
        connection.close();

    }
}
