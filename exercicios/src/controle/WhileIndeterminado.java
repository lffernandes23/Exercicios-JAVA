package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("não")) {
			System.out.println("O palmeiras tem mundial? ");
			valor = entrada.nextLine();1
		}
		System.out.println("Correto!");
		entrada.close();
	}

}
