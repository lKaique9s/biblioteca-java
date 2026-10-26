package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private Map<Integer, Livro> livrosById = new HashMap<>();

    public Biblioteca() {
    }

    public boolean addLivro(String nomeLivro, String autor) {
        try {
            var livro = new Livro(nomeLivro, autor);

            livros.add(livro);
            livrosById.put(livro.getId(), livro);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }

    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - " +
                    livro.getNomeLivro() + " - " +
                    livro.getAutor() + " - " +
                    (livro.isEmprestado() ? "Emprestado" : "Disponível"));
        }
    }


    public Livro buscarLivroPorId(int id) {
        return livrosById.get(id);
    }

    public boolean atualizarLivro(int id, String nomeLivro, String autor) {
        var livro = buscarLivroPorId(id);
        if (livro == null)
            return false;
        if (nomeLivro == null || nomeLivro.isBlank())
            return false;
        if (autor == null || autor.isBlank())
            return false;

        try {
            livro.setNomeLivro(nomeLivro);
            livro.setAutor(autor);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean removerLivro(int id) {
        var livro = buscarLivroPorId(id);

        if (livro == null)
            return false;

        livrosById.remove(id);
        return livros.remove(livro);
    }

    public boolean emprestarLivro(int id) {
        var livro = buscarLivroPorId(id);
        if (livro == null)
            return false;

        try {
            livro.emprestar();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean devolverLivro(int id) {
        var livro = buscarLivroPorId(id);
        if (livro == null)
            return false;

        try {
            livro.devolver();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
