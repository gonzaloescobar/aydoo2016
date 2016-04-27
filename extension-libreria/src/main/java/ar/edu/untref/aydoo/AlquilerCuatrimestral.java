package ar.edu.untref.aydoo;

public class AlquilerCuatrimestral extends Alquiler{
	
	private double descuento = 10.00;
	private double precioMensual = 200;
	
	public AlquilerCuatrimestral(Producto unProducto, int cantidadDeCuatrimestres) {
		super(unProducto, cantidadDeCuatrimestres);
		
		this.setPeriodoMinimoDeAlquiler(1);
		this.setPeriodoMaximoDeAlquiler(2);
		this.setPrecio((this.precioBrutoPorCuatrimestre() * cantidadDeCuatrimestres) - (((this.precioBrutoPorCuatrimestre() * cantidadDeCuatrimestres)*(this.descuento * cantidadDeCuatrimestres))/100));

		if (cantidadDeCuatrimestres >= this.getPeriodoMinimoDeAlquiler()
				&& cantidadDeCuatrimestres <= this.getPeriodoMaximoDeAlquiler()) {
			this.getProductos().add(unProducto);
		} else {
			throw new PeriodoDeAlquilerInvalidoException("La cantidad de cuatrimestres de alquiler debe ser mayor a "
					+ this.getPeriodoMinimoDeAlquiler() + " y menor a " + this.getPeriodoMaximoDeAlquiler());
		}
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}
	
	private double precioBrutoPorCuatrimestre(){
		return this.precioMensual * 4;
	}

}
