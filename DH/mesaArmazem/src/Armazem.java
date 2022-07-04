import java.util.List;

public class Armazem {

    private List<Produto> produtos;

    public Armazem(List<Produto> produtos) {
            this.produtos = produtos;
        }

    public double calcularEspacoNecessario() {
        double espacoNecessario = 0;
        for (Produto produto : produtos) {
            espacoNecessario += produto.calcularEspaco();
            }
            return espacoNecessario;
        }

        @Override
        public String toString() {
            return "Produtos:" + produtos;
        }
    }
