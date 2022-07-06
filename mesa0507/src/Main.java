public class Main {
    public static void main(String[] args) {

        Licitante licitante = new Licitante("Jose", "Joao", 230223022302, 100.0);
        Leilao leilao = new Leilao(90.0, "Leilão de carros");
        Licitante licitante2 = new Licitante("Joao", "Jose", 022302230223, 80.0);
        leilao.adicionarObservador(licitante);
        leilao.adicionarObservador(licitante2);
        leilao.notificar();





    }
}
