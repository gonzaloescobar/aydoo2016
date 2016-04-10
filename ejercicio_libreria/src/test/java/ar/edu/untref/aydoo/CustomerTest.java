package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void createCustomer() {
		Customer customer = new Customer("Gonza");

		String name = customer.getName();

		Assert.assertEquals("Gonza", name);
	}

}
