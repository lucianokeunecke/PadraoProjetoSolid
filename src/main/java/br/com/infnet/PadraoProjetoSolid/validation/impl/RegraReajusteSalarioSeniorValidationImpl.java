package br.com.infnet.PadraoProjetoSolid.validation.impl;

import br.com.infnet.PadraoProjetoSolid.exception.LancaExcecao;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.math.BigDecimal;

public class RegraReajusteSalarioSeniorValidationImpl implements RegraReajusteSalarioValidation {

    @Override
    public void validar(FuncionarioCLT funcionarioCLT) {

        if (funcionarioCLT.getDadosFuncionario().EhCargoSenior()
         && funcionarioCLT.getDadosFuncionario().getSalario().compareTo(new BigDecimal("5000")) > 0) {
            throw new LancaExcecao("O salário base do sênior não pode ser maior que R$ 5.000,00 reais.");
        }
    }
}
