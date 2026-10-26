package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Livro {
    private int id;
    private String nomeLivro;
    private String autor;
    private static int contadorId = 0;
    private StatusLivro status = StatusLivro.DISPONIVEL;
    private LocalDate dataEmprestimo;

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

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
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

    public StatusLivro getStatus() {
        return this.status;
    }

    public boolean isEmprestado() {
        return this.status == StatusLivro.EMPRESTADO;
    }

    public void emprestar() {
        if (this.status != StatusLivro.DISPONIVEL) {
            throw new IllegalArgumentException("Livro nao esta disponivel!");
        }
        setDataEmprestimo(LocalDate.now());
        this.status = StatusLivro.EMPRESTADO;

    }

    private void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void devolver() {
        if (this.status != StatusLivro.EMPRESTADO) {
            throw new IllegalArgumentException("Livro nao esta emprestado!");
        }
        setDataEmprestimo(null);
        this.status = StatusLivro.DISPONIVEL;
    }

    public long getDiasEmprestados() {
        if (this.status != StatusLivro.EMPRESTADO)
            return 0;

        return ChronoUnit.DAYS.between(dataEmprestimo, LocalDate.now());
    }

}
