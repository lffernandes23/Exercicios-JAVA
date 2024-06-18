package exercicios;

public class Temperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double F = 86;
		
		double temperatura = (F) * FATOR;
		System.out.println("O resultado é "+ temperatura + "ºC");
		
		F = 150;
		temperatura = (F - AJUSTE) * FATOR;
		System.out.println("O resultado é "+ temperatura + "ºC");

	}

}
