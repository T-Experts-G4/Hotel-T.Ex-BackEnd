package bd;

import java.util.ArrayList;

import pessoas.Usuario;

public class CadastroUsuarios {
	private ArrayList<Usuario> usuarios;

	public CadastroUsuarios() {
	    this.usuarios = new ArrayList<>();
	  }

	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public Usuario autenticarUsuario(String nome, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.autenticar(nome, senha)) {
				return usuario;
			}
		}
		return null;
	}
}
