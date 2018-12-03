package com.github.moraesofia.loinc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    /**
     * Status of the database connection.
     */
    protected static String status = "";

    /**
     * Url of the database server.
     */
    private static String url = "jdbc:mysql://db4free.net:3306/aulaoito";

    /**
     * Username to access the database.
     */
    private static String username = "sofia_m";

    /**
     * Password to access the database.
     */
    private static String password = "9vvBDxWYhAnDC5e";

    /**
     * Method that connects to the database.
     * 
     * @return database connection.
     */
    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, username, password);
            status = "Connection established";
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException | SQLException e) {
            status = e.getMessage();
            e.printStackTrace();
        }

        return c;
    }

}
