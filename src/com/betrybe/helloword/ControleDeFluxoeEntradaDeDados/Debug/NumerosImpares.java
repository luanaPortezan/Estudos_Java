package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados.Debug;

public class NumerosImpares {
    public static void imprimir() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
