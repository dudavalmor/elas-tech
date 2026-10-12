package aula11;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Eduarda", "João", "Matheus", "Denise", "Bruce", "Clara"));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
