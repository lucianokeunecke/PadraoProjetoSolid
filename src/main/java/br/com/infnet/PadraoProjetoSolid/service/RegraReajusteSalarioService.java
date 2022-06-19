package br.com.infnet.PadraoProjetoSolid.service;

import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;

import java.math.BigDecimal;

public interface RegraReajusteSalarioService {
    BigDecimal calcular(FuncionarioCLT funcionarioCLT);
}
