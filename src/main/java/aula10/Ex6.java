package aula10;

public class Ex6 {
    public static void main(String[] args) {

        String[] nomes = {"Eduarda", "Maria", "Ana"};
        try{
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando!");
    }
}
