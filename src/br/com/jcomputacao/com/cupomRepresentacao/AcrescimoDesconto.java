package br.com.jcomputacao.com.cupomRepresentacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 23/12/2009 15:50:23
 * @author Odair
 */
@XStreamAlias("acrescimoDesconto")
public enum AcrescimoDesconto {

    NENHUM("NENHUM"), ACRESCIMO("A"), DESCONTO("D");
    private String simbolo;

    AcrescimoDesconto(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
}
