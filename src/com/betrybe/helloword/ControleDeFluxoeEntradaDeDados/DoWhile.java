package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

        int tentativas = 0;
        boolean encomendaRecebida = false;
        String log;

        do {
            tentativas += 1;
            log = "Tentando entregar a correspondência, tentativa " + tentativas;
            imprimeLog(log);
            encomendaRecebida = tentarEntregar();
        } while (!encomendaRecebida);

        log = "Correspondência entregue na tentativa " + tentativas;
        imprimeLog(log);
    }
    static boolean tentarEntregar(){
        Random random = new Random();
        double chanceDeSucesso = random.nextDouble();
        return chanceDeSucesso > 0.5; // Ajuste a chance de sucesso conforme necessário
    }

    static void imprimeLog(String log) {
        System.out.println(log);
    }
}
