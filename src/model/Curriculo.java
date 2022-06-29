package model;

import util.Documento;

import java.util.ArrayList;

public class Curriculo implements Documento {
    String nome;
    String endereco;
    String dataNascimento;
    String formacao;
    ArrayList<String> experiencias;
    ArrayList<String> qualificacoes;

    public Curriculo(String nome, String endereco, String dataNascimento, String formacao, ArrayList<String> experiencias, ArrayList<String> qualificacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.experiencias = experiencias;
        this.qualificacoes = qualificacoes;
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

    public ArrayList<String> getExperiencia() {
        return this.experiencias;
    }

    public ArrayList<String> getQualificacoes() {
        return this.qualificacoes;
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

    public void setExperiencia(String experiencia) {
        this.experiencias.add(experiencia);
    }

    public void setQualificacoes(String qualificacao) {
        this.qualificacoes.add(qualificacao);
    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Endereço: %s", this.endereco));
        System.out.println(String.format("Data de Nascimento: %s", this.dataNascimento));
        System.out.println(String.format("Formação: %s", this.formacao));

        for (String experiencia : this.experiencias) {
            System.out.println(String.format("Experiência: %s", experiencia));
        }

        for (String qualificacao : this.qualificacoes) {
            System.out.println(String.format("Qualificação: %s", qualificacao));
        }
    }
}
