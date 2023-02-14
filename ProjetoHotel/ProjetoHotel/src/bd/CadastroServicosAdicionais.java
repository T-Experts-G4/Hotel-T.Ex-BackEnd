package bd;

import java.util.ArrayList;

import hotel.ServicoAdicional;

public class CadastroServicosAdicionais {
	private ArrayList<ServicoAdicional> servicosAdicionais;

	public CadastroServicosAdicionais() {
		this.servicosAdicionais = new ArrayList<>();
	}

	public void adicionarServicoAdicional(ServicoAdicional servicoAdicional) {
		servicosAdicionais.add(servicoAdicional);
	}

	public ServicoAdicional buscarServicoAdicional(String descricao) {
		for (ServicoAdicional servicoAdicional : servicosAdicionais) {
			if (servicoAdicional.getDescricao().equals(descricao)) {
				return servicoAdicional;
			}
		}
		return null;
	}

	public ArrayList<ServicoAdicional> getServicosAdicionais() {
		return servicosAdicionais;
	}
}
