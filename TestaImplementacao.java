package principal;

import hotel.Endereco;
import hotel.Hotel;

public class TestaImplementacao {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco ("Avenida Albert Bartholome", 242,"Sao Paulo","SP", 05541000);
		System.out.println(endereco1);
		
		
		Hotel hotel1 = new Hotel(1, "Hotel Sunrise", endereco1);
		
		System.out.println(hotel1);
	}
	
	
	
}
