package academiacapgemini.questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author JeffersonSilvaLeal
 *
 */

public class Quest�o01 {

	public static void main(String[] args) {
		
		/**
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.
		 */
		
		// leitor de dados
		Scanner entrada = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		 
		//  Entrada de dados
		System.out.print("Digite a quantidade de vezes: ");
		int qtdDegraus = entrada.nextInt();

		 
		// Monta o degrau
		for (int i = 0; i <= qtdDegraus; i++) {
		degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		 
		// Itera sobre o degraus
		for (String d : degraus ) {
		System.out.println(d);
		}
	}

}
