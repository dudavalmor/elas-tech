package Revisao.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1- Ver camisas");
            System.out.println("2- Ver calças");
            System.out.println("3- Sair");
            System.out.println("Digite a opção desejada: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu ver camisas");
                    break;
                case 2:
                    System.out.println("Você escolheu ver calças");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        } while (opcao < 3);

        sc.close();

    }
}
