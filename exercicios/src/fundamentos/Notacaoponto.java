package fundamentos;

public class Notacaoponto {
	
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Luiz Fernando".toUpperCase();
		System.out.println(x);
		
		String y = "Palmeiras tem mundial? sim"
				.replace("sim", "não") //substituindo sim por não
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}

}
