package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ControladorDeSalida {

	public String formatearResultado(int numero, String formato, String numeroFactorizado, String orden) {
		String resultado = "";
		switch (formato.toLowerCase()) {
		case "pretty":
			resultado = formatearPretty(numeroFactorizado, numero, orden);
			break;
		case "quiet":
			resultado = formatearQuiet(numeroFactorizado, orden);
			break;
		default:
			resultado = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
			break;
		}
		return resultado;
	}

	private static String formatearPretty(String resultado, int numero, String orden) {

		if (orden.equals("des")) {
			resultado = invertirPretty(resultado);
		}
		return "Factores primos " + numero + ": " + resultado;
	}

	private static String formatearQuiet(String resultado, String orden) {
		if(orden.equals("des") || orden.equals("")){
			resultado = invertir(resultado);
		}		
		resultado = resultado.replace(" ", "\n");
			
		return resultado;
	}
	
    private static String invertir(String palabra){
		String resultado = "";
		
		for(int i = palabra.length()-2; i >= 0; i--){
			resultado = resultado + palabra.substring(i,i+1);
		}	
		return resultado;
	}

	private static String invertirPretty(String palabra) {
		String palabraInvertida = "";

		for (int i = palabra.length() - 2; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.substring(i, i + 1);
		}
		
		return palabraInvertida;
	}

	public void imprimirEnArchivo(String nombreArchivo, String resultado) {
		File archivo;
		archivo = new File(nombreArchivo);

		try {
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);

			wr.write(resultado);
			wr.close();
			bw.close();
		} catch (IOException e) {
		}
		;
	}

	public void imprimirEnConsola(String texto) {
		System.out.println(texto);
	}
}
