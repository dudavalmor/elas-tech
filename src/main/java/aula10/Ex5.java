package aula10;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite um número: ");
            int n1 = sc.nextInt();

            int resto = 100%n1;

            System.out.println("Resto da divisão por 100: " + resto);

        } catch (ArithmeticException e){
            System.out.println("0 não é válido");
        }

    }
}
