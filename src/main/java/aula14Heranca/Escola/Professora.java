package aula14Heranca.Escola;

public class Professora extends Pessoa{

    String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.println(nome + " lançou a nota " + nota + " para " + aluna);
    }

    @Override
    public void apresentar(){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina);
    }
}
