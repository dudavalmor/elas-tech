package aula12HashMap;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Eduarda", 26);
        pessoas.put("João", 30);
        pessoas.put("Denise", 65);

        System.out.println(pessoas.get("Eduarda"));
    }
}
