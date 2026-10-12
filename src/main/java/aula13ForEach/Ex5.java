package aula13ForEach;

public class Ex5 {
    public static void main(String[] args) {

        String[] nomes = {"Eduarda", "Ana", "Denise", "Daniele"};

        System.out.println("Usando ForEach: ");
        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("\nUsando for: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
