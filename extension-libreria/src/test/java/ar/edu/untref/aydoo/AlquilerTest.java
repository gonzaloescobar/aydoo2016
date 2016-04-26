package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerTest {

	@Test
	public void laLibreriaCalculaElMontoACobrarParaUnClienteQueAlquilaLibroDiariamente() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new Alquiler(libro, 5);

		Assert.assertEquals(50.0, alquilerHobbit.getPrecio(), 0.0);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeDiasMenorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new Alquiler(libro, 2);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeDiasMayorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new Alquiler(libro, 30);
	}
}
