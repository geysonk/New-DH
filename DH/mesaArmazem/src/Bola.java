public class Bola extends Produto {

    private Double raio;

    public Bola(Double raio, Double peso) {
        super(peso);
        this.raio = raio;
    }

    //Construtor
    public Double getRaio() {
        return raio;
    }

    @Override
    public double calcularEspaco() {
        return Math.pow(getRaio(), 2)*3.14;
    }

    @Override
    public String toString() {
        return "BOLA: " +
                "Raio - " + raio;
    }
}
