package principal;

import bd.CadastroClientes;
import bd.CadastroFuncionarios;
import bd.CadastroQuartos;
import bd.CadastroReservas;
import bd.CadastroServicosAdicionais;
import pessoas.Cliente;
import pessoas.Funcionario;

public class SistemaHotel {
	private CadastroClientes cadastroClientes;
	private CadastroFuncionarios cadastroFuncionarios;
	private CadastroQuartos cadastroQuartos;
	private CadastroReservas cadastroReservas;
	private CadastroServicosAdicionais cadastroServicosAdicionais;

	public SistemaHotel() {
		this.cadastroClientes = new CadastroClientes();
		this.cadastroFuncionarios = new CadastroFuncionarios();
		this.cadastroQuartos = new CadastroQuartos();
		this.cadastroReservas = new CadastroReservas();
		this.cadastroServicosAdicionais = new CadastroServicosAdicionais();
	}

	public CadastroClientes getCadastroClientes() {
		return cadastroClientes;
	}

	public CadastroFuncionarios getCadastroFuncionarios() {
		return cadastroFuncionarios;
	}

	public CadastroQuartos getCadastroQuartos() {
		return cadastroQuartos;
	}

	public CadastroReservas getCadastroReservas() {
		return cadastroReservas;
	}

	public CadastroServicosAdicionais getCadastroServicosAdicionais() {
		return cadastroServicosAdicionais;
	}

	public boolean efetuarLogin(String email, String senha) {
		Cliente cliente = cadastroClientes.buscarCliente(email);
		if (cliente != null && cliente.getSenha().equals(senha)) {
			return true;
		}

		Funcionario funcionario = cadastroFuncionarios.buscarFuncionario(email);
		if (funcionario != null && funcionario.getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
}
