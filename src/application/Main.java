package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Estagiario;
import entities.Funcionario;
import entities.FuncionarioCLT;
import entities.FuncionarioPJ;
import entities.enums.TipoFuncionario;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("=========================================");
		System.out.println("   SISTEMA DE PAGAMENTO JAVA VERSÃO 2.0  ");
		System.out.println("=========================================\n");

		System.out.println("1. Cadastrar funcionário");
		System.out.println("2. Listar funcionários");
		System.out.println("0. Sair");
		System.out.print("\nEscolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();

		if (opcao == 1) {
			System.out.println("\nEm construção...");
		} else if (opcao == 2) {
			System.out.println("\nEm construção...");
		} else {
			System.out.println("\nSaindo...");
		}

		System.out.print("Quantos funcionarios voce deseja cadastrar? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
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
			System.out.println("----------------------------------------");

		}

		System.out.println("\n========Funcionários cadastrados========\n");

		for (Funcionario f : funcionarios) {
			System.out.println("Funcionário: " + f.getNome());
			System.out.println("Tipo: " + f.getTipo());
			System.out.printf("Pagamento calculado: R$ %.2f%n", f.calcularPagamento());
			System.out.println("----------------------------------------");
		}

		System.out.println();
		System.out.println("Processamento finalizado com sucesso!");

		sc.close();

	}

	private static void cadastrarFuncionario(List<Funcionario> funcionarios, Scanner sc) {

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
		System.out.println("----------------------------------------");
	}

	private static void listarFuncionarios(List<Funcionario> funcionarios) {

		System.out.println("\n========Funcionários cadastrados========\n");

		for (Funcionario f : funcionarios) {
			System.out.println("Funcionário: " + f.getNome());
			System.out.println("Tipo: " + f.getTipo());
			System.out.printf("Pagamento calculado: R$ %.2f%n", f.calcularPagamento());
			System.out.println("----------------------------------------");
		}

	}

}
