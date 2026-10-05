package aula7Array;

public class Ex3 {
    public static void main(String[] args) {

        double[] notas = {8, 6, 10, 7, 9};
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }

        double media = soma/notas.length;

        System.out.println("Média: " + media);

    }
}
