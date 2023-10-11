package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
     public static void main(String[] args) {
        Set<String> listaAprovado = new HashSet<String>(); /* so aceita valores do tipo String */
        listaAprovado.add("Ana");
        listaAprovado.add("Juvania");
        listaAprovado.add("Roberta");

        for (String Candidato : listaAprovado) {
            System.out.println(Candidato);

        }
    }
}
