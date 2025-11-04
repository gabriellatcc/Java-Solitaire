package org.example.enumeration;

/**
 * Classe que enumera os valores possíveis presentes no jogo.
 */
public enum Valor {
    AS      ("A"),
    DOIS    ("2"),
    TRES    ("3"),
    QUATRO  ("4"),
    CINCO   ("5"),
    SEIS    ("6"),
    SETE    ("7"),
    OITO    ("8"),
    NOVE    ("9"),
    DEZ     ("10"),
    VALETE  ("J"),
    DAMA    ("Q"),
    REI     ("K");

    private String valor;


    /**
     * Construtor que inicializa o valor na criação da classe.
     * @param valor para ser definido.
     */
    Valor(String valor) {
        this.valor = valor;
    }

    /**
     * Método acessor do valor como string.
     * @return o valor como string
     */
    public String getValor() {
        return valor;
    }
}
