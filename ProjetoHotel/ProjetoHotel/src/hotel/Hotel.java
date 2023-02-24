package hotel;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import pessoas.Funcionario;

public class Hotel {
	
	private int id;
	private String nome;
	private Endereco endereco;
	private List<Quarto> quartos = new LinkedList<Quarto>();
	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	
	
	public Hotel (int id, String nome, Endereco endereco) {
		
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Quarto> getQuartos() {
		
		return Collections.unmodifiableList(quartos);
	}
	
	public void adicionaQuarto (Quarto quarto) {
		this.quartos.add(quarto);
	}
	
	public void adicionaFuncionario (Funcionario funcionario) {
		
	}

	@Override
	public String toString() {
		
		return "Id: " + id + "\nNome : " + nome + "\nEndereco" + endereco.toString();
	}
}
