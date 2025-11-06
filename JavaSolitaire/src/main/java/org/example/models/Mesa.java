package org.example.models;

import org.example.enumeration.Naipe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Classe que representa a mesa do jogo com diferentes montes de cartas
 */
public class Mesa {
    private HashSet<Carta> baralho;
    private List<MonteCartas> descarte;
    private List<MonteCartas> estoque;
    private List<MonteCartas> coluna;
    private List<MonteCartas> base;

    /**
     * Construtor que inicializa a quantidade de montes da mesa:
     * - 4 bases
     * - 1 pilha de estoque
     * - 1 pilha de descarte
     * - 7 colunas
     */
    public Mesa() {
        this.baralho = new HashSet<>(52);
        embaralhar();
        this.base = new ArrayList<>(4);
        this.descarte = new ArrayList<>(1);
        this.estoque = new ArrayList<>(1);
        this.coluna = new ArrayList<>(7);
    }

    private void embaralhar() {
        List <Carta> cartasCriadas = new ArrayList<>();
        Random naipeAleatorio = new Random(4);
        Random valorAleatorio = new Random(13);

        // cria as 52 cartas
        for (int i = 0; i < 52; i++) {
            Carta carta = new Carta();
            cartasCriadas.add(carta);
        }
        // define o naipe das cartas criadas
        for (int j = 0; j < 52; j++) {
            Carta cartaAdefinirNaipe = cartasCriadas.get(j);
            cartaAdefinirNaipe.setNaipe(naipeAleatorio.nextInt());
        }

        baralho.addAll(cartasCriadas);
    }

    public void definirColunaInicial(){
        for (int i = 0; i < 4; i++) {
            getColuna().get(i).setTamanho(i);
        }
    }

    /**
     * Método acessor de coluna.
      * @return a coluna
     */
    public List<MonteCartas> getColuna() {return coluna;}

    public void setColuna(List<MonteCartas> coluna) {
        this.coluna = coluna;
    }

    /**
     * Método acessor do estoque.
     * @return o estoque
     */
    public List<MonteCartas> getEstoque() {return estoque;}

    /**
     * Método acessor do descarte.
     * @return o descarte.
     */
    public List<MonteCartas> getDescarte() {return descarte;}

    /**
     * Método acessor das bases.
     * @return a base.
     */
    public List<MonteCartas> getBase() {return base;}
}
