package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola Pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
	//Uma maneira mais simples de concatenar a variavel
		var nome = "Isis";
		var sobrenome = "Fernandes";
		var idade = 1;
		var meses = 6;
		var salario = 2500.00;
		
		 System.out.printf("A senhora %s %s tem %d ano e %d meses e ganha R$%.2f.",
				 nome, sobrenome, idade, meses, salario);
	}
}
