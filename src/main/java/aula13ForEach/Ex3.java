package aula13ForEach;

public class Ex3 {
    public static void main(String[] args) {

        double[] notas = {8, 6, 10, 7};
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        double media = soma/notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
