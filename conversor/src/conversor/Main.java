package conversor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String quebraLinha = System.getProperty("line.separator");
		
		System.out.println("-- CONVERSOR DE ALGARISMOS ROMANOS EM NÚMEROS --");
		System.out.println(quebraLinha);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		ConversorRomanos conversor = new ConversorRomanos();
		
		while(true) {
			  System.out.println("Digite um algarismo romano: " + quebraLinha);
			  
			  String algarismo = scanner.nextLine();
			  
			  if(algarismo != "") {
				  System.out.println("Resultado: " + conversor.convertaAlgarismoRomano(algarismo));
			  } else {
				  System.out.println("O número não pode ficar vazio");
			  }
		}
	}
}
