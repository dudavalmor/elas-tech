package aula12HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> nomes1 = new ArrayList<>();
        nomes1.addAll(List.of("Ana", "Eduarda", "Maria", "Eduarda"));

        HashSet<String> nomes2 = new HashSet<>();
        nomes2.addAll(List.of("Ana", "Eduarda", "Maria", "Eduarda"));

        System.out.println("ArrayList: " + nomes1);
        System.out.println("Tamanho ArrayList: " + nomes1.size());
        System.out.println();
        System.out.println("Hashset: " + nomes2);
        System.out.println("Tamanho Hashset: " + nomes2.size());

        //HashSet não permite repetição, então o elemento repetido é retirado
    }
}
