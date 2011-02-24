package br.com.jcomputacao.com.cupomRepresentacao;

/**
 *
 * @author Odair
 */
public enum TipoRelatorioMFD {

    MESTRE(1), ANALITICO(2), DIARIO(4), ITEM(8), MENSAL(16), TIPO_75(32);
    private int codigo;

    TipoRelatorioMFD(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
