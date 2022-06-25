package br.com.infnet.PadraoProjetoSolid.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelefoneFuncionario {

    private String numeroTelefone;

    public TelefoneFuncionario(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
