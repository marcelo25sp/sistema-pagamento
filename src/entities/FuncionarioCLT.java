package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioCLT extends Funcionario {

	private double salarioBase;
	private double descontoINSS;

	public FuncionarioCLT(String nome, double salarioBase, double descontoINSS, TipoFuncionario tipo) {
		super(nome, tipo);
		
		if(salarioBase <= 0) {
			throw new IllegalArgumentException("Salário Base deve ser maior que R$ 0.00");
		}
		
		if(descontoINSS < 0) {
			throw new IllegalArgumentException("Desconto INSS não pode ser negativo.");
		}
		
		if(descontoINSS < salarioBase) {
			throw new IllegalArgumentException("Desconto INSS não pode ser maior que o Salario Base.");
		}
		
		this.salarioBase = salarioBase;
		this.descontoINSS = descontoINSS;
	}

	@Override
	public double calcularPagamento() {
		return salarioBase - descontoINSS;
	}

}
