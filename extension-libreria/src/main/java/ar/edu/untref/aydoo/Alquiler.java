package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public abstract class Alquiler extends Producto{
	
	private int periodoAlquilado = 0;
	private List<Producto> productos;
	private int periodoMinimoDeAlquiler = 0;
	private int periodoMaximoDeAlquiler = 0;
	
	public Alquiler(Producto unProducto, int periodo) {
		super("");
		this.productos = new LinkedList<Producto>();
		this.setPeriodoAlquilado(periodo);
	}

	public int getPeriodoAlquilado() {
		return periodoAlquilado;
	}

	public void setPeriodoAlquilado(int diasAlquilados) {
		this.periodoAlquilado = diasAlquilados;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getPeriodoMinimoDeAlquiler() {
		return periodoMinimoDeAlquiler;
	}

	public void setPeriodoMinimoDeAlquiler(int periodoMinimoDeAlquiler) {
		this.periodoMinimoDeAlquiler = periodoMinimoDeAlquiler;
	}

	public int getPeriodoMaximoDeAlquiler() {
		return periodoMaximoDeAlquiler;
	}

	public void setPeriodoMaximoDeAlquiler(int periodoMaximoDeAlquiler) {
		this.periodoMaximoDeAlquiler = periodoMaximoDeAlquiler;
	}

}
