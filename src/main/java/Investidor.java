public class Investidor {
    private String nome;
    private Conta conta;

    public Investidor(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String obterInvestidor() {
        return "Investidor{" +
                "nome=" + nome +
                ", conta=" + conta.getNumero() +
                ", tipoConta=" + conta.getTipo() +
                "}";
    }
}
