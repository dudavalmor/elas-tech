package aula10;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            int divisao = n1/n2;

            System.out.println("Resultado da divião: " + divisao);
        } catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero!");
        }

        sc.close();



    }
}
