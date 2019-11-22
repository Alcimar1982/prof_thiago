package projeto.liberty.camadas.negocio.modelo;

public class QuartoLuxo extends Quarto {

	public QuartoLuxo(Integer numero, Boolean ehFumante) {
		super(numero, 2, ehFumante, 200.00, "Quarto Luxo",EnumTipoQuarto.LUXO);
	}
	
}