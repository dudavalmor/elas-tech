package Revisao.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche: ");
        String nomeLanche = sc.nextLine();
        System.out.println("Digite o valor do lanche: ");
        int valorLanche = sc.nextInt();

        if(valorLanche > 30){
            valorLanche -= 5;
        }

        System.out.println("O lanche " + nomeLanche + " custa R$ " + valorLanche);
    }
}
