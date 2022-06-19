package br.com.infnet.PadraoProjetoSolid.model;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class DadosFuncionario {

    private String nome;
    private String endereco;
    private BigDecimal salarioBase;
    private EnumSetor setor;
    private EnumCargo cargo;
    private List<TelefoneFuncionario> listaTefefones;

    public Boolean EhCargoEstagiario() {
        return this.getCargo() == EnumCargo.ESTAGIARIO;
    }
    public Boolean EhCargoJunior() {
        return this.getCargo() == EnumCargo.JUNIOR;
    }

    public Boolean EhCargoPleno() {
        return this.getCargo() == EnumCargo.PLENO;
    }

    public Boolean EhCargoSenior() {
        return this.getCargo() == EnumCargo.SENIOR;
    }
}
