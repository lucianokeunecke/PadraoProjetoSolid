package br.com.infnet.PadraoProjetoSolid.validation.impl;

import br.com.infnet.PadraoProjetoSolid.exception.LancaExcecao;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.math.BigDecimal;

public class RegraReajusteSalarioJuniorValidationImpl implements RegraReajusteSalarioValidation {

    @Override
    public void validar(FuncionarioCLT funcionarioCLT) {

        if (funcionarioCLT.getDadosFuncionario().ehCargoJunior()
         && funcionarioCLT.getDadosFuncionario().getSalarioBase().compareTo(new BigDecimal("1500")) > 0) {
            throw new LancaExcecao("O salário base do júnior não pode ser maior que R$ 1.500,00 reais.");
        }
    }
}
