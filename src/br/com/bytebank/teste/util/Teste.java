package br.com.bytebank.teste.util;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista =  new ArrayList();

        Conta cc = new ContaCorrente(22,22);
        lista.add (cc);

        Conta cc2 =  new ContaCorrente(33,33);
        lista.add (cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());



    }
}
