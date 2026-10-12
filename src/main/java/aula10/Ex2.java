package aula10;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            double[] notas = {5.2, 4.5, 10, 7.5, 5};
            System.out.println("Digite a posição que você quer ver: ");
            int posicao = sc.nextInt();

            System.out.println(notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Só há posições de 0 a 4 no array");
        }
    }
}
