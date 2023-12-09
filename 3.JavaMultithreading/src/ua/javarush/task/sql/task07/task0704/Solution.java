package ua.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
Використання результату запиту 1
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
        statement.close();
        connection.close();
    }
}
