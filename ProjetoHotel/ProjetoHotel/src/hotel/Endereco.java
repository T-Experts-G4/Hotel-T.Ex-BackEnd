package hotel;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String estado;
	private int cep;
	
	
	public Endereco(String rua, int numero, String cidade, String estado, int cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Endereço: " + rua + ", " + numero + " - " + cidade + " - " + estado; 
	}

}
