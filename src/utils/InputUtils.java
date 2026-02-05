package utils;

import java.util.Scanner;

public class InputUtils {

	private Scanner sc;

	public InputUtils(Scanner sc) {
		this.sc = sc;
	}

	// funções para capturar entrada de dados do usuário

	public String lerString(Scanner mensagem) {
		System.out.println(mensagem);
		return sc.nextLine();
	}

}
