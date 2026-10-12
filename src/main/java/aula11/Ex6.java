package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Eduarda", "Ana", "Clara", "Denise", "Luisa"));

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        boolean nomeLista = nomes.contains(nome);
        if(nomeLista){
            System.out.println("O nome está na lista, na posição: " + nomes.indexOf(nome));
        } else {
            System.out.println("Nome não está na lista");
        }
    }
}
