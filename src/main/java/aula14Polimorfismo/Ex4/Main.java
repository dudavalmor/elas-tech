package aula14Polimorfismo.Ex4;

public class Main {
    public static void main(String[] args) {

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Eduarda";
        estagiaria.idade = 18;

        Pessoa pessoa = estagiaria;
        pessoa.apresentar();

    }
}
