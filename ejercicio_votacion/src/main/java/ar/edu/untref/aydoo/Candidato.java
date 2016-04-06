package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Candidato {
	private String nombre;
	private List<Voto> votos;

	public Candidato(String nombre) {
		this.nombre = nombre;
		this.votos = new LinkedList<Voto>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarVoto(Voto unVoto) {
		votos.add(unVoto);
	}

	public int getCantidadDeVotosObtenidos() {
		return votos.size();
	}

}
