package aula14Polimorfismo.Ex6;

public class Pix implements MeioDePagamento{

    @Override
    public void pagar(double valor){
        System.out.printf("\nPagamento de R$ %.2f realizado via PIX.", valor);
    }
}
