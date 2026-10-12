package aula11;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {

        ArrayList<String> cidades = new ArrayList<>();
        cidades.addAll(List.of("Rio de Janeiro", "Santa Catarina", "São Paulo", "Paraná"));
        cidades.remove(1);
        System.out.println(cidades);
    }
}
