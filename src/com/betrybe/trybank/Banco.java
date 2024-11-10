package com.betrybe.trybank;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000); // Conta com saldo inicial de R$ 1000
//        System.out.println(conta.saldo); // Imprime o saldo inicial


        conta.mostraMensagem();
        conta.depositar(500); // Agora o saldo será de R$ 1500
        System.out.println(conta.saldo); // Imprime o saldo após o depósito


        double valorConvertido = conta.converteMoeda(30, 5);
//        System.out.println(valorConvertido);
    }
}
