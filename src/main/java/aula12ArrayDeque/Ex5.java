package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex5 {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();
        pessoas.addAll(List.of("Ana", "Eduarda", "Clara"));

        System.out.println("Zoe está na lista: " + pessoas.contains("Zoe"));
        System.out.println("Bia está na lista: " + pessoas.contains("Bia"));
    }
}
