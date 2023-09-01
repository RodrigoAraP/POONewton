package armazem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id, estoque,qtd;
        String produto;
        double preco;

        System.out.println("Digite o id: ");
        id = ler.nextInt();
        System.out.println("Nome do produto:");
        produto = ler.nextLine();
        produto = ler.nextLine();
        System.out.println("Estoque inicial: ");
        estoque = ler.nextInt();
        System.out.println("Valor do Produto");
        preco = ler.nextDouble();
        Estoque e1 = new Estoque(id,produto,estoque,preco);

        System.out.println("Digite a quantidade para acrecentar: ");
        qtd = ler.nextInt();
        e1.Acrecimo(qtd);

        System.out.println("Digite a quantidade para baixar: ");
        qtd = ler.nextInt();
        e1.Baixa(qtd);

        System.out.println(e1.ConsultaEstoque());


        /*Estoque e1 = new Estoque(1,"Arroz",10,25.0);
        Estoque e2 = new Estoque(2,"Feijão",10,5.65);
        Estoque e3 = new Estoque(3,"Açucar",10,16.0);

        e1.Acrecimo(100);
        System.out.println(e1.ConsultaEstoque());
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        System.out.println(e3.TotalEstoque());*/
    }
}