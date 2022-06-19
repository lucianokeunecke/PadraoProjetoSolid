package br.com.infnet.PadraoProjetoSolid.service;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;

import java.math.BigDecimal;

public interface RegraDeCalculo {
    void calcular(FuncionarioCLT funcionarioCLT);
}
