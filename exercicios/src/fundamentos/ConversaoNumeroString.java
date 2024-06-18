package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
//	Usando o método toString() de Integer:
//	Neste método, você está convertendo um objeto Integer em uma string. A classe Integer tem um método toString() que retorna a representação em string do valor numérico contido no objeto.
//	Quando você chama num1.toString(), o objeto Integer num1 é convertido em uma string que representa o valor contido nele.
//	Em seguida, você está chamando length() na string resultante para obter o comprimento dessa string, ou seja, o número de caracteres na representação do número.
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		


//	Usando o método estático toString() de Integer:
//	Aqui, você está convertendo um número primitivo int em uma string. A classe Integer fornece um método estático toString(int) que converte um valor int em uma string.
//	Quando você chama Integer.toString(num2), o número num2 é convertido em uma string.
//	Novamente, você está chamando length() na string resultante para obter o comprimento da string que representa o número.
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());
		
		
//	Usando concatenação de strings:
//	Esta abordagem é um pouco diferente das anteriores. Você está convertendo o número em uma string através da concatenação com uma string vazia "".
//	Quando você concatena uma string vazia "" com um número ("" + num1 ou "" + num2), o Java automaticamente converte o número em uma string.
//	O comprimento da string resultante é então obtido chamando length().
		
		System.out.println(("" + num1).length());
		System.out.println((""+ num2).length());
	}

}
