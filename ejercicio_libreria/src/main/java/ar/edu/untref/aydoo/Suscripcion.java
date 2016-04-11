package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Suscripcion extends Producto {
	private List<Producto> productos = new LinkedList<Producto>();
	double descuento = 20;

	public Suscripcion() {

	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public double getPrecio() {
		double precio = 0;
		Frecuencia frecuencia = Frecuencia.NULA;
		for (Producto productoActual : productos) {
			frecuencia = ((Revista) productoActual).getFrecuencia();
			switch (frecuencia) {
			case DIARIA:
				precio = productoActual.getPrecio() * 30;
				break;
			case SEMANAL:
				precio = productoActual.getPrecio() * 7;
				break;
			case QUINCENAL:
				precio = productoActual.getPrecio() * 2;
				break;
			case MENSUAL:
				precio = productoActual.getPrecio() * 1;
				break;
			default:
				precio = productoActual.getPrecio() * 1;
				break;

			}
		}
		return precio;
	}
}
