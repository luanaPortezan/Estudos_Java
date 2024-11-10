package com.betrybe.sistemadenota;

import

public class SistemaDeNota {
    public static void main(String[] args) {
        double mediaFinal = 7.5;
        String resultado =  "INDEFINIDO";

        if (mediaFinal >= 7) {
            resultado = "APROVADA";
        } else if (mediaFinal >= 6.0) {
            resultado = "REALIZAR PROVA BONUS";
        } else {
            resultado = "REPROVADA";
        }

        int numero;
        String log;

        // Leia como:
        //   PARA numero = 1,
        //   contanto que numero <= 10,
        //   faça o loop e depois faça numero += 1
        for (numero = 1; numero <= 10; numero += 1) {
            log = "O Número atual é: " + numero + "\n";
            System.out.println(log);
        }
    }
}
