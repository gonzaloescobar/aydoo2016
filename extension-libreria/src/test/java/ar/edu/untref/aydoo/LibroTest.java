package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void ponerNombreAlLibro(){
		Libro miLibro = new Libro("El arte de la guerra");
		Assert.assertEquals("El arte de la guerra", miLibro.getNombre());
	}

	@Test
	public void ponerPrecioAlLibro(){
		Libro miLibro = new Libro("El arte de la guerra");
		miLibro.setPrecio(25.55);
		Assert.assertEquals(25.55, miLibro.getPrecio(), 0.0);
	}

	@Test(expected = Exception.class)  
	public void ponerPrecioNegativoAlLibroLanzaException(){
		Libro miLibro = new Libro("El arte de la guerra");
		miLibro.setPrecio(-25.55);
	}
}
