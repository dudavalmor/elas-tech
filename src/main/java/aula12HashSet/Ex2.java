package aula12HashSet;

import java.util.HashSet;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("vermelho", "rosa", "azul", "amarelo", "verde"));

        if(cores.contains("verde")){
            System.out.println("Existe a cor verde");
        } else {
            System.out.println("Não existe a cor verde");
        }

    }
}
