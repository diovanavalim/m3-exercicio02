package model;

public class Pessoa {
    private String nome;
    private String endereco;
    private String dataNascimento;
    private String formacao;

    public Pessoa(String nome, String endereco, String dataNascimento, String formacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
