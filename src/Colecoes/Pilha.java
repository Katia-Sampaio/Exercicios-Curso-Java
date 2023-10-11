package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Contato");
        livros.push("a menina que roubava livros");
        livros.push("O diario de Anne Frank");

        // System.out.println(livros.peek());

        // System.out.println(livros.poll());
        // System.out.println(livros.poll());
        // System.out.println(livros.poll());
        // System.out.println(livros.poll());
        System.out.println(livros.pop()); // Remove intem da pilha. Caso esteja vazia, lança uma exeção.
        System.out.println(livros.pop());
    }
}
