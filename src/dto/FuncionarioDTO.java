package dto;

import entities.enums.TipoFuncionario;

public class FuncionarioDTO {
	
	// Classe para transporte de dados do funcionário
	
	private String nome;
	private TipoFuncionario tipo;
	
	private Double salarioBase;
	private Double descontoINSS;
	
	private Double valorHora;
	private Integer horasTrabalhadas;
	
	private Double bolsaAuxilio;

	public FuncionarioDTO(String nome, TipoFuncionario tipo, Double salarioBase, Double descontoINSS, Double valorHora,
			Integer horasTrabalhadas, Double bolsaAuxilio) {
		this.nome = nome;
		this.tipo = tipo;
		this.salarioBase = salarioBase;
		this.descontoINSS = descontoINSS;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.bolsaAuxilio = bolsaAuxilio;
	}

	public String getNome() {
		return nome;
	}

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public Double getDescontoINSS() {
		return descontoINSS;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public Double getBolsaAuxilio() {
		return bolsaAuxilio;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(TipoFuncionario tipo) {
		this.tipo = tipo;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setDescontoINSS(Double descontoINSS) {
		this.descontoINSS = descontoINSS;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setBolsaAuxilio(Double bolsaAuxilio) {
		this.bolsaAuxilio = bolsaAuxilio;
	}
	
	
	
	

}
