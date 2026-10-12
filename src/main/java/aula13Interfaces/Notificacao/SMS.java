package aula13Interfaces.Notificacao;

public class SMS implements Notificacao{

    @Override
    public void enviar(String mensagem){
        System.out.println("SMS enviado: " + mensagem);
    }
}
