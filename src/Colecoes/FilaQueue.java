package Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class FilaQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // Offer e Add -> adicionam elementos a fila
        // a diferença é o comportamento quando a fila esta cheia
        // O Add vai retornar uma exeção e o Offer vai retornar falso
        // Caso não consiga adicionar.

        fila.add("Ana");
        fila.offer("Katia");
        fila.add("João");
        fila.offer("luiz");
        fila.add("Gimar");
        fila.offer("Artur");

        System.out.println(fila.peek()); // pega o primeiro elemento da fila
        System.out.println(fila.element()); // tbm pega os elementos da fila
        System.out.println(fila.poll()); // pega o 1° elemento da fila e remove

    }
}
