package aula17Singleton.ex7;

public class Carrinho {

    private static Carrinho instancia;
    private int qntItens = 0;

    private Carrinho(){}

    public static Carrinho getInstancia(){
        if(instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(){
        qntItens++;
    }

    public int getQntItens(){
        return qntItens;
    }
}
