package aula8;

public class Ex7 {
    public static void main(String[] args) {
        saudacao();
        saudacao("Eduarda");
    }

    static void saudacao(){
        System.out.println("Olá!");
    }

    static void saudacao(String nome){
        System.out.println("Olá, " + nome + "!");
    }
}
