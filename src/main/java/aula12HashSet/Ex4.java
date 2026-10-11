package aula12HashSet;

import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {

        HashSet<String> cpf = new HashSet<>();
        cpf.addAll(List.of("54556263450", "57629200463", "21335918264"));
        System.out.println("CPFS: " + cpf);
        System.out.println("Quantidade: " + cpf.size());

        cpf.remove("54556263450");

        System.out.println("CPFS: " + cpf);
        System.out.println("Quantidade: " + cpf.size());
    }
}
