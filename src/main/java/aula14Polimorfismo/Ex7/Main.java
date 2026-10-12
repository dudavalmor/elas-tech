package aula14Polimorfismo.Ex7;

public class Main {
    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Eduarda";
        aluna.idade= 26;

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java";

        aluna.apresentar();
        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);
    }
}
