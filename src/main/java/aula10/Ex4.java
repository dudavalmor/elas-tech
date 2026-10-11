package aula10;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        try{
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException e){
            System.out.println("O nome não foi preenchido.");
        }
    }
}
