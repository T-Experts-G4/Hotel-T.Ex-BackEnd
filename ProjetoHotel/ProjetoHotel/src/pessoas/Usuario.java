package pessoas;

public class Usuario {
	protected String nome;
	protected String senha;

	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public boolean autenticar(String nome, String senha) {
		return this.nome.equals(nome) && this.senha.equals(senha);
	}
}
