package projeto.liberty.camadas.negocio.modelo;

public class FabricaClasseBudget implements IFabricaClasse {

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		// TODO Auto-generated method stub
		return new HotelBudget(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		// TODO Auto-generated method stub
		return new QuartoBudget(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}

	
}