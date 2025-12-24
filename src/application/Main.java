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

		funcionarios.add(new FuncionarioCLT("João Souza", TipoFuncionario.CLT));
		funcionarios.add(new FuncionarioPJ("Julia Azevedo", 22.00, 165, TipoFuncionario.PJ));
		funcionarios.add(new Estagiario("Caio Henrique", 2200.00, TipoFuncionario.ESTAGIARIO));

		System.out.println("==========================");
		System.out.println("   SISTEMA DE PAGAMENTO   ");
		System.out.println("==========================");

		sc.close();

	}

}
