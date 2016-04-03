package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {

	@Test
	public void crearPartido() {
		Partido unPartido = new Partido("FPV");

		String nombre = unPartido.getNombre();

		Assert.assertEquals("FPV", nombre);
	}

	@Test
	public void agregarCandidato() {
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");

		unPartido.agregarCandidato(unCandidato);

		Assert.assertEquals(true, unPartido.getCandidatos().contains(unCandidato));
	}

	@Test
	public void agregarDosCandidatosDelMismoPartido() {
		Partido unPartido = new Partido("Cambiemos");
		Candidato unCandidato = new Candidato("Macri");
		Candidato segundoCandidato = new Candidato("Carrio");

		unPartido.agregarCandidato(unCandidato);
		unPartido.agregarCandidato(segundoCandidato);

		Assert.assertEquals(2, unPartido.getCandidatos().size());
	}

	@Test
	public void cantidadDeVotosDeUnCandidato() {
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");

		unCandidato.agregarVoto();
		unCandidato.agregarVoto();
		unCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);

		Assert.assertEquals(3, unPartido.getCantidadDeVotosPorCandidato(unCandidato));
	}

	@Test
	public void cantidadDeVotosDeUnCandidatoSinVotos() {
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");

		unPartido.agregarCandidato(unCandidato);

		Assert.assertEquals(0, unPartido.getCantidadDeVotosPorCandidato(unCandidato));
	}

	@Test
	public void cantidadDeVotosSinCandidato() {
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Macri");

		unPartido.agregarCandidato(unCandidato);

		Assert.assertEquals(0, unPartido.getCantidadDeVotosPorCandidato(otroCandidato));
	}

	@Test
	public void cantidadDeVotosTotalDelPartido() {
		Partido unPartido = new Partido("Cambiemos");
		Candidato unCandidato = new Candidato("Macri");
		Candidato otroCandidato = new Candidato("Carrio");

		unCandidato.agregarVoto();
		unCandidato.agregarVoto();
		otroCandidato.agregarVoto();
		unPartido.agregarCandidato(unCandidato);
		unPartido.agregarCandidato(otroCandidato);

		Assert.assertEquals(3, unPartido.getCantidadTotalDeVotos());
	}
}
