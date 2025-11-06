package org.example.enumeration;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Classe que enumera os naipes possíveis presentes no jogo.
 */
public enum Naipe {
    COPAS   ("♥"),
    ESPADAS ("♠"),
    OUROS   ("♦"),
    PAUS    ("♣");

    private String naipeSimbolo;

    // armazen os enumerados em ordem alfabética
    private static List<Naipe> ORDEM_ALFABETICA = Arrays // retorna um array cria um array com todos os enumerados
            .stream(Naipe.values()) // cria um Stream de objetos a partir dos valores de um array existente
            .sorted(Comparator.comparing(Naipe::name))//diz aqui classifica (copara comparando o enumerado pelo nome)
            .collect(Collectors.toList());// coletar para lista em ordem

    // armazena o MAPPING (indice -> Naipe) da lista em ordem alfabetica
    private static Map<Integer, Naipe> INDEX_NAIPE = IntStream //retorna uma stream de int primitivo
            .range(0, ORDEM_ALFABETICA.size())// cria um Stream de números inteiros primitivos que comeca em zero e vai ate o tamanho da lista ordem alfabetica
            .boxed() // Converte int (primitivo) para Integer (objeto)
            .collect(Collectors.toMap(//coletar para o map
                    i -> i, // cria uma chave identificadora pra cada naipe
                    i -> ORDEM_ALFABETICA.get(i) // o valor é o Naipe na posição da lista em odem alfabetica
            ));


    /**
     * Método acessor do naipe pelo int
     * @return o Map com a posição (0, 1, 2, 3) e o Naipe correspondente na ordem alfabética.
     */
    public static Naipe getNaipeByIndex(int index) {
        return INDEX_NAIPE.get(index);
    }

    Naipe(String naipeSimbolo){
        this.naipeSimbolo = naipeSimbolo;
    }

    /**
     * Método acessor do naipe como string.
     * @return o naipe como string
     */
    public String getNaipeSimbolo(){return naipeSimbolo;}

    /**
     * Método que retorna a lista de naipes ordenada alfabeticamente.
     * @return a List de Naipes
     */
    public List<Naipe> getOrdemAlfabetica() {
        return ORDEM_ALFABETICA;
    }
}
