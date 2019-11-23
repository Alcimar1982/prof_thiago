package projeto.professor.negocio;

public class ControladorHotel {

	private static ControladorHotel instance;
	private ControladorHotel() {

	}

	public static ControladorHotel getInstance() {

		if (instance == null) {
			instance = new ControladorHotel();
		}

		return instance;

	}

	public Hotel cadastrahotHotel(String nome, String endereco, EnumCafeManha cafeManha, EnumClasseHotel classe) {
		IFabricaClasse fabricaClasse = null;
		
		if (classe == EnumClasseHotel.BUDGET) {
			fabricaClasse = new FabricaClasseBudget();
						 
		} 
		else if (classe == EnumClasseHotel.CLASSIC) {
			fabricaClasse = new FabricaClasseClassic();
						
		}

		else if (classe == EnumClasseHotel.APART) {
			fabricaClasse = new FabricaClasseApart();
					
		}
		Hotel hotel = fabricaClasse.criarHotel(nome, endereco);

		return hotel; 
	}


}
