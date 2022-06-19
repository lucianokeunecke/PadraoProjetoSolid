package br.com.infnet.PadraoProjetoSolid.model;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class FuncionarioPJ {

    private DadosFuncionario dadosFuncionario;
    private String empresaContratada;
    private Long diasPrevistoPermanencia;

    public FuncionarioPJ(String nome, String endereco, BigDecimal salarioBase, EnumSetor setor, EnumCargo cargo, List<TelefoneFuncionario> listaTefefones) {
        this.dadosFuncionario = new DadosFuncionario(nome, endereco, salarioBase, setor, cargo, listaTefefones);
    }
}
