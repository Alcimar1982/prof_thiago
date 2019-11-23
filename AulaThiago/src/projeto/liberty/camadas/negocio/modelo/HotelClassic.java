package projeto.liberty.camadas.negocio.modelo;

public class HotelClassic extends Hotel {

	public HotelClassic(String nome, String endereco) {
		super(nome, endereco, EnumCafeManha.COMPLETO, EnumClasseHotel.CLASSIC);
		// TODO Auto-generated constructor stub
		
		this.getComodidades().add(EnumComodidade.ACADEMIA);
		this.getComodidades().add(EnumComodidade.ESTACIONAMENTO);
	}

}
