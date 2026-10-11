package aula12HashSet;

import java.util.HashSet;

public class Ex6 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        System.out.println("IsEmpty(): " + hashSet.isEmpty());

        hashSet.add("Valor1");
        System.out.println("IsEmpty(): " + hashSet.isEmpty());
    }
}
