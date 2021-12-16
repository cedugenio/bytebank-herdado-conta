package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia , int numero) {
        super(agencia, numero);
    }
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double taxaSaque = valor + 0.20;
        super.saca(taxaSaque);
    }

    @Override
    public String toString() {
        return "Conta Corrente, " + super.toString();
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}