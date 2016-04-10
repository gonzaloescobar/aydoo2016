package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ArticleLibraryTest {

	@Test
	public void articleLibraryName() {
		Product article = new ArticleLibrary("pen");

		String name = article.getName();

		Assert.assertEquals("pen", name);
	}
	
	@Test
	public void articleLibraryGetPrice() {
		Product article = new ArticleLibrary("pen");
		
		article.setPrice(5);
		double price = article.getPrice();

		Assert.assertEquals(5, price, 0.01);
	}
	
	@Test
	public void articleLibraryGetPriceWithIVA() {
		ArticleLibrary article = new ArticleLibrary("pen");
		
		article.setPrice(10);
		double price = article.getPriceWithIVA();

		Assert.assertEquals(12.1, price, 0.01);
	}

}
