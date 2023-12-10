package ua.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Робота з транзакціями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root"
        );
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
        statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");
        connection.commit();
        statement.close();
        connection.close();
    }
}
