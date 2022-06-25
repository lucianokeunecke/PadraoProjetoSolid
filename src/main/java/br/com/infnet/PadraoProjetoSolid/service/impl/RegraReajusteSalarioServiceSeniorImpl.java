package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.service.RegraReajusteSalarioService;

import java.math.BigDecimal;

public class RegraReajusteSalarioServiceSeniorImpl implements RegraReajusteSalarioService {

    @Override
    public BigDecimal calcular(FuncionarioCLT funcionarioCLT) {
        BigDecimal valorSalario = funcionarioCLT.getDadosFuncionario().getSalarioBase();
        if (funcionarioCLT.getDadosFuncionario().ehCargoSenior()) {
            return valorSalario.add(valorSalario.multiply(new BigDecimal("0.1")));
        }
        return valorSalario;
    }
}
