import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AplicativoTest {

    @Test
    void deveRetornarInvestidores() {
        Aplicativo aplicativo = new Aplicativo();
        aplicativo.adicionar("Gabriel", "1", "Corrente");
        aplicativo.adicionar("Soares", "2", "Poupança");
        aplicativo.adicionar("Gomes", "3", "Corrente");

        List<String> resultado = Arrays.asList(
                "Investidor{nome=Gabriel, conta=1, tipoConta=Corrente}",
                "Investidor{nome=Soares, conta=2, tipoConta=Poupança}",
                "Investidor{nome=Gomes, conta=3, tipoConta=Corrente}"
        );
        assertEquals(resultado, aplicativo.obterInvestidores());
    }

    @Test
    void deveRetornarNumeroTotalDeContas() {
        Aplicativo aplicativo = new Aplicativo();
        aplicativo.adicionar("Gabriel", "1", "Corrente");
        aplicativo.adicionar("Soares", "1", "Poupança"); // Conta conjunta
        aplicativo.adicionar("Gomes", "2", "Poupança");
        aplicativo.adicionar("SoSo", "3", "Corrente");

        assertEquals(3, ContaFactory.getTotalContas());
    }
}
