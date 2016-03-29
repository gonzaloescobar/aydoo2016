package ar.edu.untref.aydoo;



import org.junit.Assert;
import org.junit.Test;



public class TestMaquinaExpendedoraDeBebidas {

	@Test
	public void testPrepararCafeSolo() {
		Vaso unVaso = new Vaso();
		Cafetero unCafetero = new Cafetero();
		unCafetero.preparaEnEsteVaso(unVaso);
		
		Assert.assertEquals(true, unVaso.getTieneCafe());
	

	}

}
