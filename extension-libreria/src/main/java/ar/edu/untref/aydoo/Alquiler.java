package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Alquiler extends Producto {

	private int diasAlquilados = 0;
	private List<Producto> productos;

	public Alquiler(Producto unProducto, int cantidadDeDias) {
		super("");
		this.productos = new LinkedList<Producto>();
		this.setDiasAlquilados(cantidadDeDias);
		this.setPrecio(10);
		if (cantidadDeDias > 3 && cantidadDeDias < 25) {
			this.productos.add(unProducto);
		} else {
			throw new PeriodoDeAlquilerInvalidoException("La cantidad no puede ser negativa");
		}
	}

	public double getPrecio() {
		return this.diasAlquilados * super.getPrecio();
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}

	public void setDiasAlquilados(int diasAlquilados) {
		this.diasAlquilados = diasAlquilados;
	}

}
