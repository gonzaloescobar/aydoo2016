package ar.edu.untref.aydoo;

public class Program {

	public final void main(String args[]) {

		FactoresPrimos factoresPrimos = new FactoresPrimos();
		ControladorDeEntrada entrada = new ControladorDeEntrada(args);
		String numeroFactorizado = factoresPrimos.descomponerFactoresPrimos(entrada.getNumero());
		ControladorDeSalida salida = new ControladorDeSalida();
		entrada.analizarArgumentos();
		String resultadoFormateado = salida.formatearResultado(entrada.getNumero(), entrada.getFormato(), numeroFactorizado);
		
		if(entrada.getNombreDeArchivo() != ""){			
			salida.imprimirEnArchivo(entrada.getNombreDeArchivo(), resultadoFormateado);
		}else{			
			salida.imprimirEnConsola(resultadoFormateado);
		}


	}

}