public class Main {
    public static void main(String[] args) {

        Licitante licitante = new Licitante("Joao", "Silva", 123456789, 100.0);
        Leilao leilao = new Leilao(90.0, "Leilão de carros");
        Licitante licitante2 = new Licitante("Maria", "Santos", 987654321, 80.0);
        leilao.adicionarObservador(licitante);
        leilao.adicionarObservador(licitante2);
        leilao.notificar();





    }
}
