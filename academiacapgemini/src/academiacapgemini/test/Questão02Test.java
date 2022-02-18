package academiacapgemini.test;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import academiacapgemini.questoes.Questao02;

public class Questão02Test {

	
	@Test
	public void test2() {
		
		System.out.println("DICA");
		System.out.println("Deve Possui no mínimo 6 caracteres.\r\n" + "Deve Contér no mínimo 1 digito.\r\n"
				+ "Deve Contér no mínimo 1 letra em minúsculo.\r\n" + "Deve Contér no mínimo 1 letra em maiúsculo.\r\n"
				+ "Deve Contér no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\r\n" + "");
		
		Questão02Test.validaSenha("ab-cA@9");
	}


	public static void validaSenha(String senha) {

		if (senha != null) {

			if (senha.length() < 6) {
				System.out.println("A SENHE DEVE CONTER NO MÃ�NIMO 6 CARACTERS.");

			} else if (!Questao02.validaCaractersSenha(senha, 1)) {
				System.out.println("A SENHE DEVE CONTER NO MÃ�NIMO 1 CARACTER MAIUSCULO.");

			} else if (!Questao02.validaCaractersSenha(senha, 2)) {
				System.out.println("A SENHE DEVE CONTER NO MÃ�NIMO 1 CARACTER MINUSCULO.");

			} else if (!Questao02.validaCaractersSenha(senha, 3)) {
				System.out.println("A SENHE DEVE CONTER NO MÃ�NIMO 1 DIGITO.");

			} else if (!Questao02.validaCaractersSenha(senha, 4)) {
				System.out.println("A SENHE DEVE CONTER NO MÃ�NIMO 1 CARACTER ESPECIAL EX. '!@#$%^&*()-+'.");


			} else
				System.out.println("A SENHA ATENDEU AOS REQUISITOS.");
			}
		}
	

	public static boolean validaCaractersSenha(String senha, int opcao) {
		int qtdCaracterEncontrado = 0;

		// para todos os caracteres da string
		for (int i = 0; i < senha.length(); i++) {
			// pegar o caractere
			char c = senha.charAt(i);

			if (opcao == 1) {
				if (Character.isUpperCase(c)) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 2) {
				if (Character.isLowerCase(c)) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 3) {
				if ("-".contains(Character.toString(c))) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 4) {
				if ("!@#$%^&*()-+".contains(Character.toString(c))) {
					qtdCaracterEncontrado++;
				}
				
			} 

		}
		
		if (qtdCaracterEncontrado > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
