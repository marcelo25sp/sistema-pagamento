package dto;

import entities.enums.TipoFuncionario;

public class FuncionarioDTO {
	
	private String nome;
	private TipoFuncionario tipo;
	
	private Double salarioBase;
	private Double descontoINSS;
	
	private Double valorHora;
	private Integer horasTrabalhadas;
	
	private Double bolsaAuxilio;

}
