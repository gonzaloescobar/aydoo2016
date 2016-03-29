package ar.edu.untref.aydoo;



import org.junit.Assert;
import org.junit.Test;



public class TestMaquinaExpendedoraDeBebidas {

	@Test
	public void testPrepararCafeSolo() {
		Vaso unVaso = new Vaso();
		Cafetero unCafetero = new Cafetero();
		unCafetero.prepararEnEsteVaso(unVaso);
		
		Assert.assertEquals(true, unVaso.getTieneCafe());
	
	}
	
	@Test
	public void testPrepararLecheSola() {
		Vaso unVaso = new Vaso();
		Lechero lechero = new Lechero();
		lechero.prepararEnEsteVaso(unVaso);
		
		Assert.assertEquals(true, unVaso.getTieneLeche());
	
	}
	
	@Test
	public void testPrepararSoloAzucar() {
		Vaso unVaso = new Vaso();
		Azucarero azucarero = new Azucarero();
		azucarero.ponerNenEsteVaso(unVaso);
		
		Assert.assertEquals(true, unVaso.getTieneAzucar());
	
	}

}
