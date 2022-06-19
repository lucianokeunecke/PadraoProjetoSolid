package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.service.RegraDeCalculo;

import java.math.BigDecimal;

public class RegraDeCalculoSenior implements RegraDeCalculo {

    @Override
    public void calcular(FuncionarioCLT funcionarioCLT) {
        if (funcionarioCLT.getDadosFuncionario().EhCargoSenior()) {
            BigDecimal valorSalario = funcionarioCLT.getDadosFuncionario().getSalario();
            funcionarioCLT.getDadosFuncionario().setSalario(valorSalario.add(valorSalario.multiply(new BigDecimal("0.1"))));
        }
    }
}
