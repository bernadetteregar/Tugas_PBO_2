package org.example;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:/SQLite/" + fileName;


        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Nama Driver adalah " + meta.getDriverName());
                System.out.println("Database baru telah dibuat.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        createNewDatabase("ecommerce.db");
    }
}
