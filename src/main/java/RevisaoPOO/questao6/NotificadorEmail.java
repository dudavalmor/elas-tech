package RevisaoPOO.questao6;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(String mensagem){
        System.out.println("[EMAIL] " + mensagem);
    }
}
