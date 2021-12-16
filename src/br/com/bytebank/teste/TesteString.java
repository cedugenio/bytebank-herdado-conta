package br.com.bytebank.teste;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura";

        String vazio = "     Alura    ";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("lu"));

        System.out.println(vazio);
        System.out.println(outroVazio);

        String nome1 = "Mario";
        nome.replace('o', 'a');
        System.out.println("Valor: " + nome1);



        nome.replace("A","a");
        System.out.println(nome);
        String outro = nome.replace("A", "a");
        System.out.println(outro);

        String outro1 = nome.toLowerCase();
        System.out.println(outro1);

        char c = nome.charAt(0);
        System.out.println(c);

        System.out.println(nome.indexOf("ra"));
        System.out.println(nome.substring(0,3));
        System.out.println(nome.length());

        for(int i= 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String endereco = "Rua Dolores";
        System.out.println("Endereço : " + endereco);
        System.out.println(endereco.contains("Dol"));
        String[] end = endereco.split("ua",2);
        System.out.println(end);




    }
}
