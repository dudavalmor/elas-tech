package aula17Singleton.ex7;

public class Main {
    public static void main(String[] args) {

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQntItens());
    }
}
