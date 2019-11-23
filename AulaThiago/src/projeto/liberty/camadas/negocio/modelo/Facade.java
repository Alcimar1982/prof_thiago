package projeto.liberty.camadas.negocio.modelo;

import java.util.Date;

public class Facade implements IFacade {

	@Override
	public Hotel cadastrahotHotel(String nome, String endereco, EnumCafeManha cafeManha, EnumClasseHotel classe) {
		// TODO Auto-generated method stub
		return cadastrahotHotel(nome, endereco, cafeManha, classe);
	}

	@Override
	public Quarto cadastraQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		// TODO Auto-generated method stub
		return cadastraQuarto(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
				
				
	}

	@Override
	public Reserva fazerReserva(Date dataInicio, Date dataFim, Hospede responsavel) {
		// TODO Auto-generated method stub
		return fazerReserva(dataInicio, dataFim, responsavel);
				
	}


}
