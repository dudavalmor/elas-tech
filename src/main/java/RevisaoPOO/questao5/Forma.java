package RevisaoPOO.questao5;


public abstract class Forma {

    private String nome;

    // Construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    // Método normal
    public void exibirNome() {
        System.out.println("Nome da forma: " + nome);
    }

    // Método abstrato
    public abstract double calcularArea();
}

