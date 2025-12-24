package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioPJ extends Funcionario {

	private double valorHora;
	private int horasTrabalhadas;

	public FuncionarioPJ(String nome, double valorHora, int horasTrabalhadas, TipoFuncionario tipo) {
		super(nome, tipo);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularPagamento() {
		return valorHora * horasTrabalhadas;
	}

}
