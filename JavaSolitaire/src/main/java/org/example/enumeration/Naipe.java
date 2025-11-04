package org.example.enumeration;

/**
 * Classe que enumera os naipes possíveis presentes no jogo.
 */
public enum Naipe {
    ESPADAS ("♠"),
    COPAS   ("♥"),
    PAUS    ("♣"),
    OUROS   ("♦");

    private String naipe;

    /**
     * Construtor que inicializa o naipe na criação da classe.
     * @param naipe para ser definido.
     */
    Naipe(String naipe){
        this.naipe=naipe;
    }

    /**
     * Método acessor do naipe como string.
     * @return o naipe como string
     */
    public String getNaipe(){
        return naipe;
    }
}
