package biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca bb = new Biblioteca();
    public static void main(String[] args) {

        

        bb.addLivro("Dom Casmurro", "Machado de Assis");
        bb.addLivro("Dom 2", "Machado");
        bb.addLivro("Gato De Botas", "Assis");
        bb.listarLivros();
        var oc1 = bb.atualizarLivro(2, "Livro dot", "Dotted");
        var oc2 = bb.removerLivro(1);
        var oc3 = bb.removerLivro(99);
        System.out.println(oc1);
        System.out.println(oc2);
        System.out.println(oc3);
        bb.listarLivros();
        
    }



    public static void atualizarLivro(){
        System.out.println("Digite o id");
        var id = scan.nextInt();
        System.out.println("Digite o nome do livro");
        var nomeLivro = scan.nextLine();
        System.out.println("Digite o nome do autor");
        var autor = scan.nextLine();

        if(bb.atualizarLivro(id, nomeLivro, autor)){
            System.out.println("Livro Atualizado!");
        }else{
            System.out.println("Livro nao foi atualizado!");
        }
        
    }
}
