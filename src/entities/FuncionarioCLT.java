package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioCLT extends Funcionario {

	private double salarioBase;
	private double descontoINSS;

	public FuncionarioCLT(String nome, double salarioBase, double descontoINSS, TipoFuncionario tipo) {
		super(nome, tipo);
		this.salarioBase = salarioBase;
		this.descontoINSS = descontoINSS;
	}

	@Override
	public double calcularPagamento() {
		return salarioBase - descontoINSS;
	}

}
