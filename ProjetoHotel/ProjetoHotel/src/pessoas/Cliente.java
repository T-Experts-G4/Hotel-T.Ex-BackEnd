package pessoas;

public class Cliente extends Usuario {
	private String endereco;
	private String telefone;
	private String email;

	public Cliente(String nome, String senha, String endereco, String telefone, String email) {
		super(nome, senha);
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
