package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class MagazineTest {

	@Test
	public void magazineName() {
		Product magazine = new Magazine("El Grafico", "monthly");

		String name = magazine.getName();

		Assert.assertEquals("El Grafico", name);
	}
	
	@Test
	public void magazinePrice() {
		Product magazine = new Magazine("El Grafico", "monthly");
		
		magazine.setPrice(30);
		double price = magazine.getPrice();

		Assert.assertEquals(30, price, 0.1);
	}
	
	@Test
	public void magazineFrequency() {
		Magazine magazine = new Magazine("El Grafico", "monthly");
	
		String frequency = magazine.getFrequency();

		Assert.assertEquals("monthly", frequency);
	}

}