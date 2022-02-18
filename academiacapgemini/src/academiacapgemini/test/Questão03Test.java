package academiacapgemini.test;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Questão03Test {	    
	
	@Test
	public void test3() {
		// Entrada de dados
		System.out.println("Digite uma palavra: ");
		Scanner sc = new Scanner(System.in);
	    String palavra = sc.next();
	   
	    // Array para armazenas anagramas
	    ArrayList<String> anagramas = new ArrayList<String>();
	    
	    // logica do anagrama
	    for(int i = 0; i <palavra.length(); i++) {
	        for(int j = 1; j < palavra.length(); j++) {
	            if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
	                if(palavra.charAt(i) == palavra.charAt(i+1)) {
	                String x = palavra.substring(i, i + 1);
	                anagramas.add(x);
	                } else {
	                String y = palavra.substring(i, j);
	                String z = palavra.substring(i + 1, j + 1);
	                String h = palavra.substring(i, i + 1);
	                anagramas.add(h);
	                anagramas.add(y);
	                anagramas.add(z);
	                }
	            }
	        }
	    }
	    
	    System.out.println("A palavra contém: " + anagramas.size() + " Anagramas");
	}
}
