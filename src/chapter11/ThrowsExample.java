package chapter11;

import java.net.Socket;
import java.sql.*;

public class ThrowsExample {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("", "", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("");
        while(resultSet.next()) {
            resultSet.getString("");
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void findClass(Exception exception) {
        try {
            if (exception instanceof ClassNotFoundException) {
                throw new ClassNotFoundException();
            }
            if (exception instanceof IllegalArgumentException) {
                throw new IllegalArgumentException();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 없습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("매개값이 올바르지 않습니다.");
        }
//        Class.forName("");
    }
}
