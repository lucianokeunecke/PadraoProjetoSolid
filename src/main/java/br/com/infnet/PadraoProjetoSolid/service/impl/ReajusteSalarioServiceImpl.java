package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.util.List;

public class ReajusteSalarioServiceImpl {
    private List<RegraReajusteSalarioValidation> listaValidacoes;

    public ReajusteSalarioServiceImpl(List<RegraReajusteSalarioValidation> listaValidacoes) {
        this.listaValidacoes = listaValidacoes;
    }

    public void ReajustarSalario(FuncionarioCLT funcionarioCLT) {
        this.listaValidacoes.forEach(validacao -> validacao.validar(funcionarioCLT));
        funcionarioCLT.ReajusteSalario(funcionarioCLT.getDadosFuncionario().getCargo().getRegraReajusteSalario().calcular(funcionarioCLT));
    }
}
