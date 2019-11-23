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
		if (classe == EnumClasseHotel.BUDGET) {
			IFabricaClasse fabricaClasse = new FabricaClasseBudget();
			Hotel hotel = fabricaClasse.criarHotel(nome, endereco);
		} 
		else if (classe == EnumClasseHotel.CLASSIC) {
			IFabricaClasse fabricaClasse = new FabricaClasseClassic();
			Hotel hotel = fabricaClasse.criarHotel(nome, endereco);
		}

		else if (classe == EnumClasseHotel.APART) {
			IFabricaClasse fabricaClasse = new FabricaClasseApart();
			Hotel hotel = fabricaClasse.criarHotel(nome, endereco);
		}


		return hotel; 
	}


}
