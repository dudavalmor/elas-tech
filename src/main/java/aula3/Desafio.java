package aula3;

public class Desafio {
    public static void main(String[] args) {
        double nota1 = 5.3, nota2 = 7.8, nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Aprovada");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }

        System.out.printf("Sua média é: %.2f\n", media);
    }
}
