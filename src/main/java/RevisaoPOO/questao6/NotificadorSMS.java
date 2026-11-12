package RevisaoPOO.questao6;

public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(String mensagem){
        System.out.println("[SMS] " + mensagem);
    }
}
