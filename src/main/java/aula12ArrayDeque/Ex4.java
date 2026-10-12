package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex4 {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();
        pessoas.addAll(List.of("Ana", "Eduarda", "Clara"));

        while (!pessoas.isEmpty()){
            System.out.println("Pessoa atendida: " + pessoas.poll());
        }

        System.out.println("Fila vazia!");
    }
}
