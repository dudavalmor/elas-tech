package aula14Polimorfismo.Ex7;

public class Professora extends Pessoa{

    String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.printf("\n%s lançou nota %.1f para a aluna %s", nome, nota, aluna);
    }

    void apresentar(String cargo){
        System.out.printf("\nOi, sou %s, %s", nome, cargo);
    }
}
