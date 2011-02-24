package br.com.jcomputacao.com.cupomRepresentacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 23/12/2009 15:54:15
 * @author Odair
 */
@XStreamAlias("modoPagamento")
public class ModoPagamentoRepresentacao {

    private String descricaoFormaDePagamento;
    private Double valor;

    public String getDescricaoFormaDePagamento() {
        return descricaoFormaDePagamento;
    }

    public void setDescricaoFormaDePagamento(String descricaoFormaDePagamento) {
        this.descricaoFormaDePagamento = descricaoFormaDePagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
