public class Livro implements Documento {
    int numeroPaginas;
    String nomeAutor;
    String titulo;
    String genero;

    public Livro(int numeroPaginas, String nomeAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println(String.format("Título: %s", this.titulo));
        System.out.println(String.format("Autor: %s", this.nomeAutor));
        System.out.println(String.format("Gênero: %s", this.genero));
        System.out.println(String.format("Número de Páginas: %d", this.numeroPaginas));
    }
}
