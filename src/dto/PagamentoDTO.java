package dto;

import entities.enums.TipoFuncionario;

public class PagamentoDTO {

	private String nome;
	private TipoFuncionario tipo;
	private double valorPagamento;

	public PagamentoDTO(String nome, TipoFuncionario tipo, double valorPagamento) {
		this.nome = nome;
		this.tipo = tipo;
		this.valorPagamento = valorPagamento;
	}

	public String getNome() {
		return nome;
	}

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

}
