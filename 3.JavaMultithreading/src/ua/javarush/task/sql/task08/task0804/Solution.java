package ua.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
Batching запитів
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root"
        );
        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < 5; i++) {
            statement.setString(1, "employee_" + i);
            statement.setInt(2, 30 + i);
            statement.setString(3, "i = " + i);
            statement.addBatch();
        }
        statement.executeBatch();
        statement.close();
        connection.close();
    }
}
