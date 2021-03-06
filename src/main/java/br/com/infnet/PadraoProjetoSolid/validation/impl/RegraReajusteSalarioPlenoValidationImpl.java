package br.com.infnet.PadraoProjetoSolid.validation.impl;

import br.com.infnet.PadraoProjetoSolid.exception.LancarMensagemExcecao;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;

import java.math.BigDecimal;

public class RegraReajusteSalarioPlenoValidationImpl implements RegraReajusteSalarioValidation {

    @Override
    public void validar(FuncionarioCLT funcionarioCLT) {

        if (funcionarioCLT.getDadosFuncionario().ehCargoPleno()
                && funcionarioCLT.getDadosFuncionario().getSalarioBase().compareTo(new BigDecimal("3000")) > 0) {
            throw new LancarMensagemExcecao("O salário base do pleno não pode ser maior que R$ 3.000,00 reais.");
        }
    }
}
