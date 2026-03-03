package entities;

import entities.enums.TipoFuncionario;

public class Estagiario extends Funcionario {

	private double bolsaAuxilio;

	public Estagiario(String nome, double bolsaAuxilio, TipoFuncionario tipo) {
		super(nome, tipo);

		if (bolsaAuxilio <= 0.0) {
			throw new IllegalArgumentException("Valor deve ser maior que R$ 0.00");
		}

		this.bolsaAuxilio = bolsaAuxilio;
	}

	@Override
	public double calcularPagamento() {
		return bolsaAuxilio;
	}

}
