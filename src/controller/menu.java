package controller;

import br.senai.sp.jandira.model.Clientes;
import br.senai.sp.jandira.model.Produtos;
import model.Produtos;
import model.clientes;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("/----------- Bem Vindo -----------/");
            System.out.println("-----------------------------------");
            System.out.println("1- Listar Clientes");
            System.out.println("2- Cadastrar Cliente");
            System.out.println("3- Deletar Cliente (CPF)");
            System.out.println("4- Pesquisar Cliente (CPF)");
            System.out.println("5- Listar Produtos");
            System.out.println("6- Cadastrar Produto");
            System.out.println("7- Editar Produto (Quantidade em Estoque)");
            System.out.println("8- Deletar Produto");
            System.out.println("9- Pesquisar Produto (Nome)");
            System.out.println("10- Sair");
            System.out.println("-----------------------------------");
            System.out.print("\nOpção: ");

            Scanner scanner = new Scanner(System.in);

            int userOption = scanner.nextInt();
            scanner.nextLine();

            ClienteController clienteController = new ClienteController();
            ProdutoController produtoController = new ProdutoController();

            switch (userOption){
                case 1:
                    clienteController.listarClientes();
                    break;

                case 2:
                    clientes newcliente = new clientes();
                    newcliente.cadastrarCliente();

                    clienteController.cadastrarCliente(newcliente);
                    break;

                case 3:
                    System.out.print("Digite o CPF do cliente que deseja deletar: ");
                    int cpfDelete = scanner.nextInt();
                    scanner.nextLine();
                    clienteController.deletarCliente(cpfDelete);
                    break;

                case 4:
                    System.out.print("Digite o CPF do cliente que deseja pesquisar: ");
                    int cpfConsulta = scanner.nextInt();
                    scanner.nextLine();
                    clienteController.consultarCliente(cpfConsulta);
                    break;

                case 5:
                    produtoController.listarProdutos();
                    break;

                case 6:
                    Produtos newProduto = new Produtos();
                    newProduto.cadastrarProduto();

                    produtoController.cadastrarProduto(newProduto);
                    break;

                case 7:
                    System.out.print("Digite o nome do produto que deseja editar: ");
                    String nomeProdutoUpdate = scanner.nextLine();
                    System.out.print("Digite a nova quantidade em estoque: ");
                    int newQuantidadeEstoque = scanner.nextInt();
                    scanner.nextLine();

                    produtoController.editarProduto(newQuantidadeEstoque, nomeProdutoUpdate);
                    break;

                case 8:
                    System.out.print("Digite o nome do produto que deseja deletar: ");
                    String nomeProdutoDelete = scanner.nextLine();
                    produtoController.deletarProduto(nomeProdutoDelete);
                    break;

                case 9:
                    System.out.print("Digite o nome do produto que deseja pesquisar: ");
                    String nomeProdutoConsulta = scanner.nextLine();
                    produtoController.consultarProduto(nomeProdutoConsulta);
                    break;

                case 10:
                    continuar = false;
                    break;
            }
        }
    }
}
