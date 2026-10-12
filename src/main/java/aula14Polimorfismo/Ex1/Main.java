package aula14Polimorfismo.Ex1;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Área quadrado: " + calculadora.calculaArea(5.3));
        System.out.println("Área retângulo: " + calculadora.calculaArea(3.5, 7.5));
        System.out.println("Área círculo: " + calculadora.calculaArea(3));
    }
}
