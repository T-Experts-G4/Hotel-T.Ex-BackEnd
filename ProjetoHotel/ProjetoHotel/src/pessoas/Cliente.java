package pessoas;

import hotel.Endereco;

public class Cliente extends Usuario {

	private Endereco endereco;
	private String telefone;
	private String email;
	
	public Cliente(String nome, String senha) {
		super(nome, senha);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {

		return senha;
	}

	public String getNome() {

		return nome;
	}

}
