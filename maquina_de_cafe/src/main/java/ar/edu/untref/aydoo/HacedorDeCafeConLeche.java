package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

	private Lechero unLechero;
	private Cafetero unCafetero;
	
	public HacedorDeCafeConLeche(){
		unLechero = new Lechero();
		unCafetero = new Cafetero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso unVaso) {
		this.unLechero.prepararEnEsteVaso(unVaso);
		this.unCafetero.prepararEnEsteVaso(unVaso);
		return unVaso;
	}

}
