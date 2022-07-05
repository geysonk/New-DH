import java.util.ArrayList;
import java.util.List;

public class Leilao implements Publicador {

    private Double valorInicial;
    private String descricao;

    private List<Observador> observadores;

    public Leilao(Double valorInicial, String descricao) {

        this.valorInicial = valorInicial;
        this.descricao = descricao;
        observadores = new ArrayList<>();
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void notificar() {

        for (Observador observador : observadores) {
            observador.receberNotificacao(getValorInicial());
        }
    }
}
