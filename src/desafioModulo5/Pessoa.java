package desafioModulo5;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nome, double peso) {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    void comer(Comida comida) { /* Usei o construtor Comida dentro do metodo comer */
        if (comida != null) { /* A variavel comida é so um nome, n tem nada haver com o contrutor Comida */
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar() {

        return "Hey, eu sou " + nomePessoa + " e tenho " + pesoPessoa + " kgs";
    }
}
