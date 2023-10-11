package desafioModulo5;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Lasanha", 0.500);
        Comida c2 = new Comida("macarrão", 0.300);

        Pessoa p = new Pessoa("Katia", 75.8);

        System.out.println(p.apresentar());

        p.comer(c1);
        System.out.println(p.apresentar());

        p.comer(c2);
        System.out.println(p.apresentar());
    }
}
