package aula13Interfaces.Notificacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Notificacao> noticacoes = new ArrayList<>();
        noticacoes.add(new Email());
        noticacoes.add(new SMS());

        for (Notificacao notificacao : noticacoes){
            notificacao.enviar("Sua compra foi aprovada!");
        }

    }
}
