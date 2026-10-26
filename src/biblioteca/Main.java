package biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca bb = new Biblioteca();

        // 1. Cadastrar um livro
        bb.addLivro("Dom Casmurro", "Machado de Assis");

        Livro livro = bb.buscarLivroPorId(1);

        System.out.println("=== TESTE INICIAL ===");
        System.out.println("Status: " + livro.getStatus());
        System.out.println("Dias emprestado: " + livro.getDiasEmprestados());
        // Esperado: DISPONIVEL e 0

        // 2. Emprestar o livro
        System.out.println("\n=== TESTE DE EMPRESTIMO ===");
        System.out.println("Emprestar: " + bb.emprestarLivro(1));
        System.out.println("Status: " + livro.getStatus());
        System.out.println("Data do empréstimo: " + livro.getDataEmprestimo());
        System.out.println("Dias emprestado: " + livro.getDiasEmprestados());
        // Esperado: true, EMPRESTADO, data atual e 0

        // 3. Tentar emprestar novamente
        System.out.println("\n=== TESTE DE EMPRESTIMO DUPLICADO ===");
        System.out.println("Emprestar novamente: " + bb.emprestarLivro(1));
        // Esperado: false

        // 4. Tentar remover enquanto está emprestado
        System.out.println("\n=== TESTE DE REMOCAO ===");
        System.out.println("Remover emprestado: " + bb.removerLivro(1));
        // Esperado: false

        // 5. Simular uma data de empréstimo anterior
        // Apenas para testar o cálculo sem esperar vários dias.
        System.out.println("\n=== TESTE DE CONTAGEM DE DIAS ===");
        System.out.println("Dias emprestado: " + livro.getDiasEmprestados());
        // Esperado: 5

        // 6. Devolver o livro
        System.out.println("\n=== TESTE DE DEVOLUCAO ===");
        System.out.println("Devolver: " + bb.devolverLivro(1));
        System.out.println("Status: " + livro.getStatus());
        System.out.println("Data do empréstimo: " + livro.getDataEmprestimo());
        System.out.println("Dias emprestado: " + livro.getDiasEmprestados());
        // Esperado: true, DISPONIVEL, null e 0

        // 7. Tentar devolver novamente
        System.out.println("\n=== TESTE DE DEVOLUCAO DUPLICADA ===");
        System.out.println("Devolver novamente: " + bb.devolverLivro(1));
        // Esperado: false

        // 8. Remover após devolver
        System.out.println("\n=== TESTE DE REMOCAO FINAL ===");
        System.out.println("Remover disponível: " + bb.removerLivro(1));
        // Esperado: true, conforme sua regra atual

        // 9. Tentar buscar o livro removido
        System.out.println("Buscar removido: " + bb.buscarLivroPorId(1));
        // Esperado: null
    }
}