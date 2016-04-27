package ar.edu.untref.aydoo;

public class AlquilerDiario extends Alquiler {

	public AlquilerDiario(Producto unProducto, int cantidadDeDias) {
		super(unProducto, cantidadDeDias);
		this.setPeriodoMinimoDeAlquiler(3);
		this.setPeriodoMaximoDeAlquiler(25);
		this.setPrecio(10);
		if (cantidadDeDias >= this.getPeriodoMinimoDeAlquiler() && cantidadDeDias <= this.getPeriodoMaximoDeAlquiler()) {
			this.getProductos().add(unProducto);
		} else {
			throw new PeriodoDeAlquilerInvalidoException(
					"La cantidad de dias de alquiler debe ser mayor a " + this.getPeriodoMinimoDeAlquiler()
							+ " dias y menor a " + this.getPeriodoMaximoDeAlquiler() + " dias.");
		}
	}

	public double getPrecio() {
		return this.getPeriodoAlquilado() * super.getPrecio();
	}

}
