package bd;

import java.util.ArrayList;

import hotel.Reserva;

public class CadastroReservas {
	  private ArrayList<Reserva> reservas;
	  
	  public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public CadastroReservas() {
	    this.reservas = new ArrayList<>();
	  }
	  
	  public void adicionarReserva(Reserva reserva) {
	    reservas.add(reserva);
	    //reserva.getQuarto().setDisponivel(false);
	  }
	  
	  public void cancelarReserva(Reserva reserva) {
	    reservas.remove(reserva);
	    //reserva.getQuarto().setDisponivel(true);
	  }
}
