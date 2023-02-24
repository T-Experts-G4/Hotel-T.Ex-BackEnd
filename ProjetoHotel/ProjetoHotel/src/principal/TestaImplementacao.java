package principal;

import java.util.ArrayList;
import java.util.List;

import hotel.Endereco;
import hotel.Hotel;
import hotel.Quarto;
import pessoas.Funcionario;
import pessoas.Usuario;

public class TestaImplementacao {
	
	public static void main(String[] args) {
		
		int idDosHoteis = 0;
		
		Endereco endereco = new Endereco ("Avenida Albert Bartholome", 242,"Sao Paulo","SP", 05541000);
		Hotel hotel1 = new Hotel(idDosHoteis+1, "Hotel Sunrise", endereco);
		Quarto suiteMaster = new Quarto(105,950.0);
		Usuario rogerJ = new Funcionario("Roger", "baleia", 1, "Chefão", "roger.hotel@hotel.com");
		
		hotel1.adicionaQuarto(suiteMaster);
		hotel1.adicionaFuncionario(rogerJ);
		
		System.out.println(hotel1);
		
	}
	
	
	
}
