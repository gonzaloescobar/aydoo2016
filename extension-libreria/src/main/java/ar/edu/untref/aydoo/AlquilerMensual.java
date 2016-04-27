package ar.edu.untref.aydoo;

public class AlquilerMensual extends Alquiler {

	public AlquilerMensual(Producto unProducto, int cantidadDeMeses) {
		super(unProducto, cantidadDeMeses);

		this.setPeriodoMinimoDeAlquiler(1);
		this.setPeriodoMaximoDeAlquiler(3);
		this.setPrecio(200);

		if (cantidadDeMeses >= this.getPeriodoMinimoDeAlquiler()
				&& cantidadDeMeses <= this.getPeriodoMaximoDeAlquiler()) {
			this.getProductos().add(unProducto);
		} else {
			throw new PeriodoDeAlquilerInvalidoException("La cantidad de meses de alquiler debe ser mayor a "
					+ this.getPeriodoMinimoDeAlquiler() + " y menor a " + this.getPeriodoMaximoDeAlquiler());
		}
	}

	public double getPrecio() {
		return this.getPeriodoAlquilado() * super.getPrecio();
	}

}
