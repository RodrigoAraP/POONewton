package armazem;

public class Estoque { //Classe - Cria atributo
    private int id;
    private String produto;
    private int estoque;
    private double preco;
//Alt+Insert = Constructor
    public Estoque(int id, String produto, int estoque, double preco) { //Metodo - Cria variaveis
        this.id /* referente ao atributo */ = id; // referente as variaveis
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }

    public void Acrecimo(int qtde){
        estoque += qtde;
    }

    public void Baixa(int qtde){
        if(qtde <= estoque)
            estoque -= qtde;
    }

    public double TotalEstoque(){
        return estoque*preco;
    }

    public String ConsultaEstoque(){
        return "Produto: " + produto + "\nEstoque: " + estoque + "\nPreço: R$" + preco;
    }
}
