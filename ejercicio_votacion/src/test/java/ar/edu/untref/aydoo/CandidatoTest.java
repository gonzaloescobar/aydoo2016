package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CandidatoTest {

	@Test
	public void crearCandidato() {
		Candidato primerCandidato = new Candidato("Scioli");

		String nombre = primerCandidato.getNombre();

		Assert.assertEquals("Scioli", nombre);
	}

	@Test
	public void recibirVotos() {
		Candidato scioli = new Candidato("Scioli");
		Provincia buenosAires = new Provincia("Buenos Aires");
		Voto unVoto = new Voto(scioli, buenosAires);

		scioli.agregarVoto(unVoto);
		scioli.agregarVoto(unVoto);

		Assert.assertEquals(2, scioli.getCantidadDeVotosObtenidos());
	}

	@Test
	public void candidatoSinVotos() {
		Candidato primerCandidato = new Candidato("Scioli");

		Assert.assertEquals(0, primerCandidato.getCantidadDeVotosObtenidos());
	}

}
