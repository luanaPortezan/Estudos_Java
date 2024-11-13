package com.betrybe.helloword.classesetiposdedados;

public class ObjetosString {
    public static void main(String[] args) {
//        String frase = "Estou aprendendo Java!";
//        String numeros = "09890";
//        String caractere = "a";

        String vamos = "Vamos";
        String aprender = " aprender";
        String java = " Java?";

        String frase = vamos + aprender + java;
        System.out.println(frase);

        java = " C#?";
        frase = vamos + aprender + java;
        System.out.println(frase);

        StringBuilder stringBuilder = new StringBuilder();
        String estou = "Estou";
        String aprendendo = " aprendendo";
        String a = " a";
        String usar = " usar";
        String StringB = " StringBuilder";
        String em = " em";
        String java1 = " Java!";

        String frase1 = stringBuilder.append(estou)
                .append(aprendendo)
                .append(a)
                .append(usar)
                .append(StringB)
                .append(em)
                .append(java1)
                .toString();

        System.out.println(frase1);

        StringBuilder novaFrase = stringBuilder.replace(23, 37, " Tipos não primitivos");
        System.out.println(novaFrase);
    }
}
