package Revisao.Exercicio4;

public class Main {
    public static void main(String[] args) {

        Pet gato = new Pet("Evie", "SRD", 4.85);
        Pet cachorro = new Pet("Sirius", "Border Collie", 25.5);

        System.out.println("Nome: " + gato.nome + "\nRaça: " + gato.raca + "\nPeso: " + gato.peso);
        System.out.println("\nNome: " + cachorro.nome + "\nRaça: " + cachorro.raca + "\nPeso: " + cachorro.peso);
    }
}
