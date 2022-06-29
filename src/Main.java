import model.Curriculo;
import model.Livro;
import model.Relatorio;
import model.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String texto = "O rato roeu a roupa do rei de roma, a rainha com raiva foi lá e roeu o resto.";
        int comprimentoTexto = texto.length();
        Relatorio relatorio = new Relatorio(texto, comprimentoTexto, 45, "Diovana Valim", "Diovana Valim");

        relatorio.imprimir();

        System.out.println(" ");

        ArrayList<String> experiencias = new ArrayList<String>();
        experiencias.add("Khomp Indústria e Comércio, 2020-2022");
        experiencias.add("Mercado Livre Representações, 2022-presente");

        ArrayList<String> qualificacoes = new ArrayList<String>();
        qualificacoes.add("Python");
        qualificacoes.add("HTML");
        qualificacoes.add("CSS");
        qualificacoes.add("JavaScript");
        qualificacoes.add("TypeScript");
        qualificacoes.add("SQL");
        qualificacoes.add("R");
        qualificacoes.add("Java");

        Pessoa diovana = new Pessoa("Diovana Rodrigues Valim", "Rua Luiz Oscar de Carvalho, nº 75",
                "07/04/2001", "Bacharelado em Sistemas de Informação, UFSC");
        Curriculo curriculo = new Curriculo(diovana, experiencias, qualificacoes);
        curriculo.imprimir();

        System.out.println(" ");

        Livro livro = new Livro(540, "Cassandra Clare", "Cidade dos Ossos", "Ficção, romance");

        livro.imprimir();
    }
}
