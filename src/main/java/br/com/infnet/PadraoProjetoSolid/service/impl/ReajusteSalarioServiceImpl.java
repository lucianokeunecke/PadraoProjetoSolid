package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.util.List;

public class ReajusteSalarioServiceImpl {
    private List<RegraReajusteSalarioValidation> listaValidacoes;
    private FuncionarioCLT funcionarioCLT;

    public ReajusteSalarioServiceImpl(List<RegraReajusteSalarioValidation> listaValidacoes, FuncionarioCLT funcionarioCLT) {
        this.listaValidacoes = listaValidacoes;
        this.funcionarioCLT = funcionarioCLT;
    }

    public void ReajustarSalario() {
        this.listaValidacoes.forEach(validacao -> validacao.validar(funcionarioCLT));
        this.funcionarioCLT.reajusteSalario();
    }
}
