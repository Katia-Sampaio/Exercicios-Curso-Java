package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> Usuarios = new HashMap<>();
        Usuarios.put(1, "Katia");
        Usuarios.put(2, "Amora");
        Usuarios.put(3, "Debora");
        Usuarios.put(4, "Juvania");

        // mostra so os valores (nomes)
        System.out.println(Usuarios.values());

        // retorna todas as chaves(os numero)
        System.out.println(Usuarios.keySet());

        // para pegar as chaves e valores ao mesmo tempo
        System.out.println(Usuarios.entrySet());

        // Para saber se tem uma chave que vc procura:
        System.out.println(Usuarios.containsKey(3));

        // Para saber se tem o valor que vc procura:?
        System.out.println(Usuarios.containsValue("Katia"));

        // Da pra pegar o valor que vc quiser pelo indece:
        System.out.println(Usuarios.get(4));

        // percorrendo as chaves do Map

        for (int chave : Usuarios.keySet()) {
            System.out.println(chave);
        }

        // percorrendo os valores do map

        for (String valores : Usuarios.values()) {
            System.out.println(valores);
        }

        // percorrer o Map pegando chave e valores

        for (Entry<Integer, String> registros : Usuarios.entrySet()) {
            System.out.print(registros.getKey() + " ");
            System.out.println(registros.getValue());
        }

        // Para remover chave valor:

        System.out.println(Usuarios.remove(1, "Katia"));
    }
}
