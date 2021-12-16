package br.com.bytebank.teste;
/**
 * Classe que representa um cliente do ByteBank
 @author Carlos Eugenio
@version 0.0.1
 */
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta =  new ContaCorrente(123,343);
        conta.deposita(200);
        try {
            conta.saca(210);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
