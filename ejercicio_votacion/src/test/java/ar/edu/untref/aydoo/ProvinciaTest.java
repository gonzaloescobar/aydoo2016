package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ProvinciaTest {

	@Test
	public void crearProvincia() {
		Provincia unaProvincia = new Provincia("Buenos Aires");

		String nombre = unaProvincia.getNombre();

		Assert.assertEquals("Buenos Aires", nombre);
	}

	@Test
	public void darDeAltaPartidos() {
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");

		unaProvincia.agregarPartido(unPartido);

		Assert.assertEquals(1, unaProvincia.getPartidos().size());
	}

	@Test
	public void cantidadDeVotosPorPartido() {
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");

		unCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);
		unaProvincia.agregarPartido(unPartido);

		Assert.assertEquals(1, unaProvincia.getCantidadDeVotosPorPartido(unPartido));
	}

	@Test
	public void cantidadDeVotosPorPartidoSinVotos() {
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("Frente de Izquierda");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Del Cano");

		unCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);

		Assert.assertEquals(0, unaProvincia.getCantidadDeVotosPorPartido(otroPartido));
	}

	@Test
	public void cantidadDeVotosPorCandidato() {
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");

		unCandidato.agregarVoto();
		unCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);
		unaProvincia.agregarPartido(unPartido);

		Assert.assertEquals(2, unaProvincia.getCantidadDeVotosPorCandidato(unCandidato));
	}
	
	@Test
	public void cantidadDeVotosPorCandidatoConCompetencia() {
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("Frente de Izquierda");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Del Cano");

		unCandidato.agregarVoto();
		unCandidato.agregarVoto();
		otroCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		unaProvincia.agregarPartido(otroPartido);
		unaProvincia.agregarPartido(unPartido);

		Assert.assertEquals(2, unaProvincia.getCantidadDeVotosPorCandidato(unCandidato));
	}

}
