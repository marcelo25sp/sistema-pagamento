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
import services.FuncionarioGerenciamento;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();
		FuncionarioGerenciamento funcionarios = new FuncionarioGerenciamento();

		System.out.println("=========================================");
		System.out.println("          SISTEMA DE PAGAMENTO           ");
		System.out.println("=========================================\n");

		int opcao;

		do {
			menu.exibirMenu();
			opcao = sc.nextInt();
			sc.nextLine(); // limpa o buffer

			if (opcao == 1) {
				funcionarios.cadastrarFuncionario(sc);
			} else if (opcao == 2) {
				funcionarios.listarFuncionarios();
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

}
