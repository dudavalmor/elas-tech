package aula7String;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite de novo: ");
        String novamente = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(novamente));
    }
}
