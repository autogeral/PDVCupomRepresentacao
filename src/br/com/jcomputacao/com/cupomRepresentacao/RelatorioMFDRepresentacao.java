package br.com.jcomputacao.com.cupomRepresentacao;

/**
 * Representa os parametros passados a impressora para gerar
 * o relatorio Sintegra
 * @author Odair
 */
public class RelatorioMFDRepresentacao {
    
    private int iRelatorios;
    //o path e nome do arquivo onde o relatorio ser� gerado. Exemplo: "C:\SINTEGRA.TXT"
    private String pathDeDestino;
    //o mes, no formato MM.
    private String mes;
    //o ano, no formato AAAA.
    private String ano;
    private String razaoSocial;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String telefone;
    private String fax;
    private String contato;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * iRelatorios: variavel INTEIRA com o tamanho de um byte, onde:
     * 1: gera o relatorio tipo 60M (Mestre);
     * 2: gera o relatorio tipo 60A (Anal�tico)
     * 4: gera o relatorio tipo 60D (Di�rio);
     * 8: gera o relatorio tipo 60I (Item);
     * 16: gera o relatorio tipo 60R (Resumo Mensal) e;
     * 32: gera o relatorio tipo 75.
     * @return 
     **/
    public int getiRelatorios() {
        return iRelatorios;
    }

    /**
     * iRelatorios: variavel INTEIRA com o tamanho de um byte, onde:
     * 1: gera o relatorio tipo 60M (Mestre);
     * 2: gera o relatorio tipo 60A (Anal�tico)
     * 4: gera o relatorio tipo 60D (Di�rio);
     * 8: gera o relatorio tipo 60I (Item);
     * 16: gera o relatorio tipo 60R (Resumo Mensal) e;
     * 32: gera o relatorio tipo 75.
     * @return 
     **/
    public void setiRelatorios(int iRelatorios) {
        this.iRelatorios = iRelatorios;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPathDeDestino() {
        return pathDeDestino;
    }

    /**
     * Local onde o arquivo MFD sera salvo
     * @param pathDeDestino
     */
    public void setPathDeDestino(String pathDeDestino) {
        this.pathDeDestino = pathDeDestino;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
