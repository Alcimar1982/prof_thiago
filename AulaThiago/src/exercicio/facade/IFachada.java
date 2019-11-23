package exercicio.facade;

import java.util.Collection;
import java.util.Date;

public interface IFachada {
	public Cliente cadastrarCliente(String nome, String endereco, String cpf, Date DataNascimento); 
	public Veiculo cadastrarVeiculos(String placa, String modelo, String cor);
	public float locarVeiculo (Cliente cliente, Veiculo veiculo, Date inicio, Date fim);
	public Collection<Veiculo> listarVeiculosDisponiveis(Date inicio, Date fim);
			
		
}
