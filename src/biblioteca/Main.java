package biblioteca;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> biblioteca.listarLivros();
                case 3 -> buscarLivro();
                case 4 -> atualizarLivro();
                case 5 -> removerLivro();
                case 6 -> emprestarLivro();
                case 7 -> devolverLivro();
                case 8 -> exibirContagemLivros();
                case 9 -> buscarLivrosPorAutor();
                case 10 -> listarLivrosPorNome();
                case 11 -> listarLivrosPorDiasEmprestados();
                case 12 -> buscarLivrosPorTitulo();
                case 0 -> System.out.println("Encerrando a biblioteca...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n===== BIBLIOTECA JAVA =====");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Buscar livro por ID");
        System.out.println("4 - Atualizar livro");
        System.out.println("5 - Remover livro");
        System.out.println("6 - Emprestar livro");
        System.out.println("7 - Devolver livro");
        System.out.println("8 - Contar livros disponíveis e emprestados");
        System.out.println("9 - Buscar livros por autor");
        System.out.println("10 - Listar livros por título");
        System.out.println("11 - Listar livros por dias emprestados");
        System.out.println("12 - Buscar livros por título");
        System.out.println("0 - Sair");
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }

    private static void cadastrarLivro() {
        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        if (biblioteca.addLivro(nome, autor)) {
            System.out.println("Livro cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar o livro.");
        }
    }

    private static void buscarLivro() {
        int id = lerInteiro("ID do livro: ");
        var livro = biblioteca.buscarLivroPorId(id);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        System.out.println("ID: " + livro.getId());
        System.out.println("Título: " + livro.getNomeLivro());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Status: " + livro.getStatus());
    }

    private static void atualizarLivro() {
        int id = lerInteiro("ID do livro a atualizar: ");

        System.out.print("Novo título: ");
        String nome = scanner.nextLine();

        System.out.print("Novo autor: ");
        String autor = scanner.nextLine();

        if (biblioteca.atualizarLivro(id, nome, autor)) {
            System.out.println("Livro atualizado com sucesso!");
        } else {
            System.out.println("Não foi possível atualizar o livro.");
        }
    }

    private static void removerLivro() {
        int id = lerInteiro("ID do livro a remover: ");

        if (biblioteca.removerLivro(id)) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println(
                    "Não foi possível remover. Verifique o ID e o status do livro.");
        }
    }

    private static void emprestarLivro() {
        int id = lerInteiro("ID do livro para empréstimo: ");

        if (biblioteca.emprestarLivro(id)) {
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println(
                    "Não foi possível emprestar. Verifique o ID e a disponibilidade.");
        }
    }

    private static void devolverLivro() {
        int id = lerInteiro("ID do livro para devolução: ");

        if (biblioteca.devolverLivro(id)) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println(
                    "Não foi possível devolver. Verifique o ID e o status do livro.");
        }
    }

    private static void exibirContagemLivros() {
        System.out.println("Livros disponíveis: "
                + biblioteca.contarLivrosDisponiveis());
        System.out.println("Livros emprestados: "
                + biblioteca.contarLivrosEmprestados());
    }

    private static void buscarLivrosPorAutor() {
        System.out.print("Nome do autor: ");
        String autor = scanner.nextLine();

        List<Livro> livros = biblioteca.buscarLivrosPorAutor(autor);

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado para esse autor.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - "
                    + livro.getNomeLivro() + " - "
                    + livro.getAutor());
        }
    }

    private static void listarLivrosPorNome() {
        List<Livro> livros = biblioteca.listarLivrosPorNome();

        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - "
                    + livro.getNomeLivro() + " - "
                    + livro.getAutor());
        }
    }

    private static void listarLivrosPorDiasEmprestados() {
        List<Livro> livros = biblioteca.listarLivrosPorDiasEmprestados();

        if (livros.isEmpty()) {
            System.out.println("Não há livros emprestados.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - "
                    + livro.getNomeLivro() + " - "
                    + livro.getDiasEmprestados() + " dia(s) emprestado(s)");
        }
    }

    private static void buscarLivrosPorTitulo() {
        System.out.print("Digite parte do título: ");
        String termo = scanner.nextLine();

        List<Livro> livros = biblioteca.buscarLivrosPorTitulo(termo);

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro.getId() + " - "
                    + livro.getNomeLivro() + " - "
                    + livro.getAutor());
        }
    }
}