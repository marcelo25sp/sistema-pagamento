package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dto.FuncionarioDTO;
import dto.PagamentoDTO;
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
		System.out.println("=========================================");

		int opcao;

		do {
			menu.exibirMenu();
			opcao = sc.nextInt();
			sc.nextLine(); // limpa o buffer

			switch (opcao) {
			case 1:
				
				System.out.println("\nCadastro de funcionário(a):");
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Tipo de funcionário(a): (CLT/PJ/ESTAGIÁRIO) ");
				TipoFuncionario tipo = TipoFuncionario.valueOf(sc.next().toUpperCase());
				
				Double salarioBase = null;
				Double descontoINSS = null;
				Double valorHora = null;
				Integer horas = null;
				Double bolsaAuxilio = null;
				
				if(tipo == TipoFuncionario.CLT) {
					System.out.print("Salário Base:(R$) ");
					salarioBase = sc.nextDouble();
					System.out.print("Desconto do INSS:(R$) ");
					descontoINSS = sc.nextDouble();					
				}else if(tipo == TipoFuncionario.ESTAGIARIO) {
					System.out.print("Bolsa Auxílio:(R$) ");
					bolsaAuxilio = sc.nextDouble();
				}else {
					System.out.print("Valor por Hora:(R$) ");
					valorHora = sc.nextDouble();
					System.out.print("Horas trabalhadas:(R$) ");
					horas = sc.nextInt();
				}
				
				sc.nextLine();
				
				FuncionarioDTO dto = new FuncionarioDTO(nome, tipo, salarioBase, descontoINSS, valorHora, horas, bolsaAuxilio);
				
				funcionarios.cadastrarFuncionario(dto);
				
				System.out.println("Cadastro realizado com sucesso!");
				
				break;
				
			case 2:
				
				funcionarios.listarFuncionarios();
				break;
				
			case 3:

				List<PagamentoDTO> relatorio = funcionarios.gerarRelatorioDTO();

				if (relatorio.isEmpty()) {
					System.out.println("\nNenhum funcionário cadastrado!");
					break;
				}

				System.out.println("\n===== RELATÓRIO DE PAGAMENTOS =====\n");

				for (PagamentoDTO p : relatorio) {
					System.out.printf("Funcionário: %s | Tipo: %s | Pagamento: R$ %.2f%n", p.getNome(), p.getTipo(),
							p.getValorPagamento());
				}

				double total = funcionarios.calcularTotalFolha(relatorio);

				System.out.println("\n----------------------------------------------------------------------");
				System.out.printf("Valor Total da folha: R$ %.2f%n", total);
				System.out.println("========================================================================");

				break;

			case 0:
				System.out.println("\nEncerrando o programa...");
				break;
			default:
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
