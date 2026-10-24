package biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro(1, "zzzz","1111"));
        livros.add(new Livro(1, "2222","2222"));


        for(Livro livro:livros){
            System.out.println(livro.getNomeLivro() + " - " +
                                livro.getAutor());
        }

    }
}
