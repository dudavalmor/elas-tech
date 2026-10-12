package aula13Interfaces.Notificacao;

public class Email implements Notificacao{

    @Override
    public void enviar(String mensagem){
        System.out.println("Email enviado: " + mensagem);
    }
}
