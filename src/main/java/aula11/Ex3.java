package aula11;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Eduarda", "Ana", "João", "Matheus"));
        System.out.println(nomes);
        nomes.set(2, "Luisa");
        System.out.println(nomes);
    }
}
