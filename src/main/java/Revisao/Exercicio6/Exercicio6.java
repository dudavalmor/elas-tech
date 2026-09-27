package Revisao.Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("O usuário " + nomeCompleto + " nasceu no ano " + anoNascimento);
    }
}
