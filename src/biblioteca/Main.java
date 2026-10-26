package biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Preparando os dados para os testes
        biblioteca.addLivro("Dom Casmurro", "Machado de Assis");
        biblioteca.addLivro("O Hobbit", "J. R. R. Tolkien");
        biblioteca.addLivro("Clean Code", "Robert C. Martin");
        biblioteca.addLivro("Dom Quixote", "Miguel de Cervantes");

        // Teste 1: busca por título existente
        System.out.println("Teste 1 - Busca por 'Dom':");
        for (Livro livro : biblioteca.buscarLivrosPorTitulo("Dom")) {
            System.out.println(livro.getNomeLivro());
        }

        // Teste 2: busca ignorando maiúsculas e minúsculas
        System.out.println("\nTeste 2 - Busca por 'HOBBIT':");
        for (Livro livro : biblioteca.buscarLivrosPorTitulo("HOBBIT")) {
            System.out.println(livro.getNomeLivro());
        }

        // Teste 3: título inexistente
        System.out.println("\nTeste 3 - Busca por 'Harry Potter':");
        System.out.println(
                "Quantidade encontrada: " +
                        biblioteca.buscarLivrosPorTitulo("Harry Potter").size());

        // Teste 4: termo null
        System.out.println("\nTeste 4 - Busca por null:");
        System.out.println(
                "Quantidade encontrada: " +
                        biblioteca.buscarLivrosPorTitulo(null).size());

        // Teste 5: termo vazio
        System.out.println("\nTeste 5 - Busca por texto vazio:");
        System.out.println(
                "Quantidade encontrada: " +
                        biblioteca.buscarLivrosPorTitulo("").size());

        // Teste 6: termo com espaços
        System.out.println("\nTeste 6 - Busca por espaços:");
        System.out.println(
                "Quantidade encontrada: " +
                        biblioteca.buscarLivrosPorTitulo("   ").size());
    }

}