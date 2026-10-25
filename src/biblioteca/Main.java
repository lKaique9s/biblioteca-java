package biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca bb = new Biblioteca();

    public static void main(String[] args) {

        bb.addLivro("Dom Casmurro", "pppp");
        bb.addLivro("vazio", "dasdad");
        bb.atualizarLivro(1, "Memorias postumas", "");

        boolean atualizado = bb.atualizarLivro(
                1, "Memórias Póstumas", "Machado de Assis");

        System.out.println(atualizado);

        atualizado = bb.atualizarLivro(
                99, "Memórias Póstumas", "Machado de Assis");

        System.out.println(atualizado);

        atualizado = bb.removerLivro(1);

        System.out.println(atualizado);
        bb.listarLivros();

        bb.addLivro("succ", "202");
        bb.addLivro("loops", "xxxxx");
        bb.listarLivros();
    }

}
