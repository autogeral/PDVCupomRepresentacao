package br.com.jcomputacao.com.cupomRepresentacao;

/**
 * 23/12/2009 15:49:15
 * @author Odair
 */
public enum TipoAcrescimoDesconto {

    VALOR("$"), PORCENTAGEM("%"), NENHUM("NENHUM");
    private String simbolo;

    TipoAcrescimoDesconto(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
