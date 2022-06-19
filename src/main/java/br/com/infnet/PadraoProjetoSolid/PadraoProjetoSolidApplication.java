package br.com.infnet.PadraoProjetoSolid;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.model.TelefoneFuncionario;
import br.com.infnet.PadraoProjetoSolid.service.impl.ReajusteSalarioServiceImpl;
import br.com.infnet.PadraoProjetoSolid.validation.RegraReajusteSalarioValidation;
import br.com.infnet.PadraoProjetoSolid.validation.impl.RegraReajusteSalarioEstagiarioValidationImpl;
import br.com.infnet.PadraoProjetoSolid.validation.impl.RegraReajusteSalarioJuniorValidationImpl;
import br.com.infnet.PadraoProjetoSolid.validation.impl.RegraReajusteSalarioPlenoValidationImpl;
import br.com.infnet.PadraoProjetoSolid.validation.impl.RegraReajusteSalarioSeniorValidationImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PadraoProjetoSolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoSolidApplication.class, args);
		FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
		funcionarioCLT.getDadosFuncionario().setNome("José Aparecido");

		List<TelefoneFuncionario> listaTelefones = Arrays.asList(
				new TelefoneFuncionario("(41) 9 9223-2843"),
				new TelefoneFuncionario("(41) 9 9299-0213")
		);

		funcionarioCLT.getDadosFuncionario().setListaTefefones(listaTelefones);
		funcionarioCLT.getDadosFuncionario().setEndereco("Rua Fulano, 820, São Paulo, SP");
		funcionarioCLT.getDadosFuncionario().setCargo(EnumCargo.PLENO);
		funcionarioCLT.getDadosFuncionario().setSetor(EnumSetor.DESENVOLVIMENTO);
		funcionarioCLT.getDadosFuncionario().setSalarioBase(new BigDecimal("2500"));

		List<RegraReajusteSalarioValidation> listaRegrasReajusteSalario = Arrays.asList(new RegraReajusteSalarioEstagiarioValidationImpl(),
																						new RegraReajusteSalarioJuniorValidationImpl(),
																						new RegraReajusteSalarioPlenoValidationImpl(),
																						new RegraReajusteSalarioSeniorValidationImpl());

		ReajusteSalarioServiceImpl reajusteSalarioService = new ReajusteSalarioServiceImpl(listaRegrasReajusteSalario);
		reajusteSalarioService.ReajustarSalario(funcionarioCLT);
		System.out.println(funcionarioCLT.getDadosFuncionario().getSalarioBase());
	}

}
