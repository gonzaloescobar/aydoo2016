package ar.edu.untref.aydoo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CentroDeComputos {

	private Set<Provincia> provincias;

	public CentroDeComputos() {
		this.provincias = new HashSet<Provincia>();
	}

	public void agregarProvincia(Provincia unaProvincia) {
		provincias.add(unaProvincia);

	}

	public void votar(Voto unVoto) {

		for (Provincia provinciaActual : provincias) {
			if (unVoto.getProvincia().equals(provinciaActual)) {
				provinciaActual.agregarVoto(unVoto);
			}
		}

	}

	public Candidato getCandidatoConMasVotosANivelNacional() {
		HashMap<Candidato, Integer> resultadoNacional = new HashMap<Candidato, Integer>();
		Set<Partido> partidos = new HashSet<Partido>();
		Set<Candidato> candidatos = new HashSet<Candidato>();
		Candidato candidatoGanador = null;

		for (Provincia provinciaActual : provincias) {
			resultadoNacional = provinciaActual.getCandidatosYSusVotos();
		}
		for (Entry<Candidato, Integer> votacion : resultadoNacional.entrySet()) {
			candidatoGanador = votacion.getKey();
			int valor = votacion.getValue();
		}
		return candidatoGanador;
	}

	public Partido getPartidoConMasVotosPorProvincia(Provincia unaProvincia) {
		Comparator<Partido> comparador = new ComparadorDePartidos();
		SortedSet<Partido> partidos = new TreeSet<Partido>(comparador);

		for (Provincia provinciaActual : provincias) {
			if (unaProvincia.equals(provinciaActual)) {
				partidos.addAll(provinciaActual.getPartidos());
			}
		}
		return partidos.first();
	}

}
