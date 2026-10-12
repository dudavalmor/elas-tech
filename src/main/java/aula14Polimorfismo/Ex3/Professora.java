package aula14Polimorfismo.Ex3;

public class Professora extends Pessoa{

    String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.printf("\n%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }

}
