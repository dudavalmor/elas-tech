package aula12ArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        if(fila.isEmpty()){
            System.out.println("Não há ninguém na lista");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        fila.add("Eduarda");

        if(fila.isEmpty()){
            System.out.println("Não há ninguém na lista");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

    }
}
