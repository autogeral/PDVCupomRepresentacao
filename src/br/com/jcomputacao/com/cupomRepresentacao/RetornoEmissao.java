/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.com.cupomRepresentacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 29/12/2009 19:33:11
 * @author Murilo
 */
@XStreamAlias("retorno")
public class RetornoEmissao {
    public static final int STATUS_GERADO_SUCESSO = 1;
    public static final int STATUS_ERRO_COMUNICACAO = 0;
    public static final int STATUS_ERRO_EXECUCAO_NA_FUNCAO = -1;
    public static final int STATUS_ERRO_DURANTE_IMPRESSAO = -2;
    public static final int STATUS_ALIQUOTA_NAO_PROGRAMADA = -3;    
    public static final int STATUS_ARQUIVO_CONFIGURACAO_INDISPONIVEL_NO_WINDOWS = -4;
    public static final int STATUS_ERRO_PORTA_DE_COMUNICACAO = -5;
    public static final int STATUS_ERRO_GRAVANDO_ARQUIVO_STATUS_TXT = -8;
    public static final int FORMA_DE_PAGAMENTO_NAO_PROGRAMADA = -24;
    public static final int FORMA_DE_PAGAMENTO_NAO_FINALIZADA = -36;
    public static final int STATUS_IMPRESSORA_DESLIGADA = 50;
    private int numeroCurpomGerado;
    private String serialEcf;
    private int statusEmissao = STATUS_ERRO_EXECUCAO_NA_FUNCAO;
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getNumeroCurpomGerado() {
        return numeroCurpomGerado;
    }

    public void setNumeroCurpomGerado(int numeroCurpomGerado) {
        this.numeroCurpomGerado = numeroCurpomGerado;
    }

    public String getSerialEcf() {
        return serialEcf;
    }

    public void setSerialEcf(String serialEcf) {
        this.serialEcf = serialEcf;
    }

    public int getStatusEmissao() {
        return statusEmissao;
    }

    public void setStatusEmissao(int statusEmissao) {
        this.statusEmissao = statusEmissao;
    }
}
