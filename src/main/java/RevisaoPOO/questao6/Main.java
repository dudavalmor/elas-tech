package RevisaoPOO.questao6;


public class Main {

    public static void main(String[] args) {

        // Criando funcionários
        Desenvolvedor dev = new Desenvolvedor("Ana", 3000);
        Gerente gerente = new Gerente("Carlos", 5000);

        // Folha de pagamento com Email
        NotificadorEmail email = new NotificadorEmail();

        FolhaPagamento folhaEmail = new FolhaPagamento(email);

        System.out.println("=== PAGAMENTO POR EMAIL ===");

        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);


        // Folha de pagamento com SMS
        NotificadorSMS sms = new NotificadorSMS();

        FolhaPagamento folhaSms = new FolhaPagamento(sms);

        System.out.println("\n=== PAGAMENTO POR SMS ===");

        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);

    }
}

