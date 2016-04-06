package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {



	@Test
	public void votar() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Provincia otraProvincia = new Provincia("San Luis");
		Partido unPartido = new Partido("FPV");
		Candidato unCandidato = new Candidato("Scioli");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		Voto otroVoto = new Voto(unCandidato, otraProvincia);

		unPartido.agregarCandidato(unCandidato);
		unaProvincia.agregarPartido(unPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		otraProvincia.agregarPartido(unPartido);
		centroDeComputos.agregarProvincia(otraProvincia);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVoto);

		Assert.assertEquals(3, unCandidato.getCantidadDeVotosObtenidos());
	}

	
}
