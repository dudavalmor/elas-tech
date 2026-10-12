package aula14Polimorfismo.Ex6;

public class Boleto implements MeioDePagamento{

    @Override
    public void pagar(double valor){
        System.out.printf("\nValor R$ %.2f pago via Boleto", valor);
    }
}
