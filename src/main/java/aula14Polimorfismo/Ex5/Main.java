package aula14Polimorfismo.Ex5;

public class Main {

    static void mostrarFicha(Pessoa p){
        p.apresentar();
    }

    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Eduarda";
        aluna.idade = 26;

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java";

        mostrarFicha(aluna);
        mostrarFicha(professora);
    }
}
