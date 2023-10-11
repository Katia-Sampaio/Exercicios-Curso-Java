package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(8.2); /*
                            * Converte double (primitivo) para uma classe do tipo
                            * Double, o mesmo acontece com os demais itens do conjunto
                            */
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(230);
        conjunto.add('A');
        System.out.println(conjunto);

        /* IDENTIFICANDO O TAMANHO DO CONJUNTO */
        System.out.println("O tamanho é: " + conjunto.size());
        /* Remove elementos do conjunto, retornando true ou false */
        System.out.println(conjunto.remove("Teste"));
        /* Verifica se existe o valor procurado no conjunto, retornando true ou false */
        System.out.println(conjunto.contains('1'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(230);

        System.out.println(nums);

        /* Fazer união entre os conjuntos mas não mantem a ordem */
        conjunto.addAll(nums);
        System.out.println(conjunto);

        /* Fazer a intercessão entre dois conjuntos */
        conjunto.retainAll(nums);
        System.out.println(conjunto);

    }
}
