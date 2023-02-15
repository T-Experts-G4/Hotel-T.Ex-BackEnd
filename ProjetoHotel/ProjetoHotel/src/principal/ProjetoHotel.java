package principal;

import java.util.Scanner;

import bd.CadastroClientes;
import hotel.Quarto;
import hotel.Reserva;
import hotel.ServicoAdicional;
import pessoas.Cliente;
import pessoas.Funcionario;

public class ProjetoHotel {

	public static void main(String[] args) {
		SistemaHotel sistemaHotel = new SistemaHotel();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Selecione a opção desejada:");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Cadastrar Funcionário");
			System.out.println("3. Cadastrar Quarto");
			System.out.println("4. Cadastrar Reserva");
			System.out.println("5. Cadastrar Serviço Adicional");
			System.out.println("6. Listar Clientes");
			System.out.println("7. Listar Funcionários");
			System.out.println("8. Listar Quartos");
			System.out.println("9. Listar Reservas");
			System.out.println("10. Listar Serviços Adicionais");
			System.out.println("0. Sair");
			System.out.println();
			System.out.println();
			int opcao = scan.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o nome do cliente:");
				String nome = scan.next();

				System.out.println("Digite o telefone do cliente:");
				String telefone = scan.next();

				System.out.println("Digite o endereco do cliente:");
				String endereco = scan.next();

				System.out.println("Digite o email do cliente:");
				String email = scan.next();

				System.out.println("Digite a senha do cliente:");
				String senha = scan.next();

				Cliente cliente = new Cliente(nome, senha, endereco, telefone, email);
				sistemaHotel.getCadastroClientes().adicionarCliente(cliente);
				System.out.println("Cliente cadastrado com sucesso!");
				System.out.println();
			}
			case 2: {
				System.out.println("Digite o nome do funcionário:");
				String nome = scan.next();

				System.out.println("Digite o cargo do cliente:");
				String cargo = scan.next();

				System.out.println("Digite o matricula do cliente:");
				int matricula = scan.nextInt();

				System.out.println("Digite o email do funcionário:");
				String email = scan.next();

				System.out.println("Digite a senha do funcionário:");
				String senha = scan.next();

				Funcionario funcionario = new Funcionario(nome, senha, matricula, cargo, email);
				sistemaHotel.getCadastroFuncionarios().adicionarFuncionario(funcionario);
				System.out.println("Funcionário cadastrado com sucesso!");
				System.out.println();

			}
			case 3: {
				System.out.println("Digite o número do quarto:");
				int numero = scan.nextInt();
				/*
				 * System.out.println("Digite a quantidade de camas do quarto:"); int
				 * quantidadeCamas = scan.nextInt();
				 */
				System.out.println("Digite o preço do quarto:");
				double precoDiaria = scan.nextDouble();

				Quarto quarto = new Quarto(numero, precoDiaria);
				sistemaHotel.getCadastroQuartos().adicionarQuarto(quarto);
				System.out.println("Quarto cadastrado com sucesso!");
				System.out.println();
			}
			case 4: {
				System.out.println("Digite o email do cliente:");
				String emailCliente = scan.next();

				System.out.println("Digite o número do quarto:");
				String opcaoQuarto = scan.next();

				System.out.println("Digite quantos dias irá ficar no hotel:");
				int dias = scan.nextInt();

				// System.out.println("Digite a data de fim da reserva (dd/mm/yyyy):");
				// String dataFim = scan.next();

				Reserva reserva = new Reserva(emailCliente, opcaoQuarto, dias);
				sistemaHotel.getCadastroReservas().adicionarReserva(reserva);
				System.out.println("Reserva efetuada com sucesso!");
				System.out.println();
			}
			case 5: {
				System.out.println("Digite o nome do serviço adicional:");
				String nome = scan.next();

				System.out.println("Digite o preço do serviço adicional:");
				double preco = scan.nextDouble();

				ServicoAdicional servicoAdicional = new ServicoAdicional(nome, preco);
				sistemaHotel.getCadastroServicosAdicionais().adicionarServicoAdicional(servicoAdicional);
				System.out.println("Serviço adicional cadastrado com sucesso!");
				System.out.println();
			}
			case 6: {
				System.out.println("Lista de Clientes:");
				for (Cliente cliente : sistemaHotel.getCadastroClientes().getClientes()) {
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("E-mail: " + cliente.getEmail());
					System.out.println();
				}
			}
			case 7: {
				System.out.println("Lista de Funcionários:");
				for (Funcionario funcionario : sistemaHotel.getCadastroFuncionarios().getFuncionarios()) {
					System.out.println("Nome: " + funcionario.getNome());
					System.out.println("E-mail: " + funcionario.getEmail());
					System.out.println();
				}
			}
			case 8: {
				System.out.println("Lista de Quartos:");
				for (Quarto quarto : sistemaHotel.getCadastroQuartos().getQuartos()) {
					System.out.println("Número: " + quarto.getNumero());
					System.out.println("Preço: " + quarto.getPrecoDiaria());
					System.out.println();
				}
			}
			case 9: {
				System.out.println("Lista de Reservas:");
				for (Reserva reserva : sistemaHotel.getCadastroReservas().getReservas()) {
					System.out.println("E-mail do Cliente: " + reserva.getEmailCliente());
					System.out.println("Número do Quarto: " + reserva.getNumeroQuarto());
					/*
					 * System.out.println("Data de Início: " + reserva.getDataInicio());
					 * System.out.println("Data de Fim: " + reserva.getDataFim());
					 */
					System.out.println(reserva.getQuarto());
					System.out.println();
				}
			}
			case 10: {
				System.out.println("Lista de Serviços Adicionais:");
				for (ServicoAdicional servicoAdicional : sistemaHotel.getCadastroServicosAdicionais()
						.getServicosAdicionais()) {
					System.out.println("Nome: " + servicoAdicional.getDescricao());
					System.out.println("Preço: " + servicoAdicional.getPreco());
					System.out.println();
				}
			}
			case 0: {
				System.out.println("Saindo do sistema...");
				break;
			}
			
			default: {
				System.out.println("Opção invalida");
			}
		}
	}
}
}