package projeto.professor.negocio;

import java.util.Date;

public class Facade implements IFacade {

	private static Facade instance;
	private Facade() {
		
	}
	
	public static Facade getInstance() {
		
		if (instance == null) {
			instance = new Facade();
		}
		
		return instance;
		
	}
	
	@Override
	public Hotel cadastrahotHotel(String nome, String endereco, EnumCafeManha cafeManha, EnumClasseHotel classe) {
		// TODO Auto-generated method stub
		return ControladorHotel.getInstance().cadastrahotHotel(nome, endereco, cafeManha, classe);
				
				
	}

	@Override
	public Quarto cadastraQuarto(Hotel hotel,Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		// TODO Auto-generated method stub
		return ControladorQuarto.getInstance().cadastraQuarto(hotel,numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
				
				
	}

	@Override
	public Reserva fazerReserva(Date dataInicio, Date dataFim, Hospede responsavel) {
		// TODO Auto-generated method stub
		return fazerReserva(dataInicio, dataFim, responsavel);
				
	}


}
