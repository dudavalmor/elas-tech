package aula14Polimorfismo.Ex2;

public class Painel {

    public void exibir(String texto){
        System.out.println("String: " + texto);
    }

    public void exibir(int numero){
        System.out.println("Número: " + numero);
    }

    public void exibir(boolean valor){
        System.out.println("Boolean: " + valor);
    }

    public void exibir(double numero){
        System.out.println("Double: " + numero);
    }
}
