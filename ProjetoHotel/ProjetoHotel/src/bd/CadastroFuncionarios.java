package bd;

import java.util.ArrayList;
import java.util.List;

import pessoas.Funcionario;

public class CadastroFuncionarios {
	 private List<Funcionario> funcionarios;
	  
	  public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public CadastroFuncionarios() {
	    funcionarios = new ArrayList<Funcionario>();
	  }
	  
	  public void adicionarFuncionario(Funcionario funcionario) {
	    funcionarios.add(funcionario);
	  }
	  
	  public Funcionario buscarFuncionario(String email) {
	    for (Funcionario funcionario : funcionarios) {
	      if (funcionario.getEmail().equals(email)) {
	        return funcionario;
	      }
	    }
	    return null;
	  }
}
