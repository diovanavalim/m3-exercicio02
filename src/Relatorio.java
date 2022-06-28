public class Relatorio implements Documento {
    String texto;
    int comprimentoTexto;
    int numeroPaginas;
    String autor;
    String revisor;

    public Relatorio(String texto, int comprimentoTexto, int numeroPaginas, String autor, String revisor) {
        this.texto = texto;
        this.comprimentoTexto = comprimentoTexto;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getTexto() {
        return this.texto;
    }

    public int getComprimentoTexto() {
        return this.comprimentoTexto;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getRevisor() {
        return this.revisor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setComprimentoTexto(int comprimentoTexto) {
        this.comprimentoTexto = comprimentoTexto;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.print(String.format("Texto: %s", this.texto));
        System.out.print(String.format("Comprimento do Texto: %d", this.comprimentoTexto));
        System.out.print(String.format("Número de Páginas: %d", this.numeroPaginas));
        System.out.print(String.format("Autor: %s", this.autor));
        System.out.print(String.format("Revisor: %s", this.revisor));
    }
}
