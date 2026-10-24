package biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca bb = new Biblioteca();
    public static void main(String[] args) {

        bb.addLivro("succ", "202");
        bb.addLivro("loops", "xxxxx");
        bb.addLivro("bugsm", "kkkk");

        System.out.println(bb.buscarLivroPorId(2).getNomeLivro());

        bb.atualizarLivro(2,"dsim2", "avai");
        System.out.println(bb.buscarLivroPorId(2).getNomeLivro());

        bb.removerLivro(2);
        System.out.println(bb.buscarLivroPorId(2));

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
