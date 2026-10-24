package biblioteca;

public class Livro {
    private int id;
    private String nomeLivro;
    private String autor;

    public Livro(int id, String nomeLivro, String autor){
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    
}
