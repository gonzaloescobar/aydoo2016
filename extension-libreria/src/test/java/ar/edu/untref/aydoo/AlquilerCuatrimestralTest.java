package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerCuatrimestralTest {

	@Test
	public void laLibreriaCalculaElMontoACobrarParaUnClienteQueAlquilaLibroCuatrimestralmente() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerCuatrimestral(libro, 1);

		Assert.assertEquals(720, alquilerHobbit.getPrecio(), 0.0);
	}
	@Test
	public void laLibreriaCalculaElMontoACobrarParaUnClienteQueAlquilaLibroDosCuatrimestres() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerCuatrimestral(libro, 2);

		Assert.assertEquals(1280, alquilerHobbit.getPrecio(), 0.0);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeCuatrimestresMenorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerCuatrimestral(libro, 0);
	}

	@SuppressWarnings("unused")
	@Test(expected = PeriodoDeAlquilerInvalidoException.class)
	public void alquilerLibroPorCantidadDeCuatrimestresMayorAlPermitido() {
		Producto libro = new Libro("El Hobbit");
		Producto alquilerHobbit = new AlquilerCuatrimestral(libro, 4);
	}

}
