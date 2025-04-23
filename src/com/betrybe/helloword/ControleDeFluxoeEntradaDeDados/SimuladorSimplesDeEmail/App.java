package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados.SimuladorSimplesDeEmail;

public class App {
    public static void main(String[] args) {
        /*
        Informações do texto separadas por ponto e vírgula:
        1. De quem  é o email
        2. Para quem o email será endereçado
        3. Se haverá cópia oculta do email para o diretor da empresa - Se for vogal
        4. Qual é o assunto do email
        5. A mensagem
        */
        String info = "noreply@mycompany.com;onetaxi@company.com;a;De {de} para {para};Bom dia, amigo!";
        Email email = new Email();
        email.enviar(info);
    }
}
