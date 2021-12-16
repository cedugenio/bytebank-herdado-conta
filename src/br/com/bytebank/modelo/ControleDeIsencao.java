package br.com.bytebank.modelo;

public class ControleDeIsencao {
    private double totalTaxa;

    public void registra(NaoTributavel nt) {
        double valor = nt.getTaxaAnual();
        this.totalTaxa += valor * 0.005;
    }

    public double getTotalTaxa() {
        return totalTaxa;
    }
}
