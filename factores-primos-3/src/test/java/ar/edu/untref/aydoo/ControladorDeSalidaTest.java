package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;



public class ControladorDeSalidaTest {

	@Test
	public void testPrettyAsc() {
		String args[] = { "90", "--format=pretty", "--sort:asc" };
		ControladorDeEntrada ce = new ControladorDeEntrada(args);
		ce.analizarArgumentos();
		ControladorDeSalida controlador = new ControladorDeSalida();
		String resultado = controlador.formatearResultado(90, "pretty", "2 3 3 5", ce.getOrden());
		
		Assert.assertEquals("asc", ce.getOrden());
		Assert.assertEquals("Factores primos 90: 2 3 3 5",resultado);
	}
	
	@Test
	public void testPrettyDesc() {
		String args[] = { "90", "--format=pretty", "--sort:des" };
		ControladorDeEntrada ce = new ControladorDeEntrada(args);
		ce.analizarArgumentos();
		ControladorDeSalida controlador = new ControladorDeSalida();
		String resultado = controlador.formatearResultado(90, "pretty", "2 3 3 5 ", ce.getOrden());
		
		Assert.assertEquals("des", ce.getOrden());
		Assert.assertEquals("Factores primos 90: 5 3 3 2",resultado);
	}
	
	@Test
	public void testQuietDes() {
		String args[] = { "90", "--format=quiet", "--sort:des" };
		ControladorDeEntrada ce = new ControladorDeEntrada(args);
		ce.analizarArgumentos();
		ControladorDeSalida controlador = new ControladorDeSalida();
		String resultado = controlador.formatearResultado(90, "quiet", "2 3 3 5 ", ce.getOrden());
		
		Assert.assertEquals("des", ce.getOrden());
		Assert.assertEquals("5\n3\n3\n2",resultado);
	}
	
	@Test
	public void testQuietAsc() {
		String args[] = { "90", "--format=quiet", "--sort:asc" };
		ControladorDeEntrada ce = new ControladorDeEntrada(args);
		ce.analizarArgumentos();
		ControladorDeSalida controlador = new ControladorDeSalida();
		System.out.println(ce.getOrden());
		String resultado = controlador.formatearResultado(90, "quiet", "2 3 3 5 ", ce.getOrden());
		
		Assert.assertEquals("asc", ce.getOrden());
		Assert.assertEquals("2\n3\n3\n5\n",resultado);
	}
	
	@Test
	public void testYerba() {
		String args[] = { "90", "--format=quiet", "--sort:des" };
		ControladorDeEntrada ce = new ControladorDeEntrada(args);
		ce.analizarArgumentos();
		ControladorDeSalida controlador = new ControladorDeSalida();
		String resultado = controlador.formatearResultado(90, "yerba", "2 3 3 5 ", ce.getOrden());
		
		Assert.assertEquals("des", ce.getOrden());
		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.",resultado);
	}

}
