package ua.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Отримання дати
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            LocalDateTime created = resultSet.getObject("created", LocalDateTime.class);

            System.out.printf("%s %s%n", name, created);
        }
        statement.close();
        connection.close();
    }
}
