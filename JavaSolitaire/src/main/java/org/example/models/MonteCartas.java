package org.example.models;

import java.util.HashSet;

/**
 * Superclasse que define a lista de cartas sem quantidade.
 */
public class MonteCartas {
    private HashSet<Carta> monte = new HashSet<>();

    /**
     * Acessa o monte de cartas
     * @return o monte de cartas
     */
    public HashSet<Carta> getMonte() {
        return monte;
    }

    /**
     * Modifica o monte de cartas
     * @param monte o monte de cartas a ser modificado
     */
    public void setMonte(HashSet<Carta> monte) {
        this.monte = monte;
    }
}
