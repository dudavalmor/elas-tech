package aula14Heranca.RH;

public class Main {
    public static void main(String[] args) {

        Diretora diretora = new Diretora();
        diretora.nome = "Carla";
        diretora.baterPonto();
        diretora.aprovarFerias("Eduarda");
        diretora.definirMeta("Contratar 3 funcionários");

        System.out.println();

        Gerente gerente = new Gerente();
        gerente.nome = "Eduarda";
        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("VA na conta");
        gerente.exportar();
    }
}
