package controller;

import br.senai.sp.jandira.model.conexao;
import br.senai.sp.jandira.model.Produtos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    Conexao conexao = new Conexao();

    Connection connection = conexao.getConnection();

    public void listarProdutos() throws SQLException {

        Statement statement = connection.createStatement();
        String queryList = "SELECT * FROM produtos";

        ResultSet resultSet = statement.executeQuery(queryList);

        Produtos produto = new Produtos();

        while (resultSet.next()){
            produto.setIdProduto(resultSet.getInt("id_produto"));
            produto.setNomeProduto(resultSet.getString("nome_produto"));
            produto.setQuantidadeEstoque(resultSet.getInt("quantidade_estoque"));
            produto.setValor(resultSet.getDouble("valor"));
            produto.setFornecedor(resultSet.getString("fornecedor"));

            System.out.println("ID Produto: " + produto.getIdProduto());
            System.out.println("Nome do Produto: " + produto.getNomeProduto());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Fornecedor: " + produto.getFornecedor());
            System.out.println("/-----------------------------------------------------/");
        }
    }

    public void editarProduto(int quantidadeEstoque, String nomeProduto) throws SQLException {
        Statement statement = connection.createStatement();

        String queryUpdate = "UPDATE produtos SET quantidade_estoque= " + quantidadeEstoque + " WHERE nome_produto = '" + nomeProduto + "'";

        statement.executeUpdate(queryUpdate);
        System.out.println("Dados alterados com sucesso!!");
    }

    public void deletarProduto(String nomeProduto) throws SQLException {
        Statement statement = connection.createStatement();

        String queryDelete = "DELETE FROM produtos WHERE nome_produto='" + nomeProduto + "'";

        statement.executeUpdate(queryDelete);
        System.out.println("Produto " + nomeProduto + " deletado com sucesso!!");
    }

    public void cadastrarProduto(Produtos produto) throws SQLException {

        Statement statement = connection.createStatement();

        String queryCadastro = "INSERT INTO produtos (id_produto, nome_produto, quantidade_estoque, valor, fornecedor) values (" +
                produto.getIdProduto() + ",'" + produto.getNomeProduto() + "'," + produto.getQuantidadeEstoque() + "," +
                produto.getValor() + ",'" + produto.getFornecedor() + "')";

        statement.executeUpdate(queryCadastro);
        System.out.println("Produto cadastrado com sucesso!!");
    }

    public void consultarProduto(String nomeProduto) throws SQLException {
        Statement statement = connection.createStatement();

        String queryConsulta = "SELECT * FROM produtos WHERE nome_produto='" + nomeProduto + "'";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        List<Produtos> listConsulta = new ArrayList<>();

        while (resultSet.next()){
            Produtos produto = new Produtos();

            produto.setIdProduto(resultSet.getInt("id_produto"));
            produto.setNomeProduto(resultSet.getString("nome_produto"));
            produto.setQuantidadeEstoque(resultSet.getInt("quantidade_estoque"));
            produto.setValor(resultSet.getDouble("valor"));
            produto.setFornecedor(resultSet.getString("fornecedor"));

            listConsulta.add(produto);
        }

        for (Produtos produto : listConsulta) {
            System.out.println(produto.getIdProduto());
            System.out.println(produto.getNomeProduto());
            System.out.println(produto.getQuantidadeEstoque());
            System.out.println(produto.getValor());
            System.out.println(produto.getFornecedor());
            System.out.println("/--------------------------------/");
        }
    }
}
