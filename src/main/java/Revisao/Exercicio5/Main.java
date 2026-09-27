package Revisao.Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        Produto p1 = new Produto(nome, preco);

        if (preco > 100){
            System.out.println("Produto caro!");
        } else {
            System.out.println("Produto com preço acessível.");
        }

        System.out.printf("Preço do produto: R$ %.2f\n", p1.preco);
    }
}
