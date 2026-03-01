package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.FuncionarioDTO;
import dto.PagamentoDTO;
import entities.Funcionario;
import entities.enums.TipoFuncionario;

public class FuncionarioGerenciamento {

	public FuncionarioGerenciamento() {
	}

	private List<Funcionario> funcionarios = new ArrayList<>();

	public void cadastrarFuncionario(FuncionarioDTO dto) {
		Funcionario funcionario = FuncionarioFactory.criar(dto);
		funcionarios.add(funcionario);
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void listarFuncionarios() {
		System.out.println("\nLista de funcionários:");
		for (Funcionario f : funcionarios) {
			System.out.printf("Nome: %s \nSalário: R$ %.2f \nTipo de contrato: %s\n", f.getNome(),
					f.calcularPagamento(), f.getTipo());
			System.out.println("--------------------------------------------------------------------");
		}
	}

	public List<PagamentoDTO> gerarRelatorioDTO() {

		List<PagamentoDTO> relatorio = new ArrayList<>();

		for (Funcionario f : funcionarios) {
			relatorio.add(new PagamentoDTO(f.getNome(), f.getTipo(), f.calcularPagamento()));
		}
		return relatorio;
	}

	public double calcularTotalFolha(List<PagamentoDTO> relatorio) {
		double total = 0.0;

		for (PagamentoDTO p : relatorio) {
			total += p.getValorPagamento();
		}
		return total;

	}

	public void gerarRelatorioPagamentos() {

		System.out.println("\n===== RELATÓRIO DE PAGAMENTOS =====\n");

		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado!");
		}

		double valorTotal = 0.0;
		for (Funcionario f : funcionarios) {
			System.out.printf("Funcionário: %s | Tipo: %s | Pagamento: R$ %.2f%n", f.getNome(), f.getTipo(),
					f.calcularPagamento());
			valorTotal += f.calcularPagamento();
		}

		System.out.println("\n----------------------------------------------------------------------");
		System.out.printf("Valor Total da folha de pagamento: R$ %.2f%n", valorTotal);
		System.out.println("========================================================================");
	}

}