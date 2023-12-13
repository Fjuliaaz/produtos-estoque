package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexao {

    private String servidor, banco, usuario, senha;
    public Connection conexao;

    public Conexao() {
        this.servidor = "Localhost";
        this.banco = "db_estoque";
        this.usuario = "root";
        this.senha = "bcd127";

    }

    public void connectDriver() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.servidor + "/" + this.banco, this.usuario, this.senha);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public Connection getConnection() {
        connectDriver();
        return conexao;
    }
}