package aula11;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        frutas.addAll(List.of("Banana", "Maçã", "Pera", "Melancia"));
        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(3));
        System.out.println("Tamanho lista: " + frutas.size());
    }
}
