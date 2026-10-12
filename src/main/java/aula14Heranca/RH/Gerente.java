package aula14Heranca.RH;

public class Gerente extends Funcionário implements Notificavel, Exportavel{

    public void aprovarFerias(String quem){
        System.out.println(nome + " aprovou as férias do funcionário " + quem);
    }

    @Override
    public void notificar(String mensagem){
        System.out.println("Notificação: " + mensagem);
    }

    @Override
    public void exportar(){
        System.out.println("Dados do gerente " + nome + " exportados.");
    }
}
