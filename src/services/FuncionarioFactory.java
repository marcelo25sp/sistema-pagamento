package services;

import dto.FuncionarioDTO;
import entities.Estagiario;
import entities.Funcionario;
import entities.FuncionarioCLT;
import entities.FuncionarioPJ;
import entities.enums.TipoFuncionario;

public class FuncionarioFactory {
	
	public static Funcionario criar(FuncionarioDTO dto) {
		
		if(dto.getTipo() == TipoFuncionario.CLT) {
			return new FuncionarioCLT(dto.getNome(), dto.getSalarioBase(), dto.getDescontoINSS(), dto.getTipo());
		}
		
		else if(dto.getTipo() == TipoFuncionario.PJ) {
			return new FuncionarioPJ(dto.getNome(), dto.getValorHora(), dto.getHorasTrabalhadas(), dto.getTipo());
		}
		
		else {
			return new Estagiario(dto.getNome(), dto.getBolsaAuxilio(), dto.getTipo());
		}
	}

}
