package exercicios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o ultimo salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		System.out.println("O primeiro salario é: " + salario1 + ", " + "O segundo salario é: " + salario2 + ", " + "O terceiro salario é: " +salario3);
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = (valor1 + valor2 + valor3) /3;
		System.out.println("A média é: " + soma);
;	}

}
