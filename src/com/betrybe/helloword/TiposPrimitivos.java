package com.betrybe.helloword;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte c = 9;
        System.out.println(c);

        short num = 300;
        short formatadaComUnderscore = 20_000; // variável
        System.out.println(num);
        System.out.println(formatadaComUnderscore); // 20000

        int numeroInteiro = 10;
        int a = 10, b = 20, soma; // inicialização de variáveis inline
        soma = a + b; // atribuição da soma da variável a + b para a variável soma
        System.out.println(numeroInteiro); // 10
        System.out.println(soma); // 30

        long numA = 102040;
        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
        System.out.println(numA);
        System.out.println(numB);

        // No Java, é necessário adicionar a letra f no final do número para indicar que ele é do tipo float. O motivo é que a precisão entre float e double são diferentes. Se não inserirmos a letra f, o Java entenderá que você está tentando atribuir um valor do tipo double a uma variável do tipo float.
        float numC = -101.23f;
        float numD = 2.356F;
        System.out.println(numC + numD); // -98.874

        // Nas variáveis valorUm e valorTres fizemos uma atribuição sem de nenhuma letra para identificar o tipo double enquanto na variável valorDois utilizamos a letra d no final do número.
        double valorUm = 0.5; // double inicializado naturalmente
        double valorDois = 0.5d; // double definido explicitamente
        double valorTres = 0.123456789; // várias casas decimais
        System.out.println(valorUm); // 0.5
        System.out.println(valorDois); // 0.5
        System.out.println(valorTres); // 0.123456789

        boolean isBoolean = true; // outros exemplos: isGreaterThan, isFlexible, isStarted
        boolean ehNumero = false; // outros exemplos: ehMaiorDeIdade, ehCedo, ehValido
        System.out.println(isBoolean);
        System.out.print(ehNumero);

        char letraA = 'a';
        char letraAMaiuscula = 'A';
        System.out.println(letraA); // a
        System.out.println(letraAMaiuscula); // A

        System.out.println(letraA == letraAMaiuscula); //false
    }
}
