package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados;

import java.util.Scanner;

public class ConvertendoStringsParaOutrosTipos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        String input1 = scanner.next();
        System.out.print("Entre com o segundo número: ");
        String input2 = scanner.next();

        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        int resultado = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado);



        // Podemos converter Strings “numéricas” para qualquer tipo numérico (desde que o valor não exceda o tamanho máximo suportado por aquele tipo, lembre-se da perda de dados) utilizando do nome da classe wrapper seguida da função de conversão para o tipo alvo: ClasseWrapper.parseTipoAlvo(minhaString):
        System.out.print("Entre com o número: ");
        String input = scanner.next();

        short numeroInteiroPequeno = Short.parseShort(input); // Converte para short.
        long numeroInteiroBemGrande = Long.parseLong(input); // Converte para long.
        float numeroDePontoFlutuante = Float.parseFloat(input); // Converte para float.
        double numeroDePontoFlutuanteComPrecisaoDupla = Double.parseDouble(input); // Converte para double.
        scanner.close();

        // Imprimindo os tipos (LÓGICA NÃO APLICADA, FALTA OS METODOS  getClass().getSimpleName())
//        System.out.println("O tipo de numeroInteiroPequeno é: " + numeroInteiroPequeno.getClass().getSimpleName());
//        System.out.println("O tipo de numeroInteiroBemGrande é: " + numeroInteiroBemGrande.getClass().getSimpleName());
//        System.out.println("O tipo de numeroDePontoFlutuante é: " + numeroDePontoFlutuante.getClass().getSimpleName());
//        System.out.println("O tipo de numeroDePontoFlutuanteComPrecisaoDupla é: " + numeroDePontoFlutuanteComPrecisaoDupla.getClass().getSimpleName());
    }
}
