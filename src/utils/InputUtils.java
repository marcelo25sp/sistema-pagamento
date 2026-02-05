package utils;

import java.util.Scanner;

public class InputUtils {

	private Scanner sc;

	public InputUtils(Scanner sc) {
		this.sc = sc;
	}

	// funções para capturar entrada de dados do usuário

	public String lerString(String mensagem) {
		System.out.print(mensagem);
		return sc.nextLine();
	}
	
	public int lerInt(String mensagem) {
		System.out.print(mensagem);
		while(!sc.hasNextInt()) { //valida se o número é do tipo inteiro
			System.out.println("Entrada inválida! Digite um número inteiro:");
			sc.next();
			System.out.print(mensagem);
		}
		int valor = sc.nextInt();
		sc.nextLine(); // limpa o buffer
		return valor;
	}

}
