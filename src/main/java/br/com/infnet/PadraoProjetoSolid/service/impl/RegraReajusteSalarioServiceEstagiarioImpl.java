package br.com.infnet.PadraoProjetoSolid.service.impl;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.service.RegraReajusteSalarioService;

import java.math.BigDecimal;

public class RegraReajusteSalarioServiceEstagiarioImpl implements RegraReajusteSalarioService {

    @Override
    public BigDecimal calcular(FuncionarioCLT funcionarioCLT) {
        BigDecimal valorSalario = funcionarioCLT.getDadosFuncionario().getSalarioBase();
        if (funcionarioCLT.getDadosFuncionario().EhCargoEstagiario()) {
            return valorSalario.multiply(new BigDecimal("0.25"));
        }
        return valorSalario;
    }
}
