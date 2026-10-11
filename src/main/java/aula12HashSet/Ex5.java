package aula12HashSet;

import java.util.HashSet;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("Laranja", "Maçã", "Banana"));

        for (String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
