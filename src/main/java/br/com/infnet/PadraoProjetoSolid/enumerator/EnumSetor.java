package br.com.infnet.PadraoProjetoSolid.enumerator;

public enum EnumSetor {

    DESENVOLVIMENTO((byte) 1),
    DEVOPS((byte) 2),
    BANCO_DE_DADOS ((byte) 3);

    private final byte valor;

    EnumSetor(byte valorOpcao) {
        valor = valorOpcao;
    }

    public byte getValor() {
        return valor;
    }

}
