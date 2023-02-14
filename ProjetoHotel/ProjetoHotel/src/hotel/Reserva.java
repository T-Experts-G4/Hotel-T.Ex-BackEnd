package hotel;

import pessoas.Cliente;
import hotel.Quarto;

public class Reserva {
	private Cliente cliente;
	private Quarto quarto;
	private String emailCliente;
	private String numeroQuarto;
	private int dias;

	public Reserva(String emailCliente, String numeroQuarto, int dias) {
		this.emailCliente = emailCliente;
		this.numeroQuarto = numeroQuarto;
		this.dias = dias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getQuarto() {
		return numeroQuarto;
	}

	public int getDias() {
		return dias;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}

	public String getNumeroQuarto() {
		return numeroQuarto;
	}

	public double calcularPreco() {
		return quarto.getPrecoDiaria() * dias;
	}
}
