package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaPoupanca;

public class TesteGuardadorObjetos {
    public static void main(String[] args) {
        GuardadorDeObjetos guardador = new GuardadorDeObjetos();

        Object cc = new ContaPoupanca(123,456);
        guardador.adiciona(cc);

        Object cc2 = new ContaPoupanca(123,456);
        guardador.adiciona(cc2);

        int tamanho =  guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

    }

}
