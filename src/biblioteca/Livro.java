package biblioteca;

public class Livro {
    private int id;
    private String nomeLivro;
    private String autor;
    private static int contadorId = 0;

    public Livro(String nomeLivro, String autor) {
        if (nomeLivro == null || nomeLivro.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor inválido!");
        }
        this.id = ++contadorId;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        if (nomeLivro == null || nomeLivro.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor inválido!");
        }
        this.autor = autor;
    }

}
