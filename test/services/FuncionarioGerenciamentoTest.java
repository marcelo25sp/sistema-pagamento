package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dto.FuncionarioDTO;
import entities.enums.TipoFuncionario;

class FuncionarioGerenciamentoTest {

	@Test
	void deveCriarInstanciaDoGerenciamento() {
		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();
		assertNotNull(gerenciamento);
	}

	@Test
	void deveCadastrarFuncionarioCLT() {
		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		FuncionarioDTO funcionario = new FuncionarioDTO("João", TipoFuncionario.CLT, 3000.0, 200.0, null, null, null);

		gerenciamento.cadastrarFuncionario(funcionario);

		var relatorio = gerenciamento.gerarRelatorioDTO();

		assertEquals(1, relatorio.size());
		assertEquals("João", relatorio.get(0).getNome());

	}

}