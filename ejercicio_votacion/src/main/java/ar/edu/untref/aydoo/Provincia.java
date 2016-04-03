package ar.edu.untref.aydoo;

import java.util.HashSet;
import java.util.Set;

public class Provincia {

	private String nombre;
	private Set<Partido> partidos;

	public Provincia(String nombre) {
		this.nombre = nombre;
		this.partidos = new HashSet<Partido>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarPartido(Partido unPartido) {
		this.partidos.add(unPartido);
	}

	public Set<Partido> getPartidos() {
		return this.partidos;
	}

	public int getCantidadDeVotosPorPartido(Partido unPartido) {
		int cantidadDeVotos = 0;

		for (Partido partidoActual : partidos) {
			if (unPartido.equals(partidoActual)) {
				cantidadDeVotos = cantidadDeVotos + partidoActual.getCantidadTotalDeVotos();
			}
		}

		return cantidadDeVotos;
	}

	public int getCantidadDeVotosPorCandidato(Candidato unCandidato) {
		int cantidadDeVotos = 0;

		for (Partido partidoActual : partidos) {
			if (partidoActual.getCandidatos().contains(unCandidato)) {
				cantidadDeVotos = cantidadDeVotos + partidoActual.getCantidadDeVotosPorCandidato(unCandidato);
			}
		}

		return cantidadDeVotos;
	}

}
