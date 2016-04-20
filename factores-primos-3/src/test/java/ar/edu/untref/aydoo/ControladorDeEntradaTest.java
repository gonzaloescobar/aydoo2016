package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;



public class ControladorDeEntradaTest {

	@Test
	public void getOrdenDesc() {
		String args[] = { "90", "--format=pretty", "--sort:des" };
		ControladorDeEntrada controlador = new ControladorDeEntrada(args);
		controlador.analizarArgumentos();
		Assert.assertEquals("des", controlador.getOrden());
	}
	
	@Test
	public void getOrdenAsc() {
		String args[] = { "90", "--format=pretty", "--sort:asc" };
		ControladorDeEntrada controlador = new ControladorDeEntrada(args);
		controlador.analizarArgumentos();
		Assert.assertEquals("asc", controlador.getOrden());
	}
	
	@Test
	public void getFormato() {
		String args[] = { "90", "--format=pretty", "--sort:asc" };
		ControladorDeEntrada controlador = new ControladorDeEntrada(args);
		controlador.analizarArgumentos();
		Assert.assertEquals("pretty", controlador.getFormato());
	}
	
	@Test
	public void getNombreDeArchivo() {
		String args[] = { "90", "--output-file=salida.txt", "--format=quiet"};
		ControladorDeEntrada controlador = new ControladorDeEntrada(args);
		controlador.analizarArgumentos();
		Assert.assertEquals("salida.txt", controlador.getNombreDeArchivo());
	}

}
