package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Estagiario;
import entities.Funcionario;
import entities.FuncionarioCLT;
import entities.FuncionarioPJ;
import entities.enums.TipoFuncionario;

public class FuncionarioGerenciamento {

	public FuncionarioGerenciamento() {
	}

	private List<Funcionario> funcionarios = new ArrayList<>();

	public void cadastrarFuncionario(List<Funcionario> funcionarios, Scanner sc) {

		System.out.println("Cadastro do(a) funcionário(a):");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Tipo de Funcionário (CLT/PJ/ESTAGIARIO): ");
		TipoFuncionario tipo = TipoFuncionario.valueOf(sc.next().toUpperCase());

		if (tipo == TipoFuncionario.CLT) {

			System.out.print("Salário Base:(R$) ");
			double salarioBase = sc.nextDouble();
			System.out.print("Desconto do INSS:(R$) ");
			double descontoINSS = sc.nextDouble();
			funcionarios.add(new FuncionarioCLT(nome, salarioBase, descontoINSS, tipo));
		}

		else if (tipo == TipoFuncionario.PJ) {

			System.out.print("Valor por hora:(R$) ");
			double valorHora = sc.nextDouble();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			funcionarios.add(new FuncionarioPJ(nome, valorHora, horas, tipo));
		}

		else {
			System.out.print("Bolsa auxílio:(R$) ");
			double bolsaAuxilio = sc.nextDouble();
			funcionarios.add(new Estagiario(nome, bolsaAuxilio, tipo));
		}

		sc.nextLine();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("----------------------------------------\n");

	}
	
	public void listarFuncionarios(List<Funcionario> funcionarios) {
		for(Funcionario f : funcionarios) {
			System.out.printf("Nome: %s - R$ %.2f%n", f.getNome(), f.calcularPagamento());
		}
	}

}
