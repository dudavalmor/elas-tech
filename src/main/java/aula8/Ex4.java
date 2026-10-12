package aula8;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        calcularMedia(nota1, nota2);
    }

    private static void calcularMedia(double n1, double n2) {
        double media = (n1+n2)/2;
        System.out.println("Média: " + media);
    }
}
