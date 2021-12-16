package br.com.bytebank.modelo;

public class ContaUniversitaria extends Conta implements NaoTributavel {

    public ContaUniversitaria(int agencia , int numero) {
        super(agencia, numero);

    }

    public ContaUniversitaria() {

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getTaxaAnual() {
        if (super.saldo > 5000) {
            return super.saldo * 0.02;
        }
        return super.saldo;
    }
}
