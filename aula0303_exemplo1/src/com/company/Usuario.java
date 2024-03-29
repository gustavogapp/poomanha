package com.company;

public class Usuario {
    //Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;

    //Métodos
    public void provarExistencia() {
        System.out.println("Usuário: " + nome + " está no sistema");
    }

    //Métodos getters and setters
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
