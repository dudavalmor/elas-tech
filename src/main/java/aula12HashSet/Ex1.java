package aula12HashSet;

import java.util.HashSet;

public class Ex1 {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();
        nomes.add("Eduarda");
        nomes.add("Ana");
        nomes.add("Eduarda");
        nomes.add("Maria");

        System.out.println("Conjunto: " + nomes);
        System.out.println("Tamanho: " + nomes.size());

        //Ele não permite repetir os valores, então o segundo valor igual é excluído
    }
}
