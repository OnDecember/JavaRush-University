package ua.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
Ім'я і тип колонки
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee limit 1");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            System.out.printf("%s(%s) ", metaData.getColumnName(column), metaData.getColumnTypeName(column));
        }
        statement.close();
        connection.close();
    }
}
