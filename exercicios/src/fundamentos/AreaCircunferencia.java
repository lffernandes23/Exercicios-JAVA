package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//definindo variavel
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		//mostrando mensagem em tela com a concatenação
		System.out.println("Area = " + area + "m2.");
	}

}
