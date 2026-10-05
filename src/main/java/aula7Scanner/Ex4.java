package aula7Scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
