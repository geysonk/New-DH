import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProdutoFactory teste1 = ProdutoFactory.getInstance();
        Produto caixa1 = teste1.criarProduto("CAIXA10X10", 2.0);
        Produto caixa2 = teste1.criarProduto("CAIXA10X10", 10.0);
        Produto bola1 = teste1.criarProduto("FUTBOL", 2.0);
        Produto bola2 = teste1.criarProduto("BOLATENIS", 10.0);

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(bola1);
        produtos.add(bola2);

        Armazem armazem = new Armazem(produtos);

        System.out.println(armazem.calcularEspacoNecessario());
        System.out.println(armazem);

    }
}
