package bd;

import java.util.ArrayList;

import hotel.Quarto;

public class CadastroQuartos {
	private ArrayList<Quarto> quartos;

	public ArrayList<Quarto> getQuartos() {
		return quartos;
	}

	public CadastroQuartos() {
		this.quartos = new ArrayList<>();
	}

	public void adicionarQuarto(Quarto quarto) {
		quartos.add(quarto);
	}

	public Quarto buscarQuarto(int numero) {
		for (Quarto quarto : quartos) {
			if (quarto.getNumero() == numero) {
				return quarto;
			}
				
		} return null;
	}
}
