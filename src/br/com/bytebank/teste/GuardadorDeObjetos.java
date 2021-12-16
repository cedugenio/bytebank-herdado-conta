package br.com.bytebank.teste;

public class GuardadorDeObjetos {
    private Object[] objects;
    private int posicaoLivre;

    public GuardadorDeObjetos() {
        this.objects = new Object[10];
        this.posicaoLivre = 0;
    }
    public void adiciona(Object ref) {
        objects[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }
}
