import java.util.HashMap;
import java.util.Map;


public class ContaFactory {
    private static Map<String, Conta> contas = new HashMap<>();

    public static Conta getConta(String numero, String tipo) {
        Conta conta = contas.get(numero);
        if (conta == null) {
            conta = new Conta(numero, tipo);
            contas.put(numero, conta);
        }
        return conta;
    }

    public static int getTotalContas() {
        return contas.size();
    }
}
