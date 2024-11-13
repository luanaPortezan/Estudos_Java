package com.betrybe.helloword.trybank;

public class ContaBancaria {
//    double saldo = 0;

//    double saldo;
//    public ContaBancaria() {
//        this.saldo = 0;
//    }

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

//    tipodeRetorno nomeDoMetodo(tipoDoParametro nomeDoParametro) {
//        corpo do método
//tipoDeRetorno: essa parte da declaração é o tipo do valor que o método vai retornar — e o tipo de valor deve sempre ser indicado por nós. Caso o interesse seja um método que não retorne nenhum valor, indicamos que o retorno é do tipo void.
//nomeDoMetodo: essa parte da declaração é o identificador, usado para referenciar e chamar o método no nosso programa.
//corpo do método: nessa parte são incluídas as instruções usadas para desempenhar alguma ação, como somar dois elementos, alterar o valor de algum atributo do objeto, entre outras. O corpo do método deve estar dentro das chaves { }.

    void mostraMensagem() {
        System.out.println("Conta bancária acessada.");
    }

    void depositar(double valor) {
        this.saldo += valor; // usamos a palavra-chave this para indicar que queremos acessar o atributo saldo do objeto em que o método está sendo executado.
    }

    double converteMoeda(float total, float cambio) {
        return total * cambio;
    }

}

