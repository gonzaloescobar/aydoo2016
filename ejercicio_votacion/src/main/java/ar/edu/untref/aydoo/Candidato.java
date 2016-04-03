package ar.edu.untref.aydoo;

public class Candidato {
	private String nombre;
	private int cantidadDeVotosObtenidos = 0;

	public Candidato(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void agregarVoto(){
		this.cantidadDeVotosObtenidos++;
	}
	
	public int getCantidadDeVotosObtenidos(){
		return this.cantidadDeVotosObtenidos;
	}

}
