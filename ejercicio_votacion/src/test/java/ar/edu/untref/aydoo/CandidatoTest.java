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
		Candidato primerCandidato = new Candidato("Scioli");
		
		primerCandidato.agregarVoto();
		primerCandidato.agregarVoto();
		
		Assert.assertEquals(2, primerCandidato.getCantidadDeVotosObtenidos());
	}
	
	
	@Test
	public void candidatoSinVotos() {
		Candidato primerCandidato = new Candidato("Scioli");
		
		Assert.assertEquals(0, primerCandidato.getCantidadDeVotosObtenidos());
	}

}
