package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.FuncionarioDTO;
import dto.PagamentoDTO;
import entities.Funcionario;
import entities.enums.TipoFuncionario;

public class FuncionarioGerenciamento {

	public FuncionarioGerenciamento() {
	}

	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public void cadastrarFuncionario(FuncionarioDTO dto) {
		Funcionario funcionario = FuncionarioFactory.criar(dto);
		funcionarios.add(funcionario);
	}
	
	
	public void cadastrarFuncionario(Scanner sc) {

	    System.out.println("\nCadastro do(a) funcionário(a):");

	    System.out.print("Nome: ");
	    String nome = sc.nextLine();

	    System.out.print("Tipo de Funcionário (CLT/PJ/ESTAGIARIO): ");
	    TipoFuncionario tipo = TipoFuncionario.valueOf(sc.next().toUpperCase());

	    Double salarioBase = null;
	    Double descontoINSS = null;
	    Double valorHora = null;
	    Integer horas = null;
	    Double bolsaAuxilio = null;

	    if (tipo == TipoFuncionario.CLT) {
	        System.out.print("Salário Base:(R$) ");
	        salarioBase = sc.nextDouble();
	        System.out.print("Desconto do INSS:(R$) ");
	        descontoINSS = sc.nextDouble();
	    }

	    else if (tipo == TipoFuncionario.PJ) {
	        System.out.print("Valor por hora:(R$) ");
	        valorHora = sc.nextDouble();
	        System.out.print("Horas trabalhadas: ");
	        horas = sc.nextInt();
	    }

	    else {
	        System.out.print("Bolsa auxílio:(R$) ");
	        bolsaAuxilio = sc.nextDouble();
	    }

	    sc.nextLine();

	    //  Usa DTO + Factory
	    FuncionarioDTO dto = new FuncionarioDTO(
	            nome,
	            tipo,
	            salarioBase,
	            descontoINSS,
	            valorHora,
	            horas,
	            bolsaAuxilio
	    );

	    Funcionario funcionario = FuncionarioFactory.criar(dto);
	    funcionarios.add(funcionario);

	    System.out.println("Cadastro realizado com sucesso!");
	    System.out.println("------------------------------------------------------------------------\n");
	}

	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void listarFuncionarios() {
		System.out.println("\nLista de funcionários:");
		for (Funcionario f : funcionarios) {
			System.out.printf("Nome: %s \nSalário: R$ %.2f \nTipo de contrato: %s\n", f.getNome(),
					f.calcularPagamento(), f.getTipo());
			System.out.println("--------------------------------------------------------------------");
		}
	}
	
	public List<PagamentoDTO> gerarRelatorioDTO(){
		
		List<PagamentoDTO> relatorio = new ArrayList<>();
		
		for(Funcionario f : funcionarios) {
			relatorio.add(new PagamentoDTO(f.getNome(), f.getTipo(), f.calcularPagamento()));
		}
		return relatorio;
	}
	
	public double calcularTotalFolha(List<PagamentoDTO> relatorio) {
		double total = 0.0;
		
		for(PagamentoDTO p : relatorio) {
			total += p.getValorPagamento();
		}
		return total;
		
	}

	public void gerarRelatorioPagamentos() {

		System.out.println("\n===== RELATÓRIO DE PAGAMENTOS =====\n");

		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado!");
		}

		double valorTotal = 0.0;
		for (Funcionario f : funcionarios) {
			System.out.printf("Funcionário: %s | Tipo: %s | Pagamento: R$ %.2f%n", f.getNome(), f.getTipo(),
					f.calcularPagamento());
			valorTotal += f.calcularPagamento();
		}

		System.out.println("\n----------------------------------------------------------------------");
		System.out.printf("Valor Total da folha de pagamento: R$ %.2f%n", valorTotal);
		System.out.println("========================================================================");
	}

}