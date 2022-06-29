package model;

import util.Documento;

import java.util.ArrayList;

public class Curriculo implements Documento {
    private Pessoa pessoa;
    private ArrayList<String> experiencias;
    private ArrayList<String> qualificacoes;

    public Curriculo(Pessoa pessoa, ArrayList<String> experiencias, ArrayList<String> qualificacoes) {
        this.pessoa = pessoa;
        this.experiencias = experiencias;
        this.qualificacoes = qualificacoes;
    }

    public ArrayList<String> getExperiencia() {
        return this.experiencias;
    }

    public ArrayList<String> getQualificacoes() {
        return this.qualificacoes;
    }

    public void setExperiencia(String experiencia) {
        this.experiencias.add(experiencia);
    }

    public void setQualificacoes(String qualificacao) {
        this.qualificacoes.add(qualificacao);
    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Nome: %s", this.pessoa.getNome()));
        System.out.println(String.format("Endereço: %s", this.pessoa.getEndereco()));
        System.out.println(String.format("Data de Nascimento: %s", this.pessoa.getDataNascimento()));
        System.out.println(String.format("Formação: %s", this.pessoa.getFormacao()));

        for (String experiencia : this.experiencias) {
            System.out.println(String.format("Experiência: %s", experiencia));
        }

        for (String qualificacao : this.qualificacoes) {
            System.out.println(String.format("Qualificação: %s", qualificacao));
        }
    }
}
