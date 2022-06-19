package br.com.infnet.PadraoProjetoSolid.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioPJ {

    private DadosFuncionario dadosFuncionario;
    private String empresaContratada;
    private Long diasPrevistoPermanencia;

}
