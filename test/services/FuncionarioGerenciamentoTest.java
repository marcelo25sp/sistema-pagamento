package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

	@Test
	void deveCalcularPagamentoCLTCorretamente() {

		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		FuncionarioDTO funcionario = new FuncionarioDTO("João", TipoFuncionario.CLT, 3000.0, 200.0, null, null, null);

		gerenciamento.cadastrarFuncionario(funcionario);

		var relatorio = gerenciamento.gerarRelatorioDTO();

		double valorPagamento = relatorio.get(0).getValorPagamento();

		assertEquals(2800.0, valorPagamento);

	}

	@Test
	void deveCalcularPagamentoPJCorretamente() {

		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		FuncionarioDTO funcionario = new FuncionarioDTO("João", TipoFuncionario.PJ, null, null, 40.0, 100, null);

		gerenciamento.cadastrarFuncionario(funcionario);

		var relatorio = gerenciamento.gerarRelatorioDTO();

		double valorPagamento = relatorio.get(0).getValorPagamento();

		assertEquals(4000.0, valorPagamento);

	}

	@Test
	void deveCalcularPagamentoEstagiarioCorretamente() {

		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		FuncionarioDTO funcionario = new FuncionarioDTO("João", TipoFuncionario.ESTAGIARIO, null, null, null, null,
				1500.0);

		gerenciamento.cadastrarFuncionario(funcionario);

		var relatorio = gerenciamento.gerarRelatorioDTO();

		double valorPagamento = relatorio.get(0).getValorPagamento();

		assertEquals(1500.0, valorPagamento);

	}

	@Test
	void deveCalcularPagamentoTotalDaFolhaCorretamente() {

		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		// CLT
		gerenciamento
				.cadastrarFuncionario(new FuncionarioDTO("João", TipoFuncionario.CLT, 3000.0, 200.0, null, null, null));

		// PJ
		gerenciamento.cadastrarFuncionario(new FuncionarioDTO("João", TipoFuncionario.PJ, null, null, 40.0, 100, null));

		// ESTAGIÁRIO
		gerenciamento.cadastrarFuncionario(
				new FuncionarioDTO("João", TipoFuncionario.ESTAGIARIO, null, null, null, null, 1500.0));

		var relatorio = gerenciamento.gerarRelatorioDTO();

		double total = gerenciamento.calcularTotalFolha(relatorio);

		assertEquals(8300.0, total);

	}

	@Test
	void deveRetornarTotalZeroQuandoNaoHouverFuncionarios() {

		FuncionarioGerenciamento gerenciamento = new FuncionarioGerenciamento();

		var relatorio = gerenciamento.gerarRelatorioDTO();

		assertTrue(relatorio.isEmpty());

		double total = gerenciamento.calcularTotalFolha(relatorio);

		assertEquals(0.0, total);

	}

}