package org.example.models;

/**
 * Classe que herda o monte de cartas, inicializada com 1 e no máximo 7 cartas, pode ter no máximo 20 cartas.
 */
public class Coluna extends MonteCartas{
    private int coluna;
    //construir regra de loop na instanciação inicial para:
    // se é a coluna 1, possui uma carta inicialmente,
    // se é a coluna 2, possui 2 cartas e é assim por diante
}
