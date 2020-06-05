package com.jdbc.day1;
import java.net.URI;
import java.sql.*;

public class InsertAndDeleteTest {

    static String URL = "jdbc:oracle:thin:@35.173.182.240:1521:xe";
    static String username = "hr";
    static String password = "hr";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, username, password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
// JDBC uzerinden avtomatik add edir ver silirse.
        String INSERT_QUERY = "INSERT INTO employees VALUES(228, 'Hasann', 'Mammadovv', 'hasans@cybertek.com', '777-777-7777', SYSDATE, 'SDET', 14999, 0, NULL, NULL)";
        String DELETE_QUERY = "DELETE FROM employees WHERE employee_id = 228";
// 
        ResultSet resultSet = statement.executeQuery(DELETE_QUERY);

        resultSet.close();
        statement.close();
        connection.close();
    }
}