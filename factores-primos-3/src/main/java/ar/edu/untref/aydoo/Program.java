package ar.edu.untref.aydoo;

public class Program {

	public static void main(String args[]) {

		FactoresPrimos factoresPrimos = new FactoresPrimos();
		ControladorDeEntrada entrada = new ControladorDeEntrada(args);
		entrada.analizarArgumentos();
		String numeroFactorizado = factoresPrimos.descomponerFactoresPrimos(entrada.getNumero());
		ControladorDeSalida salida = new ControladorDeSalida();
		String resultadoFormateado = salida.formatearResultado(entrada.getNumero(), entrada.getFormato(), numeroFactorizado, entrada.getOrden());
		if(entrada.getNombreDeArchivo() != ""){			
			salida.imprimirEnArchivo(entrada.getNombreDeArchivo(), resultadoFormateado);
		}else{			
			salida.imprimirEnConsola(resultadoFormateado);
		}


	}

}