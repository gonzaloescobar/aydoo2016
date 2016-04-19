package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;


public class FactoresPrimosTest {
	
	/*Prueba la factorización con el numero 90*/
	@Test
	public void testFactorizarNumero90() {
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.descomponerFactoresPrimos(90);
		
		Assert.assertEquals("2 3 3 5 ", resultado);
	}
	
	/*Prueba la factorización con el numero 360*/
	@Test
	public void testFactorizarNumero360() {
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.descomponerFactoresPrimos(360);
		
		Assert.assertEquals("2 2 2 3 3 5 ", resultado);
	}
	
	/*Prueba la factorización con el primer divisor*/
	@Test
	public void testFactorizarNumero2() {
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.descomponerFactoresPrimos(2);
		
		Assert.assertEquals("2 ", resultado);
	}
	
	/*Prueba la factorización con un numero que no se puede descomponer*/
	@Test
	public void testFactorizarNumero7() {
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.descomponerFactoresPrimos(7);
		
		Assert.assertEquals("7 ", resultado);
	}

}
