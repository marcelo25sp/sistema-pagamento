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

		System.out.println("==========================");
		System.out.println("   SISTEMA DE PAGAMENTO   ");
		System.out.println("==========================\n");

		System.out.print("Quantos funcionarios voce deseja cadastrar? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Tipo de Funcionário (CLT/PJ/ESTAGIARIO): ");
			TipoFuncionario tipo = TipoFuncionario.valueOf(sc.next().toUpperCase());
		}

		for (Funcionario f : funcionarios) {
			System.out.println("Funcionário: " + f.getNome());
			System.out.println("Tipo: " + f.getTipo());
			System.out.printf("Pagamento calculado: R$ %.2f%n", f.calcularPagamento());
			System.out.println("----------------------------");
		}

		System.out.println();
		System.out.println("Processamento finalizado com sucesso!");

		sc.close();

	}

}
