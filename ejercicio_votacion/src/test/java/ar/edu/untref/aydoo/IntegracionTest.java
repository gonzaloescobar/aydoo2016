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

	@Test
	public void partidoConMasVotosPorProvincia() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("FR");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Massa");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		Voto otroVotoMas = new Voto(unCandidato, unaProvincia);
		Voto otroVoto = new Voto(otroCandidato, unaProvincia);

		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVotoMas);
		centroDeComputos.votar(otroVoto);

		Assert.assertEquals(unPartido, centroDeComputos.getPartidoConMasVotosPorProvincia(unaProvincia));
	}

	@Test
	public void partidoConMasVotosPorProvinciaConDosCandidatosDeUnPartido() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("FR");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Massa");
		Candidato otroCandidatoFR = new Candidato("De la Sota");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		Voto otroVotoMas = new Voto(otroCandidatoFR, unaProvincia);
		Voto otroVoto = new Voto(otroCandidato, unaProvincia);

		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		otroPartido.agregarCandidato(otroCandidatoFR);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVotoMas);
		centroDeComputos.votar(otroVoto);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(unVoto);

		Assert.assertEquals(unPartido, centroDeComputos.getPartidoConMasVotosPorProvincia(unaProvincia));
	}

	@Test
	public void partidoConMasVotosPorProvinciaConDosCandidatosDeUnPartidoGanando() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("FR");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Massa");
		Candidato otroCandidatoFR = new Candidato("De la Sota");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		Voto otroVotoMas = new Voto(otroCandidatoFR, unaProvincia);
		Voto otroVoto = new Voto(otroCandidato, unaProvincia);

		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		otroPartido.agregarCandidato(otroCandidatoFR);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVotoMas);
		centroDeComputos.votar(otroVoto);
		centroDeComputos.votar(otroVoto);
		centroDeComputos.votar(otroVotoMas);
		centroDeComputos.votar(otroVoto);

		Assert.assertEquals(otroPartido, centroDeComputos.getPartidoConMasVotosPorProvincia(unaProvincia));
	}

	@Test
	public void candidatoConMasVotosANivelNacional() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		Partido unPartido = new Partido("FPV");
		Partido otroPartido = new Partido("FR");
		Candidato unCandidato = new Candidato("Scioli");
		Candidato otroCandidato = new Candidato("Massa");
		Candidato otroCandidatoFR = new Candidato("De la Sota");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		Voto otroVotoMas = new Voto(otroCandidatoFR, unaProvincia);
		Voto otroVoto = new Voto(otroCandidato, unaProvincia);

		unPartido.agregarCandidato(unCandidato);
		otroPartido.agregarCandidato(otroCandidato);
		otroPartido.agregarCandidato(otroCandidatoFR);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVotoMas);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(unVoto);
		centroDeComputos.votar(otroVoto);

		Assert.assertEquals(unCandidato, centroDeComputos.getCandidatoConMasVotosANivelNacional());
	}

}
