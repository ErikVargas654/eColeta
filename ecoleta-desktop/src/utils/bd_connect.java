package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bd_connect {

    public static Connection getConexao() {

        try {

            String url = "jdbc:postgresql://localhost:5432/eColeta";
            String usuario = "postgres";
            String senha = "senai";
            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {

            return null;

        }

    }

}
