package aula12HashMap;

import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) {

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Eduarda", "21999999999");
        agenda.put("Ana", "47888888888");

        String nome = "Eduarda";

        if(agenda.containsKey(nome)){
            System.out.println("Telefone de " + nome + ": " + agenda.get(nome));
        } else {
            System.out.println(nome + " não está na agenda.");
        }

        nome = "João";

        if(agenda.containsKey(nome)){
            System.out.println("Telefone de " + nome + ": " + agenda.get(nome));
        } else {
            System.out.println(nome + " não está na agenda.");
        }

    }
}
