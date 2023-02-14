package bd;

import java.util.ArrayList;
import java.util.List;

import pessoas.Cliente;

public class CadastroClientes {
	  private List<Cliente> clientes;
	  
	  public List<Cliente> getClientes() {
		return clientes;
	}

	public CadastroClientes() {
	    clientes = new ArrayList<Cliente>();
	  }
	  
	  public void adicionarCliente(Cliente cliente) {
	    clientes.add(cliente);
	  }
	  
	  public Cliente buscarCliente(String email) {
	    for (Cliente cliente : clientes) {
	      if (cliente.getEmail().equals(email)) {
	        return cliente;
	      }
	    }
	    return null;
	  }
	  
	  public void listaClientes () {
		  for(Cliente cliente : clientes) {
			 cliente.getEmail();
		  }
	  }
}
