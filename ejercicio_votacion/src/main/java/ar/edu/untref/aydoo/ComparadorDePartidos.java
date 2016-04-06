package ar.edu.untref.aydoo;

import java.util.Comparator;

public class ComparadorDePartidos implements Comparator<Partido> {

	@Override
	public int compare(Partido partido1, Partido partido2) {

		int resultado;

		if (partido1.getCantidadTotalDeVotos() == partido2.getCantidadTotalDeVotos()) {

			resultado = partido1.getNombre().compareTo(partido2.getNombre());

		} else if (partido1.getCantidadTotalDeVotos() > partido2.getCantidadTotalDeVotos()) {

			resultado = -1;

		} else {

			resultado = 1;
		}

		return resultado;
	}

}
