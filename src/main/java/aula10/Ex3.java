package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
            System.out.println(idade);
        } catch (InputMismatchException e){
            System.out.println("Digite um número!");
        }
    }
}
