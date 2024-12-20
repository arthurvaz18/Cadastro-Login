package com.example.LocalSense.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroCliente {

    // Informações para o cadastro
    private String nomeCompleto;
    private String email;
    private String senha;
    private String telefone;

    @Id
    @Column(unique = true)
    private Integer cpf; // CPF como identificador único, do tipo Integer

    private int idade;
    private String cidade;

    // Informações para o login
    private String emailLogin;
    private String senhaLogin;

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
}
