package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

	private	HacedorDeCafeConLeche hacedorCafeConLeche;
	
	public Vaso prepararEnEsteVaso(Vaso unVaso) {
		Vaso vaso = hacedorCafeConLeche.prepararEnEsteVaso(unVaso);
		return vaso;
	}
	

}
