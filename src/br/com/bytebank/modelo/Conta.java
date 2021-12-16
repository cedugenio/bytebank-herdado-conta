package br.com.bytebank.modelo;

/**
 * Classe que representa a conta do banco Bytebank
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total;


    public Conta () {}

    /**
     * Construtor para iniciar o objeto apartir da agencia
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é : " + Conta.total);

        this.agencia =  agencia;
        this.numero =  numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

//    public abstract void deposita(double valor) {
//        this.saldo += valor;
//    }
    public abstract void deposita(double valor);

    /**
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo-=saldo;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
        }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <=0) {
            System.out.println("Não inserir valor menor que zero!");
            return;
        }
            this.agencia=agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <=0) {
            System.out.println("Não inserir valor menor que zero!");
            return;
        }
            this.numero=numero;
    }

    @Override
    public String toString() {
        return "Número " + this.numero;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
