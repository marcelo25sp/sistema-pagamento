package entities;

import entities.enums.TipoFuncionario;

public class FuncionarioCLT extends Funcionario{
	
	public FuncionarioCLT(String nome, TipoFuncionario tipo) {
		super(nome, tipo);
	}
	
	private double salarioBase;
	private double descontoINSS;

}
