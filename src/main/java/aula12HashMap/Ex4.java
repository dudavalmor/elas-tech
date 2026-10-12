package aula12HashMap;

import java.util.HashMap;

public class Ex4 {
    public static void main(String[] args) {

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 10);
        estoque.put("Feijão", 5);

        System.out.println("Quantidade de arroz: " + estoque.getOrDefault("Arroz", 0));
        System.out.println("Quantidade de farinha: " + estoque.getOrDefault("Farinha", 0));
        System.out.println("Usando get() na farinha: " + estoque.get("Farinha"));

    }
}
