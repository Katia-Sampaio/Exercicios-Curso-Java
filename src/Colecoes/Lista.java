package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>(); /* Tipo da lista é Usuario */

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println("Indice");
        System.out.println(lista.get(3).nome); // Acessa pelo indice

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
