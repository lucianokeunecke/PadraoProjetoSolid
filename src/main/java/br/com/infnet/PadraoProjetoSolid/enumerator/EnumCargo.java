package br.com.infnet.PadraoProjetoSolid.enumerator;

import br.com.infnet.PadraoProjetoSolid.service.RegraReajusteSalarioService;
import br.com.infnet.PadraoProjetoSolid.service.impl.RegraReajusteSalarioServiceEstagiarioImpl;
import br.com.infnet.PadraoProjetoSolid.service.impl.RegraReajusteSalarioServiceJuniorImpl;
import br.com.infnet.PadraoProjetoSolid.service.impl.RegraReajusteSalarioServicePlenoImpl;
import br.com.infnet.PadraoProjetoSolid.service.impl.RegraReajusteSalarioServiceSeniorImpl;

public enum EnumCargo {

    ESTAGIARIO(new RegraReajusteSalarioServiceEstagiarioImpl()),
    JUNIOR(new RegraReajusteSalarioServiceJuniorImpl()),
    PLENO (new RegraReajusteSalarioServicePlenoImpl()),
    SENIOR(new RegraReajusteSalarioServiceSeniorImpl());

    EnumCargo(RegraReajusteSalarioService reajusteSalarioService) {
        this.reajusteSalarioService = reajusteSalarioService;
    }

    private RegraReajusteSalarioService reajusteSalarioService;

    public RegraReajusteSalarioService getRegraReajusteSalario() {
        return this.reajusteSalarioService;
    }

}
