package biblioteca;

public class Livro {
    private int id;
    private String nomeLivro;
    private String autor;
    private static int contadorId = 0;

    public Livro(String nomeLivro, String autor){
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

    public void setNomeLivro(String nomeLivro){
        if(nomeLivro == null || nomeLivro.isBlank()){
            System.out.println("Nome Invalido!");
        }else{
            this.nomeLivro = nomeLivro;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor){
        if(autor == null || autor.isBlank()){
            System.out.println("Autor Invalido!");
        }else{
            this.autor = autor;
        }
    }
    
}
