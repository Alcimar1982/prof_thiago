package projeto.liberty.camadas.negocio.modelo;

public interface IFabricaClasse {
	public Hotel criarHotel(String nome, String endereco);
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto);
	
}