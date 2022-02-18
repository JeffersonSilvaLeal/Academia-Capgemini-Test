package academiacapgemini.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class Questao01Test {

	 	@Test
		public  void teste() {
			
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
