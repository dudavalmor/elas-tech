package aula7String;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
    }
}
