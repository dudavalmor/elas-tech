package aula3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();

        if(idade < 13){
            System.out.println("Criança");
        } else if (idade <= 17){
            System.out.println("Adolescente");
        } else if (idade <= 59){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
