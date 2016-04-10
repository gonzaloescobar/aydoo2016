package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CompraTest {

	@Test
	public void agregarProductoAUnaCompra() {
		Compra compra = new Compra();
		Producto libro = new Libro("El Hobbit");

		compra.agregarProducto(libro);

		Assert.assertEquals(true, compra.getListDeProductos().contains(libro));
	}

	@Test
	public void getMesDeCompra() {
		Compra compra = new Compra();
		Producto libro = new Libro("El Hobbit");
		Mes mes = Mes.AGOSTO;

		compra.setMes(mes);
		compra.agregarProducto(libro);

		Assert.assertEquals(Mes.AGOSTO, compra.getMes());
	}

	@Test
	public void cantidadDeProductos() {
		Compra compra = new Compra();
		Producto libro = new Libro("El Hobbit");

		compra.agregarProducto(libro);
		compra.setCantidad(2);

		Assert.assertEquals(2, compra.getCantidad(), 0.01);
	}

}
