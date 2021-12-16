package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaUniversitaria;
import br.com.bytebank.modelo.ControleDeIsencao;

public class TesteNaoTributaveis {
    public static void main(String[] args) {
        ContaUniversitaria cu = new ContaUniversitaria(2222,4444);
        cu.deposita(50.0);

        ControleDeIsencao ci  = new ControleDeIsencao();
        ci.registra(cu);

        System.out.println(ci.getTotalTaxa());
    }
}
