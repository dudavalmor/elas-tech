package aula14Heranca.Escola;

public class Main {

    public static void main(String[] args) {

        Aluna aluna1 = new Aluna();
        aluna1.nome = "Eduarda";
        aluna1.idade = 26;
        aluna1.apresentar();
        aluna1.curso = "Ciência da Computação";
        aluna1.estudar();

        Professora professora1 = new Professora();
        professora1.nome = "Flora";
        professora1.idade = 28;
        professora1.disciplina = "Java + IA";
        professora1.lancarNota(aluna1.nome, 9.5);
        professora1.apresentar();
    }
}
