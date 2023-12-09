package ua.javarush.task.sql.task07.task0709;

import java.sql.*;
import java.time.LocalDate;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String weight = resultSet.getObject("weight", String.class);
            LocalDate birthday = resultSet.getObject("birthday", LocalDate.class);
            String inn = resultSet.getObject("inn", String.class);
            System.out.println(name + " " + weight + " " + birthday + " " + inn);
        }
        statement.close();
        connection.close();
    }
}
