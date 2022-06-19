package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.service.RegraDeCalculo;

import java.math.BigDecimal;

public class RegraDeCalculoJunior implements RegraDeCalculo {
    @Override
    public void calcular(FuncionarioCLT funcionarioCLT) {
        if (funcionarioCLT.getDadosFuncionario().EhCargoJunior()) {
            BigDecimal valorSalario = funcionarioCLT.getDadosFuncionario().getSalario();
            funcionarioCLT.getDadosFuncionario().setSalario(valorSalario.add(valorSalario.multiply(new BigDecimal("0.20"))));
        }
    }
}
