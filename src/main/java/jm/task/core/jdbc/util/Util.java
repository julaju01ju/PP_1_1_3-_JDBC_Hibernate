package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/daotest";
        String userName="root";
        String password ="root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try( Connection connect = DriverManager.getConnection(url, userName, password)) {
            System.out.println( "We are connect");
        }

    }

    public static Connection getConnection() {
        return null;
    }
}





