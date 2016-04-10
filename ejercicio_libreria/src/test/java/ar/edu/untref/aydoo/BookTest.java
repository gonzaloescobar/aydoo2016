package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

	@Test
	public void bookName() {
		Book book = new Book("The Hobbit");

		String name = book.getName();

		Assert.assertEquals("The Hobbit", name);
	}
	
	@Test
	public void bookPrice() {
		Book book = new Book("The Hobbit");
		
		book.setPrice(50);
		double price = book.getPrice();

		Assert.assertEquals(50, price, 0.01);
	}

}
