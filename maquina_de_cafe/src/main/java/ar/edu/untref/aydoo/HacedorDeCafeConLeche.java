package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

	private Lechero unLechero;
	private Cafetero unCafetero;
	
	public Vaso prepararEnEsteVaso(Vaso unVaso) {
		this.unLechero.prepararEnEsteVaso(unVaso);
		this.unCafetero.preparaEnEsteVaso(unVaso);
		return unVaso;
	}

}
