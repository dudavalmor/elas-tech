package aula7Scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + (idade+1) + " no próximo aniversário");
    }
}
