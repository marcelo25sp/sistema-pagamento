package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioCLT extends Funcionario {

	private double salarioBase;
	private double descontoINSS;

	public FuncionarioCLT(String nome, TipoFuncionario tipo) {
		super(nome, tipo);
	}

	@Override
	public double calcularPagamento() {
		return salarioBase - descontoINSS;
	}

}
