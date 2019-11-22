import java.util.ArrayList;
import java.util.Collection;

public class Hotel {
	private Collection<Comodiade> comodidade;
	
	public Hotel(Collection<Comodidade> comodidade) {
		super();
		this.comodidade = comodidade;
		
	}

		public Collection<Comodidade> getComodidade() {
			return comodidade;
		}
		public String toString() {
			return "Hotel [comodidade=" + comodidade + "]";
		}
	
	public static void main(String[] args) {
		Collection<Comodidade> comodidades = new ArrayList<Comodidade>();
		comodidades.add(Comodidade.ACADEMIA);
		comodidades.add(Comodidade.ESTACIONAMENTO);
		Hotel hotel = new Hotel(comodidades);
		
		System.out.println(hotel);
		
	}
}
