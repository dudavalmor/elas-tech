package aula7Scanner;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota: ");
        double nota = sc.nextDouble();

        if(nota >= 7){
            System.out.println("Aprovada");
        } else if (nota >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
    }
}
