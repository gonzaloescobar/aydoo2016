package ar.edu.untref.aydoo;

import java.time.Month;

import org.junit.Assert;
import org.junit.Test;

public class BuyTest {

	@Test
	public void testAddProduct() {
		Buy buy = new Buy();
		Product book = new Book("The Hobbit");

		buy.addProduct(book);

		Assert.assertEquals(true, buy.getListOfProducts().contains(book));
	}

	@Test
	public void getDateBuy() {
		Buy buy = new Buy();
		Product book = new Book("The Hobbit");
		Month month = Month.JANUARY;

		buy.setMonth(month);
		buy.addProduct(book);

		Assert.assertEquals(Month.JANUARY, buy.getMonth());
	}
	
	@Test
	public void testAmountOfProducts() {
		Buy buy = new Buy();
		Product book = new Book("The Hobbit");

		
		buy.addProduct(book);
		buy.setAmount(2);

		Assert.assertEquals(2, buy.getAmount(), 0.01);
	}

}
