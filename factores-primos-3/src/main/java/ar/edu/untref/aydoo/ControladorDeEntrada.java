package ar.edu.untref.aydoo;

import java.util.HashSet;
import java.util.Set;

public class ControladorDeEntrada {
	private int numero = 0;
	private String formato = "pretty";
	private String output = "";
	private String orden = "";
	private Set<String> argumentos;

	public ControladorDeEntrada(String args[]) {
		this.numero = Integer.parseInt(args[0]);
		this.argumentos = new HashSet<String>();
		for (String argumentoActual : args) {
			this.argumentos.add(argumentoActual);
		}
	}

	public void analizarArgumentos() {

		for (String argumentoActual : argumentos) {
			if (argumentoActual.startsWith("--format=")) {
				this.formato = argumentoActual.substring(9).toLowerCase();
			} else if (argumentoActual.startsWith("--sort:")) {
				this.orden = argumentoActual.substring(7);
			} else if (argumentoActual.startsWith("--output-file=")) {
				this.output = argumentoActual.substring(14);
			}

		}
	}

	public String getFormato() {
		return formato;
	}

	public String getNombreDeArchivo() {
		return output;
	}

	public String getOrden() {
		return orden;
	}

	public int getNumero() {
		return numero;
	}

}
