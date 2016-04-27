package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class MesTest {

	@Test
	public void ponerNombreAlMes(){
		Mes mayo = new Mes("Mayo");
		Assert.assertEquals("Mayo", mayo.getNombre());
	}
}
