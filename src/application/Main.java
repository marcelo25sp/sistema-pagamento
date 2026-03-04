package application;

import java.util.Locale;

import services.FuncionarioGerenciamento;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		FuncionarioGerenciamento funcionario = new FuncionarioGerenciamento();
		FuncionarioConsoleUI ui = new FuncionarioConsoleUI(funcionario);
		
		ui.iniciar();



	}

}
