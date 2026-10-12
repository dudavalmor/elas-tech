package aula14Polimorfismo.Ex3;

public class Main {
    public static void main(String[] args) {

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();
        aluna.nome = "Eduarda";
        aluna.idade = 26;

        aluna.apresentar();
        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.9);
    }
}
