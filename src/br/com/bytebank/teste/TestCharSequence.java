package br.com.bytebank.teste;

public class TestCharSequence implements CharSequence{
    public static void main(String[] args) {
        CharSequence seq = "é uma sequencia de caracteres";
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int i) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return null;
    }
}
