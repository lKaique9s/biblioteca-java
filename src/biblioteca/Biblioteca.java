package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca() {
    }

    public void addLivro(String nomeLivro, String autor) {
        livros.add(new Livro(nomeLivro, autor));
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - " +
                    livro.getNomeLivro() + " - " +
                    livro.getAutor());
        }
    }

    public Livro buscarLivroPorId(int id) {

        for (Livro livro : livros) {
            if (id == livro.getId()) {
                return livro;
            }
        }

        System.out.println("Livro nao encontrado!");
        return null;
    }

    public boolean atualizarLivro(int id, String nomeLivro, String autor) {
        var livro = buscarLivroPorId(id);
        if (livro == null)
            return false;
        if (nomeLivro == null || nomeLivro.isBlank())
            return false;
        if (autor == null || autor.isBlank())
            return false;

        livro.setNomeLivro(nomeLivro);
        livro.setAutor(autor);
        return true;
    }

    public boolean removerLivro(int id){
        var livro = buscarLivroPorId(id);

        if(livro == null) return false;

        return livros.remove(livro);
    }
}
