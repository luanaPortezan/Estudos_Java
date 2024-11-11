package com.betrybe.sistemadenota;

public class Inscricao {
    // Cria um array com os inscritos
    static String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
            "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

    // Determina o número máximo de vagas
    static final int numeroVagas = 10;

    // Criamos um vetor vazio com espaço igual ao número de vagas
    static String[] vagas = new String[numeroVagas];

    // Determinamos quantas vagas já foram preenchidas
    static int vagaAtual = 0; // Inicialização da variável

    // Percorremos todos inscritos e adicionamos nas vagas até que o número total de vagas seja preenchido
    String inscrito = "Indefinido";
    String log;

    public static void main(String[] args) {
        Inscricao inscricao = new Inscricao();

        while (vagaAtual < numeroVagas) { // Enquanto houver vagas disponíveis
            String inscrito = inscritos[vagaAtual];
            String log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual++; // Incrementa a vaga atual
            System.out.println(log);
        }
    }
}