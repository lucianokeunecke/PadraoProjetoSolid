package br.com.infnet.PadraoProjetoSolid.validation.impl;

import br.com.infnet.PadraoProjetoSolid.exception.LancaExcecao;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.math.BigDecimal;

public class RegraReajusteSalarioEstagiarioValidationImpl implements RegraReajusteSalarioValidation {

    @Override
    public void validar(FuncionarioCLT funcionarioCLT) {

        if (funcionarioCLT.getDadosFuncionario().EhCargoEstagiario()
         && funcionarioCLT.getDadosFuncionario().getSalarioBase().compareTo(new BigDecimal("1000")) > 0) {
            throw new LancaExcecao("O salário base do estagiário não pode ser maior que R$ 1.000,00 reais.");
        }
    }
}
