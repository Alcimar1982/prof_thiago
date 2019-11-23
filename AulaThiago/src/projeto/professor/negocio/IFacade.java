package projeto.professor.negocio;

import java.util.Date;

public interface IFacade {
	public Hotel cadastrahotHotel(String nome, String endereco, EnumCafeManha cafeManha, EnumClasseHotel classe);
	public Quarto cadastraQuarto (Hotel hotel,Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao, EnumTipoQuarto tipoQuarto);
	public Reserva fazerReserva (Date dataInicio, Date dataFim, Hospede responsavel);
	
	

}

