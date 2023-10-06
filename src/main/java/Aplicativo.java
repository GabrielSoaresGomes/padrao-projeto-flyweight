import java.util.ArrayList;
import java.util.List;


public class Aplicativo {
    private List<Investidor> investidores = new ArrayList<>();

    public void adicionar(String nomeInvestidor, String numeroConta, String tipoConta) {
        Conta conta = ContaFactory.getConta(numeroConta, tipoConta);
        Investidor investidor = new Investidor(nomeInvestidor, conta);
        investidores.add(investidor);
    }

    public List<String> obterInvestidores() {
        List<String> resultado = new ArrayList<String>();
        for (Investidor investidor : this.investidores) {
            resultado.add(investidor.obterInvestidor());
        }
        return resultado;
    }
}
