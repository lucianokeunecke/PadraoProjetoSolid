package br.com.infnet.PadraoProjetoSolid.model;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class DadosFuncionario {

    private String nome;
    private String endereco;
    private BigDecimal salarioBase;
    private EnumSetor setor;
    private EnumCargo cargo;
    private List<TelefoneFuncionario> listaTefefones;

    public DadosFuncionario (String nome, String endereco, BigDecimal salarioBase, EnumSetor setor, EnumCargo cargo, List<TelefoneFuncionario> listaTefefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.setor = setor;
        this.cargo = cargo;
        this.listaTefefones = listaTefefones;
    }

    protected void setSalario(BigDecimal novoSalario) {
        this.salarioBase = novoSalario;
    }

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
