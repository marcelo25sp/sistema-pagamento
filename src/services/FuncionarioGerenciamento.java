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

	public List<Funcionario> listarFuncionarios() {
		return new ArrayList<>(funcionarios);
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



}