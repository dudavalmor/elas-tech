package aula7String;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Maiúsculo: " + nome.toUpperCase());
        System.out.println("Minúsculo: " + nome.toLowerCase());
    }
}
