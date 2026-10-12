package aula12HashMap;

import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Eduarda", 10.0);
        notas.put("Ana", 6.5);
        notas.put("Luisa", 7.5);
        System.out.println("HashMap: " + notas);
        System.out.println("Tamanho: " + notas.size());

        notas.remove("Ana");
        System.out.println("HashMap após remover: " + notas);
        System.out.println("Tamanho após remover: " + notas.size());
    }
}
