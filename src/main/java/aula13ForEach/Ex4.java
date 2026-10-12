package aula13ForEach;

public class Ex4 {
    public static void main(String[] args) {

        String[] nomes = {"Eduarda", "Ana", "Maria", "Denise", "Daniele"};

        for(String nome : nomes){
            if(nome.length() > 5){
                System.out.println(nome);
            }
        }
    }
}
