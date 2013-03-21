package br.com.jcomputacao.com.cupomRepresentacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 23/12/2009 15:40:28
 * @author Odair
 */
@XStreamAlias("item")
public class ItemRepresentacao {

    private String itemCodigo;
    private boolean isUtilizaDepartamento;
    private String departamento;
    private Double aliquota=0d;
    private String codigoAliquotaNaoTributada;
    private String descricao;
    private boolean isUtilizaUnidadeMedida;
    private String unidadeMedida;
    private Double valor;
    private Double valorUnitario;
    private AcrescimoDesconto acrescimoDesconto;
    private TipoAcrescimoDesconto tipoAcrescimoDesconto;
    private Double valorDoAcrescimoDesconto;
    private TipoQuantidade tipoDeQuantidade;
    private float quantidade;

    public AcrescimoDesconto getAcrescimoDesconto() {
        return acrescimoDesconto;
    }

    public void setAcrescimoDesconto(AcrescimoDesconto acrescimoDesconto) {
        this.acrescimoDesconto = acrescimoDesconto;
    }

    public String getCodigoAliquotaNaoTributada() {
        if (codigoAliquotaNaoTributada != null && !codigoAliquotaNaoTributada.equals("")) {
            return codigoAliquotaNaoTributada;
        } else {
            return "";
        }
    }

    public void setCodigoAliquotaNaoTributada(String aliquota) {
        this.codigoAliquotaNaoTributada = aliquota;
    }

    public Double getAliquota(){
        return this.aliquota;
    }

    public void setAliquota(double aliquota){
        this.aliquota = aliquota;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isIsUtilizaDepartamento() {
        return isUtilizaDepartamento;
    }

    public void setIsUtilizaDepartamento(boolean isUtilizaDepartamento) {
        this.isUtilizaDepartamento = isUtilizaDepartamento;
    }

    public boolean isIsUtilizaUnidadeMedida() {
        return isUtilizaUnidadeMedida;
    }

    public void setIsUtilizaUnidadeMedida(boolean isUtilizaUnidadeMedida) {
        this.isUtilizaUnidadeMedida = isUtilizaUnidadeMedida;
    }

    public String getItemCodigo() {
        return itemCodigo;
    }

    public void setItemCodigo(String itemCodigo) {
        this.itemCodigo = itemCodigo;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public TipoAcrescimoDesconto getTipoAcrescimoDesconto() {
        return tipoAcrescimoDesconto;
    }

    public void setTipoAcrescimoDesconto(TipoAcrescimoDesconto tipoAcrescimoDesconto) {
        this.tipoAcrescimoDesconto = tipoAcrescimoDesconto;
    }

    public TipoQuantidade getTipoDeQuantidade() {
        return tipoDeQuantidade;
    }

    public void setTipoDeQuantidade(TipoQuantidade tipoDeQuantidade) {
        this.tipoDeQuantidade = tipoDeQuantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorDoAcrescimoDesconto() {
        return valorDoAcrescimoDesconto;
    }

    public void setValorDoAcrescimoDesconto(Double valorDoAcrescimoDesconto) {
        this.valorDoAcrescimoDesconto = valorDoAcrescimoDesconto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
