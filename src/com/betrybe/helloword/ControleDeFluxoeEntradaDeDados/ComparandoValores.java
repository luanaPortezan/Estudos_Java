package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados;

import java.util.Scanner;

public class ComparandoValores {
    public static void main(String[] args) {
        //COMPRAÇÃO COM ==
        int numero = 5; // Atribuição por valor.
        System.out.println(numero == 5); // Imprime true.

        //COMPARAÇÃO QUE PODE RECEBER VALORES NULL
        Scanner scanner = new Scanner(System.in);

        String hello = "Olá"; // Novo objeto do tipo String instanciado.
        System.out.println("Diga Olá: ");
        String input = scanner.next(); // Novo objeto do tipo String instanciado.

// Objetos diferentes, mesmo que com o mesmo valor serão tratados como diferentes pelo comparador ==.
        if (hello == input) {
            System.out.println("Isso não será impresso.");
        }

        if (hello != input) {
            System.out.println("Isso será impresso.");
        }

        if (hello == hello) {
            System.out.println("Isso também será impresso, é o mesmo objeto.");
        }

// Verifica se o conteúdo armazenado em ambos os objetos é o mesmo através do método equals.
        if (hello.equals(input)) {
            System.out.println("Isso pode ser impresso se Olá for inserido em nosso terminal.");
        }scanner.close();
    }
}
