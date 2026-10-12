package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex1 {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();
        pessoas.addAll(List.of("Eduarda", "Ana", "Clara"));

        System.out.println("Pessoas: " + pessoas);
        System.out.println("Número de pessoas: " + pessoas.size());
    }
}
