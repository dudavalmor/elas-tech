package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex3 {
    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();
        pessoas.addAll(List.of("Ana", "Eduarda", "Clara"));

        System.out.println("Fila inicial: " + pessoas);
        System.out.println("Primeiro da fila: " + pessoas.poll());
        System.out.println("Após o atendimento: " + pessoas);

        //diferente do peak que apenas consulta a primeira pessoa, o poll remove e retorna a primeira pessoa
    }
}
