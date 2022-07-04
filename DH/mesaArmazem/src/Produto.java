public abstract class Produto {

    private Double peso;

    public Produto(Double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspaco();

    public Double getPeso() {
        return peso;
    }
}