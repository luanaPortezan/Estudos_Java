package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados;

public class While {
    public static void main(String[] args) {
        int numInscritos = 100;
        int numCupons = 50;
        int primeirosInscritos = 1;

        while (primeirosInscritos <= numCupons) {
            imprimeMensagem("Inscrito de número " + primeirosInscritos + " ganhou um cupom!");
            primeirosInscritos++;
        }
    }

    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}