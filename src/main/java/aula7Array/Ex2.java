package aula7Array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        double[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}
