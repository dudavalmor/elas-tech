package aula12HashMap;

import java.util.HashMap;

public class Ex2 {
    public static void main(String[] args) {

        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Café", 5.00);
        System.out.println("Produtos: " + produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("Café", 7.50);
        System.out.println("Produtos: " + produtos);
        System.out.println("Tamanho: " + produtos.size());

    }
}
