public class Licitante implements Observador {

    private String nome;
    private String sobrenome;
    private Integer identidade;
    private Double valormaximo;

    public Licitante(String nome, String sobrenome, Integer identidade, Double valormaximo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identidade = identidade;
        this.valormaximo = valormaximo;
    }

    @Override
    public void receberNotificacao(Double valorAtual) {

        if (valorAtual < valormaximo) {
            System.out.println("Licitante " + nome + " " + sobrenome + " " + "valor proposto: " + valormaximo);
        } else {
            System.out.println("Licitante " + nome + " " + sobrenome + " " + "desistiu do leilao");
        }
    }


}
