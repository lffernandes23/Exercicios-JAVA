package exercicios;

public class DesafioLogico {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Compro TV 50\"? " + comprouTV50);
		System.out.println("Compro TV 32\"? " + comprouTV32);
		System.out.println("Compro sorteve? " + comprouSorvete);
		
		System.out.println("Mais saudavel? " + !comprouSorvete);
		
//		System.out.println(trabalho1 && trabalho2);
//		System.out.println("A familia vai comprar uma TV 50 polegadas e tomar sorvete\n");
//		
//		System.out.println(trabalho1 || trabalho2);
//		System.out.println("A familia vai comprar uma TV 50 polegadas e tomar sorvete\n");
//		
//		System.out.println(trabalho1 ^ !trabalho2);
//		System.out.println("A familia vai comprar uma TV 32 polegadas e tomar sorvete\n");
//		
//		System.out.println(!!trabalho1);
//		System.out.println("A familia vai comprar uma TV 32 polegadas e tomar sorvete\n");
//		
//		System.out.println(!trabalho2);
//		System.out.println("A familia vai ficar em casa e não vai tomar sorvete\n");
	}
}
