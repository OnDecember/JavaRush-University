package ua.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection  connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String weight = String.valueOf(resultSet.getFloat("weight"));
            if(resultSet.wasNull()) {
                weight = null;
            }
            System.out.println(name + " " + weight);
        }
        statement.close();
        connection.close();
    }
}
