package org.example.controllers;

/**
 * Classe responsável por imprimir/exibir mensagens para o jogador (saída de informação).
 */
public class OutputController {

    /**
     * Exibição teste
     */
    public void imprimirTeste() {
        String espadas = "♠";
        String copas = "♥";
        String paus = "♣";
        String ouros = "♦";
        String backgroundWhite = "\u001b[107m";
        String foregroundBlack = "\u001b[30m";
        String foregroundRed = "\u001b[91m";
        String ansiResetado = "\u001b[0m";
        System.out.println(backgroundWhite +
                foregroundBlack + espadas +" "+
                foregroundRed + copas +" "+
                foregroundBlack + paus +" "+
                foregroundRed + ouros + ansiResetado);

    }
}
