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

		Menu menu = new Menu();

		System.out.println("=========================================");
		System.out.println("          SISTEMA DE PAGAMENTO           ");
		System.out.println("=========================================\n");

		List<Funcionario> funcionarios = new ArrayList<>();

		int opcao;

		do {
			menu.exibirMenu();
			opcao = sc.nextInt();
			sc.nextLine(); // limpa o buffer

			if (opcao == 1) {
				cadastrarFuncionario(funcionarios, sc);
			} else if (opcao == 2) {
				listarFuncionarios(funcionarios);
			} else if (opcao == 0) {
				System.out.println("\nEncerrando o programa...");
			} else {
				System.out.print("Opção inválida. Digite novamente: ");
				opcao = sc.nextInt();
				sc.nextLine();
			}
		} while (opcao != 0);

		System.out.println();
		System.out.println("Processamento finalizado com sucesso!");

		sc.close();

	}

	private static void cadastrarFuncionario(List<Funcionario> funcionarios, Scanner sc) {

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

}
