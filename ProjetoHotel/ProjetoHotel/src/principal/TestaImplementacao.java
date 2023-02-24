package principal;

import hotel.Endereco;
import hotel.Hotel;
import hotel.Quarto;
import pessoas.Funcionario;
import pessoas.Usuario;

public class TestaImplementacao {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco ("Avenida Albert Bartholome", 242,"Sao Paulo","SP", 05541000);
		System.out.println(endereco1);
		
		Hotel hotel1 = new Hotel(1, "Hotel Sunrise", endereco1);
		Quarto suiteMaster = new Quarto(105,950.0);
		Usuario rogerJ = new Funcionario("Roger", "baleia", 1, "Chefão", "roger.hotel@hotel.com");
		
		hotel1.adicionaQuarto(suiteMaster);
		
		System.out.println(hotel1);
		System.out.println(hotel1.getQuartos());
	}
	
	
	
}
