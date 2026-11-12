package RevisaoPOO.questao5;


public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Retângulo", 5, 10);

        retangulo.exibirNome();

        System.out.println("Área: " + retangulo.calcularArea());
    }
}

