package RevisaoPOO.questao6;

public class FolhaPagamento {

    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        double salario = f.calcularSalario();

        String mensagem = "Pagamento realizado para " + f.getNome() + ". Salário: R$ " + salario;

        notificador.notificar(mensagem);
    }
}
