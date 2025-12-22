package entities;

import entities.enums.TipoFuncionario;

public class Funcionario {
	
	private String nome;
	private TipoFuncionario tipo;
	
	public Funcionario(String nome, TipoFuncionario tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public TipoFuncionario getTipo() {
		return tipo;
	}

}
