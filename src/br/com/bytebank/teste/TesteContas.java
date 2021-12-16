package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,222);
        cc.deposita(100.0);
        ContaPoupanca cp = new ContaPoupanca(333,222);
        cp.deposita(200.0);

        try {
            cc.transfere(10.0, cp);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("CC : " + cc.getSaldo());
        System.out.println("CP : " + cp.getSaldo());


    }
}
