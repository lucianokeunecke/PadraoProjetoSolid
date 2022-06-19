package br.com.infnet.PadraoProjetoSolid.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FuncionarioCLT {

    private DadosFuncionario dadosFuncionario;

    public void reajusteSalario(BigDecimal novoSalario) {
        this.dadosFuncionario.setSalarioBase(novoSalario);
    }

    public FuncionarioCLT () {
        this.dadosFuncionario = new DadosFuncionario();
    }
}
