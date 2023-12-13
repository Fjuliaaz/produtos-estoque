package model;

import java.util.Scanner;

public class Produtos {

    private String nomeProduto, fornecedor;
    private int idProduto = 0;
    private int quantidadeEstoque;
    private double valor;

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        this.nomeProduto = scanner.nextLine();
        System.out.print("Informe a quantidade em estoque: ");
        this.quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o valor do produto: ");
        this.valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Informe o fornecedor do produto: ");
        this.fornecedor = scanner.nextLine();
        System.out.println("/----------------------------------/");
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}