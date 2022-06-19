package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.service.RegraReajusteSalarioService;

import java.math.BigDecimal;

public class RegraReajusteSalarioServicePlenoImpl implements RegraReajusteSalarioService {
    @Override
    public void calcular(FuncionarioCLT funcionarioCLT) {
        if (funcionarioCLT.getDadosFuncionario().EhCargoPleno()) {
            BigDecimal valorSalario = funcionarioCLT.getDadosFuncionario().getSalarioBase();
            funcionarioCLT.getDadosFuncionario().setSalarioBase(valorSalario.add(valorSalario.multiply(new BigDecimal("0.15"))));
        }
    }
}
