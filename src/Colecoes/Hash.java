package Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("ana"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Arthur"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);
    }
}
