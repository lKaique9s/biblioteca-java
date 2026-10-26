package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

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
                    (livro.getStatus()));
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

        if (livro == null || livro.getStatus() != StatusLivro.DISPONIVEL)
            return false;

        livrosById.remove(id);
        return livros.remove(livro);
    }

    public boolean emprestarLivro(int id) {
        return executarAcaoNoLivro(id, Livro::emprestar);
    }

    public boolean devolverLivro(int id) {
        return executarAcaoNoLivro(id, Livro::devolver);
    }

    private boolean executarAcaoNoLivro(int id, Consumer<Livro> acao){
        var livro = buscarLivroPorId(id);
        if (livro == null)
            return false;

        try{
            acao.accept(livro);
            return true;
        } catch(IllegalArgumentException e){
            return false;
        }
    }
}
