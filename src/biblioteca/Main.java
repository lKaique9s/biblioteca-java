package biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca bb = new Biblioteca();

    public static void main(String[] args) {

        bb.addLivro("Dom Casmurro", "Machado de Assis");

        System.out.println(bb.emprestarLivro(1)); // true
        System.out.println(bb.emprestarLivro(1)); // false

        System.out.println(bb.devolverLivro(1)); // true
        System.out.println(bb.devolverLivro(1)); // false

        System.out.println(bb.emprestarLivro(999)); // false
    }

}
