package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioPJ extends Funcionario {

	private double valorHora;
	private int horasTrabalhadas;

	public FuncionarioPJ(String nome, double valorHora, int horasTrabalhadas, TipoFuncionario tipo) {
		super(nome, tipo);

		if (valorHora <= 0) {
			throw new IllegalArgumentException("Valor da hora trabalhada deve ser maior que R$ 0.00.");
		}

		if (horasTrabalhadas <= 0) {
			throw new IllegalArgumentException("As horas trabalhadas devem ser maior que zero.");
		}

		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularPagamento() {
		return valorHora * horasTrabalhadas;
	}

}
