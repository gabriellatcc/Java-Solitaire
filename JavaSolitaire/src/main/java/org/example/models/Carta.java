package org.example.models;

import org.example.enumeration.Valor;
import org.example.enumeration.Naipe;

/**
 * Subclasse que representa o objeto carta, possui um valor e naipe definidos quando seu construtor for chamado.
 * Se a carta criada tiver um valor ja presente em um naipe, pertencerá a outro naipe
 */
public class Carta {
    private Naipe naipe;
    private Valor valor;
    private Boolean virada;

    public Carta() {

    }

    /**
     * Estabelece a regra para criação de cartas diferentes
     */
    public void definirRegra(){

    }

    /**
     * Acessa e retorna o naipe da carta
     * @return o naipe.
     */
    public Naipe getNaipe(){
        return naipe;
    }

    /**
     * Acessa e retorna o valor da carta
     * @return o valor da carta.
     */
    public Valor getValor(){
        return valor;
    }

    /**
     * Acessa e retorna o estado de carta virada ou não
     * @return o estado da carta.
     */
    public Boolean getVirada() {
        return virada;
    }

    /**
     * Modifica o estado de carta virada ou não
     * @param virada o estado da carta.
     */
    public void setVirada(Boolean virada) {
        this.virada = virada;
    }
}
