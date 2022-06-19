package br.com.infnet.PadraoProjetoSolid;

import br.com.infnet.PadraoProjetoSolid.enumerator.EnumCargo;
import br.com.infnet.PadraoProjetoSolid.enumerator.EnumSetor;
import br.com.infnet.PadraoProjetoSolid.model.FuncionarioCLT;
import br.com.infnet.PadraoProjetoSolid.model.TelefoneFuncionario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
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


	}

}
