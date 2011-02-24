package br.com.jcomputacao.com.cupomRepresentacao;


/**
 * 23/12/2009 15:48:20
 * @author Odair
 */
public enum TipoQuantidade {

    INTEIRA("I"), FRACIONARIA("F");
    private String simbolo;

    TipoQuantidade(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
