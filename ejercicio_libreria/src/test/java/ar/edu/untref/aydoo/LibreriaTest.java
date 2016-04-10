package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {

	@Test
	public void createEmptyBookStore() {
		Libreria myBookStore = new Libreria("PanamaPapers");

		String name = myBookStore.getNombre();

		Assert.assertEquals("PanamaPapers", name);
	}
	
	@Test
	public void createBookStoreWithBook() {
		Libreria myBookStore = new Libreria("PanamaPapers");
		Producto book = new Libro("The Hobbit");
		
		myBookStore.agregarProducto(book);

		Assert.assertEquals(1, myBookStore.getListaDeProductos().size());
	}
	
	@Test
	public void createBookStoreWithMagazine() {
		Libreria myBookStore = new Libreria("PanamaPapers");
		Producto magazine = new Revista("El grafico", Frecuencia.MENSUAL);
		
		myBookStore.agregarProducto(magazine);

		Assert.assertEquals(1, myBookStore.getListaDeProductos().size());
	}
	
	@Test
	public void calcularMontoACobrarJuan() {
		Libreria libreria = new Libreria("PanamaPapers");
		Revista unaRevista = new Revista("El grafico", Frecuencia.NULA);
		Libro unLibro = new Libro("The Hobbit");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("lapicera");
		Cliente clienteJuan = new Cliente("Juan");
		Compra compra = new Compra();

		
		unaRevista.setPrecio(30);
		unLibro.setPrecio(50);
		articulo.setPrecio(5);
		compra.agregarProducto(articulo);
		compra.agregarProducto(articulo);
		compra.agregarProducto(unLibro);
		compra.agregarProducto(unaRevista);
		compra.setMes(Mes.AGOSTO);
		clienteJuan.agregarCompra(compra);
		libreria.agregarCliente(clienteJuan);
		double resultado = libreria.calcularMontoACobrar(Mes.AGOSTO, clienteJuan);
		
		Assert.assertEquals(92.1, resultado,0.01);
	}

}
