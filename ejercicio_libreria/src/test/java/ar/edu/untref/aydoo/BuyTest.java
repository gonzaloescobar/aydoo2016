package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class BuyTest {

	@Test
	public void test() {
		Buy buy = new Buy();
		Product book = new Book("The Hobbit");
		
		buy.addProduct(book);
		
		Assert.assertEquals(true, buy.getListOfProducts().contains(book));
	}

}
