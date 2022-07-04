public class ProdutoFactory {

    private static ProdutoFactory instance;

    private ProdutoFactory () {}

    public Produto criarProduto(String tipo, Double peso) {
        if (tipo.equals("CAIXA10X10")) {
            return new Caixa(10.0, 10.0, 10.0, null);
        } else if (tipo.equals("FUTBOL")) {
            return new Bola(11.0, null);
        } else if (tipo.equals("BOLATENIS")){
            return new Bola(0.32, null);
        }
        else {
            throw new IllegalArgumentException("Tipo de produto invalido");
        }
    }

    public static ProdutoFactory getInstance() {
        if (instance == null) {
            instance = new ProdutoFactory();
        }
        return instance;
    }
}