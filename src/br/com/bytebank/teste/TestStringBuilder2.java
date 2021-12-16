package br.com.bytebank.teste;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        String nome = "ALURA";
        CharSequence cs = new StringBuilder("al");

        nome = nome.replace("AL", cs);

        System.out.println(nome);
    }
}
