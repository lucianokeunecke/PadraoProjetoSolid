package br.com.infnet.PadraoProjetoSolid.enumerator;

public enum EnumCargo {

    ESTAGIARIO((byte) 1),
    JUNIOR((byte) 2),
    PLENO ((byte) 3),
    SENIOR((byte) 4);

    private final byte valor;

    EnumCargo(byte valorOpcao) {
        valor = valorOpcao;
    }

    public byte getValor() {
        return valor;
    }

}
