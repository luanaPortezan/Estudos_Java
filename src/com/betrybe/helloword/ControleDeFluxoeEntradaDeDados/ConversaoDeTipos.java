package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        // O Java conta com diversos mecanismos para realização de conversão entre tipos (casting)
        // O casting implícito é feito automaticamente sem perda de dados, o valor 10 será 10 do início ao fim do programa exemplo, com algumas ressalvas no que diz respeito a ponto flutuante (10.0).
        short numeroInteiroPequeno = 10;
        int numeroInteiro = numeroInteiroPequeno;
        long numeroInteiroBemGrande = numeroInteiro;
        float numeroDePontoFlutuante = numeroInteiro;
        double numeroDePontoFlutuanteDuasVezesMaisPreciso = numeroInteiro;

        // A conversão explícita pode ser feita utilizando-se de parênteses com o tipo para qual desejamos converter
        // na conversão explícita, estamos interessados em levar um tipo maior para dentro de um tipo menor (menos espaço em memória), nesse caso, poderemos perder dados!!! CUIDADO!!!
        double numeroDePontoFlutuante1 = 40_000_000.49d; // Valor bem grande.
        int numeroInteiro1 = (int) numeroDePontoFlutuante1; // O valor à direita do ponto será perdido.
        short numeroInteiroPequeno1 = (short) numeroInteiro1; // O tipo short armazena valores entre -32.768 e 32.767, muita coisa será perdida.
    }
}
