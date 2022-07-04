public class Caixa extends Produto {

    private Double comprimento;
    private Double altura;
    private Double largura;

    public Caixa(Double comprimento, Double altura, Double largura, Double peso) {
        super(peso);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getLargura() {
        return largura;
    }

    @Override
    public double calcularEspaco() {
        return getAltura() * getLargura() * getComprimento();
    }

    @Override
    public String toString() {
        return "CAIXA: " +
                "Comprimento - " + comprimento + "cm, " +
                "Altura - " + altura + "cm, " +
                "Largura - " + largura + "cm ";
    }
}