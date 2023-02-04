package atidade_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// [1] inserir frase
		// [2] buscar texto
		// [3] sair

		/*
		 * String teste = "felipe123"; for(int i = 0; i < teste.length(); i++) {
		 * if(Character.isDigit(teste.charAt(i))) { System.out.println("é um numero"); }
		 * }
		 */
		Scanner input1 = new Scanner(System.in);
		ArrayList<String> listaFrase = new ArrayList();

		while (true) {
			  System.out.println("------------------------------------------");
			  System.out.println("[1] inserir frase");
			  System.out.println("[2] buscar texto");
			  System.out.println("[3] sair");
			  
			  System.out.print("Escolha: ");
			  int escolhaUsuario = input1.nextInt();
			  
			  
			  if(escolhaUsuario == 3) {
				  break; 
				  
			  } else if(escolhaUsuario == 1) {
				  System.out.print("Digite a frase: ");
				  String frase = new Scanner(System.in).nextLine();
				  listaFrase.add(frase);
				  
			  }else if(escolhaUsuario == 2) {
				  System.out.print("Buscar o texto: ");
				  String frase = new Scanner(System.in).nextLine();
				  System.out.println("------------------------------------------");
				  System.out.println("FRASES ENCONTRADAS");
				  for(String f: listaFrase) {
					  if(f.contains(frase)){
						  System.out.println(f);
					  }
				  }
				  
			  }
			  
		  }
		 

		System.out.println("Programa finalizado");
		System.out.println(listaFrase);

	}

}
