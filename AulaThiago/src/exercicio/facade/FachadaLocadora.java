package exercicio.facade;

import java.util.Collection;
import java.util.Date;

public class FachadaLocadora implements IFachada{
	private RepositorioCliente repositoriCliente;
	private RepositorioVeiculo repositoriVeiculo;
	
	@Override
	public Cliente cadastrarCliente(String nome, String endereco, String cpf, Date DataNascimento) {
		Cliente cliente = new Cliente();
		repositoriCliente.cadastrarCliente(cliente);
		return cliente;
		
	}

	@Override
	public Veiculo cadastrarVeiculos(String placa, String modelo, String cor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Veiculo> listarVeiculosDisponiveis(Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
