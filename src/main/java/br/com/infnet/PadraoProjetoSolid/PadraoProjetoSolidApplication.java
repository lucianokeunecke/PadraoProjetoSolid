package br.com.infnet.PadraoProjetoSolid;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioPJ;
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

		List<TelefoneFuncionario> listaTelefones = Arrays.asList(
				new TelefoneFuncionario("(41) 9 9223-2843"),
				new TelefoneFuncionario("(41) 9 9299-0213")
		);

		FuncionarioCLT funcionarioCLT = new FuncionarioCLT("José Aparecido", "Rua Fulano, 820, São Paulo, SP", new BigDecimal("2500"), EnumSetor.DESENVOLVIMENTO, EnumCargo.PLENO, listaTelefones);

		List<RegraReajusteSalarioValidation> listaRegrasReajusteSalario = Arrays.asList(new RegraReajusteSalarioEstagiarioValidationImpl(),
																						new RegraReajusteSalarioJuniorValidationImpl(),
																						new RegraReajusteSalarioPlenoValidationImpl(),
																						new RegraReajusteSalarioSeniorValidationImpl());

		ReajusteSalarioServiceImpl reajusteSalarioService = new ReajusteSalarioServiceImpl(listaRegrasReajusteSalario, funcionarioCLT);
		reajusteSalarioService.reajustarSalario();
		System.out.println(funcionarioCLT.getDadosFuncionario().getSalarioBase());


		//Ao tentar realizar o reajuste para FuncionarioPJ o próprio construtor da classe ReajusteSalarioServiceImpl não permite passar como parâmetro.
		/*List<TelefoneFuncionario> listaTelefonesPJ = Arrays.asList(
				new TelefoneFuncionario("(41) 9 9223-2843"),
				new TelefoneFuncionario("(41) 9 9299-0213")
		);

		FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Carlos Gomes", "Rua Teste, 986, Curitiba, PR", new BigDecimal("3500"), EnumSetor.DESENVOLVIMENTO, EnumCargo.SENIOR, listaTelefonesPJ);
		ReajusteSalarioServiceImpl reajusteSalarioPJService = new ReajusteSalarioServiceImpl(listaRegrasReajusteSalario, funcionarioPJ);
		reajusteSalarioService.reajustarSalario();
		System.out.println(funcionarioPJ.getDadosFuncionario().getSalarioBase());*/
	}

}
