package model;

import java.util.Scanner;

public class clientes {

    private String nome, email;
    private int idCliente = 0;
    private int cpf, telefone;

    public void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do cliente: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe o cpf do cliente: ");
        this.cpf = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o email do cliente: ");
        this.email = scanner.nextLine();
        System.out.print("Informe o telefone do cliente: ");
        this.telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("/----------------------------------/");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}