package org.example.models;

import java.util.HashSet;

/**
 * Classe que representa a mesa do jogo com diferentes montes de cartas
 */
public class Mesa {
    private HashSet<Base> base;
    private HashSet<Descarte> descarte;
    private HashSet<Estoque> estoque;
    private HashSet<Coluna> coluna;

    /**
     * Construtor que inicializa a quantidade de montes da mesa:
     * - 4 bases
     * - 1 pilha de estoque
     * - 1 pilha de descarte
     * - 7 colunas
     */
    public Mesa() {
        this.base = new HashSet<>(4);
        this.descarte = new HashSet<>(1);
        this.estoque = new HashSet<>(1);
        this.coluna = new HashSet<>(7);
    }

    /**
     * Método acessor de coluna.
      * @return a coluna
     */
    public HashSet<Coluna> getColuna() {return coluna;}

    /**
     * Método acessor do estoque.
     * @return o estoque
     */
    public HashSet<Estoque> getEstoque() {return estoque;}

    /**
     * Método acessor do descarte.
     * @return o descarte.
     */
    public HashSet<Descarte> getDescarte() {return descarte;}

    /**
     * Método acessor das bases.
     * @return a base.
     */
    public HashSet<Base> getBase() {return base;}
}
