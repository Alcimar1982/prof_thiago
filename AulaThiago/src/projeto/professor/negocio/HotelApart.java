package projeto.professor.negocio;

public class HotelApart extends Hotel{

	public HotelApart(String nome, String endereco) {
		super(nome, endereco, EnumCafeManha.NENHUM, EnumClasseHotel.APART);
		// TODO Auto-generated constructor stub
		
		this.getComodidades().add(EnumComodidade.ACADEMIA);
		this.getComodidades().add(EnumComodidade.ESTACIONAMENTO);
		this.getComodidades().add(EnumComodidade.PISCINA);
		this.getComodidades().add(EnumComodidade.SINUCA);
		
	}

}
