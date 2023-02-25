package principal;

import hotel.Endereco;
import hotel.Hotel;
import hotel.Quarto;
import hotel.Reserva;
import pessoas.Cliente;
import pessoas.Funcionario;
import pessoas.Usuario;

public class TestaImplementacao {
	
	public static void main(String[] args) {
		
		int idDosHoteis = 0;
		
		Endereco endereco = new Endereco ("Avenida Albert Bartholome", 242,"Sao Paulo","SP", 05541000);
		Hotel hotel1 = new Hotel(idDosHoteis+1, "Hotel Sunrise", endereco);
		Quarto suiteMaster = new Quarto(105,950.0);
		Quarto suiteExecutive = new Quarto(205,650.0);
		Usuario rogerJ = new Funcionario("Roger", "baleia", 1, "Chefão", "roger.hotel@hotel.com");
		Cliente cliente1 = new Cliente("Silvio", "senha", "Rua B - Capital - Estado", "6133895674", "silvio@email.com");
		Cliente cliente2 = new Cliente("Adriano", "senha", "Rua A - Capital - Estado", "85987886721", "adriano@email.com");
		Cliente cliente3 = new Cliente("Giovavna", "senha", "Rua C - Capital - Estado", "1189762367", "giovana@email.com");
		Reserva reserva1= new Reserva(cliente3,suiteMaster,3);
		
		//Adicionando Quartos
		hotel1.adicionaQuarto(suiteMaster);
		hotel1.adicionaQuarto(suiteExecutive);
		
		//Adicionando Funcionarios
		hotel1.adicionaFuncionario(rogerJ);
		
		//Adicionando Clientes
		hotel1.adicionaCliente(cliente1);
		hotel1.adicionaCliente(cliente2);
		hotel1.adicionaCliente(cliente3);
		
		//Adicionando reserva
		hotel1.adicionaReserva(reserva1);
		
		
		System.out.println(hotel1);
		System.out.println(" ");
		System.out.println("Informações de Reservas");
		System.out.println(reserva1);
		
	}
	
	
	
}
