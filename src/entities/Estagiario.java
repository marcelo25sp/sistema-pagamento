package entities;

import entities.enums.TipoFuncionario;

public class Estagiario extends Funcionario {

	private double bolsaAuxilio;

	public Estagiario(String nome, double bolsaAuxilio, TipoFuncionario tipo) {
		super(nome, tipo);
		this.bolsaAuxilio = bolsaAuxilio;
	}

	@Override
	public double calcularPagamento() {
		return bolsaAuxilio;
	}

}
