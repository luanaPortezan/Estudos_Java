package com.betrybe.helloword;

//A classe wrapper nada mais é que uma classe que nos permite usar os tipos primitivos como objetos. Uma das maiores vantagens de usar os objetos dos tipos primitivos, providos pelas classes wrapper, é o acesso a diversos métodos que são disponibilizados para eles.

public class ClassesWrapper {
    public static void main(String[] args) {
        //Por exemplo, o tipo primitivo int possui uma classe wrapper associada chamada Integer. Ambas podem armazenar um número inteiro, mas a forma com que isso acontece é diferente.
        Integer valor = 7;  // autoboxing (autoempacotamento)

        int outroValor = valor; // unboxing (desempacotamento)

        // as classes wrapper em Java também fornecem métodos úteis para manipulação de dados, como a conversão de valores de e para Strings, comparação de valores e operações matemáticas:
        int valor1 = 42;

        System.out.println(
                Integer.toBinaryString(valor1) //  o método toBinaryString da classe Integer para converter o número inteiro em uma representação binária.
        );
    }
}
