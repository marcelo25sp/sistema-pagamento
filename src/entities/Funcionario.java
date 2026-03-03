package entities;

import entities.enums.TipoFuncionario;

public abstract class Funcionario {

	private String nome;
	private TipoFuncionario tipo;

	public Funcionario(String nome, TipoFuncionario tipo) {

		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome do funcionário não pode ser vazio.");
		}

		if (tipo == null) {
			throw new IllegalArgumentException("O tipo do contrato do funcionário não pode ser nulo.");
		}

		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public abstract double calcularPagamento();

}
