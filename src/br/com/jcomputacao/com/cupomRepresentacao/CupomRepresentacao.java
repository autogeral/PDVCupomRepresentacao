package br.com.jcomputacao.com.cupomRepresentacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;
import java.util.List;

/**
 * 23/12/2009 15:28:42
 * @author Odair
 */
@XStreamAlias("cupom")
public class CupomRepresentacao {

    private String cpfCnpj;
    private Double valorTotalDaVenda;
    private AcrescimoDesconto acrescimoDescontoNoCupom;
    private TipoAcrescimoDesconto tipoAcrescimoDescontoNaVenda;
    private Double valorAcrescimoDescontoNaVenda;
    private List<ItemRepresentacao> itens;
    private List<ModoPagamentoRepresentacao> modosDePagamento;
    private List<String> mensagem;

    public AcrescimoDesconto getAcrescimoDescontoNoCupom() {
        return acrescimoDescontoNoCupom;
    }

    public void setAcrescimoDescontoNoCupom(AcrescimoDesconto acrescimoDescontoNoCupom) {
        this.acrescimoDescontoNoCupom = acrescimoDescontoNoCupom;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public List<ItemRepresentacao> getItens() {
        return itens;
    }

    public void setItens(List<ItemRepresentacao> itens) {
        this.itens = itens;
    }

    public void addItem(ItemRepresentacao item) {
        if (this.itens == null) {
            this.itens = new ArrayList<ItemRepresentacao>();
        }
        this.itens.add(item);
    }

    public List<ModoPagamentoRepresentacao> getModosDePagamento() {
        return modosDePagamento;
    }

    public void setModosDePagamento(List<ModoPagamentoRepresentacao> modosDePagamento) {
        this.modosDePagamento = modosDePagamento;
    }

    public void addModoDePagamento(ModoPagamentoRepresentacao modoDePagamentoRepresentacao) {
        if (this.modosDePagamento == null) {
            modosDePagamento = new ArrayList<ModoPagamentoRepresentacao>();
        }
        modosDePagamento.add(modoDePagamentoRepresentacao);
    }

    public TipoAcrescimoDesconto getTipoAcrescimoDescontoNaVenda() {
        return tipoAcrescimoDescontoNaVenda;
    }

    public void setTipoAcrescimoDescontoNaVenda(TipoAcrescimoDesconto tipoAcrescimoDescontoNaVenda) {
        this.tipoAcrescimoDescontoNaVenda = tipoAcrescimoDescontoNaVenda;
    }

    public Double getValorAcrescimoDescontoNaVenda() {
        return valorAcrescimoDescontoNaVenda;
    }

    public void setValorAcrescimoDescontoNaVenda(Double valorAcrescimoDescontoNaVenda) {
        this.valorAcrescimoDescontoNaVenda = valorAcrescimoDescontoNaVenda;
    }

    public Double getValorTotalDaVenda() {
        return valorTotalDaVenda;
    }

    public void setValorTotalDaVenda(Double valorTotalDaVenda) {
        this.valorTotalDaVenda = valorTotalDaVenda;
    }

    public List<String> getMensagem() {
        return mensagem;
    }

    public void setMensagem(List<String> mensagem) {
        this.mensagem = mensagem;
    }

    public boolean addMensagemLine(String linha){
        if(this.mensagem == null){
            this.mensagem = new ArrayList<String>();
        }
        return mensagem.add(linha);
    }


}
