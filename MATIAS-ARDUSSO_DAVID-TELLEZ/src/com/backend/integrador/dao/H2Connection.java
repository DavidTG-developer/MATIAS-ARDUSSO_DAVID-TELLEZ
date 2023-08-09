package com.backend.integrador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.H2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/integrador", "sa", "sa");
    }
}