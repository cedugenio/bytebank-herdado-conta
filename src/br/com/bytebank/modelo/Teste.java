package br.com.bytebank.modelo;

public class Teste {
    public static void main(String[] args) {
//        System.out.println("x");
//        System.out.println(23);
//        System.out.println(false);

        Object c  =  new ContaCorrente(22,33);
        Object cc = new ContaCorrente(222,4444);
        Object cp = new ContaPoupanca(3333,8888);

        Object cliente = new Cliente();
        System.out.println(cc);
        System.out.println(cp);

//        static void println() {}
//        static void println(int a ) {}


    }
}
