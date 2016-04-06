package ar.edu.untref.aydoo;

import java.util.HashSet;
import java.util.Set;

public class Partido {

	private String nombre;
	private Set<Candidato> candidatos;

	public Partido(String nombre) {
		this.nombre = nombre;
		this.candidatos = new HashSet<Candidato>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarCandidato(Candidato unCandidato) {
		this.candidatos.add(unCandidato);
	}

	public Set<Candidato> getCandidatos() {
		return this.candidatos;
	}

	public int getCantidadDeVotosPorCandidato(Candidato unCandidato) {
		int cantidadDeVotos = 0;

		for (Candidato candidatoActual : candidatos) {
			if (candidatoActual.equals(unCandidato)) {
				cantidadDeVotos = candidatoActual.getCantidadDeVotosObtenidos();
			}
		}

		return cantidadDeVotos;
	}

	public int getCantidadTotalDeVotos() {
		int cantidadTotalDeVotos = 0;

		for (Candidato candidatoActual : candidatos) {
			cantidadTotalDeVotos = cantidadTotalDeVotos + candidatoActual.getCantidadDeVotosObtenidos();
		}

		return cantidadTotalDeVotos;
	}

	public void agregarVoto(Voto unVoto) {
		for(Candidato candidatoActual : candidatos){
			if(candidatoActual.equals(unVoto.getCandidato())){
				candidatoActual.agregarVoto(unVoto);
			}
		}
		
	}

}
