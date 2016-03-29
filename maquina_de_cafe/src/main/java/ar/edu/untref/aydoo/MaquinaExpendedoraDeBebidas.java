package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

	private	HacedorDeCafeConLeche hacedorCafeConLeche;
	private Azucarero unAzucarero;
	
	public MaquinaExpendedoraDeBebidas(){
		this.hacedorCafeConLeche = new HacedorDeCafeConLeche();
		this.unAzucarero = new Azucarero();
	}
	
	public Vaso hacerCafeConLecheConNDeAzucar(Vaso unVaso) {
		this.hacedorCafeConLeche.prepararEnEsteVaso(unVaso);
		this.unAzucarero.ponerNenEsteVaso(unVaso);
		return unVaso;
	}
	

}
