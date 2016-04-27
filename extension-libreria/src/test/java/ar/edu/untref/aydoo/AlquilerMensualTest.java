package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerMensualTest {

	@Test
	public void laLibreriaCalculaElMontoACobrarParaUnClienteQueAlquilaLibroMensualmente() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerMensual(libro, 2);

		Assert.assertEquals(400, alquilerHobbit.getPrecio(), 0.0);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeMesessMenorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerMensual(libro, 0);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeMesesMayorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerMensual(libro, 4);
	}

}
