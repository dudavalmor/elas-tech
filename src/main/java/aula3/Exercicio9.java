package aula3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("DIGITE A OPÇÂO DESEJADA");
        System.out.println("1- Café");
        System.out.println("2- Cappuccino");
        System.out.println("3- Chocolate quente");
        System.out.println("4- Chá");
        System.out.println();
        System.out.println("Digite a opção desejada: ");
        int opcao = leia.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu café");
                break;
            case  2:
                System.out.println("Você escolheu cappuccino");
                break;
            case 3:
                System.out.println("Você escolheu chocolate quente");
                break;
            case 4:
                System.out.println("Você escolheu chá");
                break;
            default:
                System.out.println("Opçção inválida");
                break;
        }

    }
}
