package aula7String;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        int tamanho = nome.length();

        System.out.println("Quantidade de letras: " + tamanho);
    }
}
