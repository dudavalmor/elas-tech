package RevisaoPOO.questao3;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        // Preenchendo os atributos pelos setters
        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.setQuantidade(10);

        // Tentando colocar um preço negativo
        produto.setPreco(-500);

        // Exibindo os dados pelos getters
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
