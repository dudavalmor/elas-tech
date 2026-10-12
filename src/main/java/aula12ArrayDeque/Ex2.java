package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();
        pessoas.addAll(List.of("Ana", "Eduarda", "Clara"));

        System.out.println("Pessoas: " + pessoas);
        System.out.println("Próxima pessoa: " + pessoas.peek());
        System.out.println("Após o peak: " + pessoas);


    }
}
