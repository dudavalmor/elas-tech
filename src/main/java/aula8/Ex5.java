package aula8;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println(ehMaiorDeIdade(idade));
    }

    private static boolean ehMaiorDeIdade(int idade) {
        if(idade >= 18){
            return true;
        } else {
            return false;
        }
    }
}
