package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ControladorDeSalida {

	public String formatearResultado(int numero, String formato, String numeroFactorizado) {
		String resultado = "";
		switch (formato.toLowerCase()) {
		case "pretty":
			resultado = formatearPretty(numeroFactorizado, numero);
			break;
		case "quiet":
			resultado = formatearQuiet(numeroFactorizado);
			break;
		default:
			resultado = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
			break;
		}
		return resultado;
	}

	private static String formatearPretty(String resultado, int numero) {
		return "Factores primos " + numero + ": " + resultado;
	}

	private static String formatearQuiet(String resultado) {
		resultado = invertir(resultado);
		return resultado = resultado.replace(" ", "\n");
	}

	private static String invertir(String palabra) {
		String resultado = "";

		for (int i = palabra.length() - 2; i >= 0; i--) {
			resultado = resultado + palabra.substring(i, i + 1);
		}
		return resultado;
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
