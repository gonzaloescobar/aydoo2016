package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class BookStoreTest {

	@Test
	public void createEmptyBookStore() {
		BookStore myBookStore = new BookStore("PanamaPapers");

		String name = myBookStore.getName();

		Assert.assertEquals("PanamaPapers", name);
	}
	
	@Test
	public void createBookStoreWithBook() {
		BookStore myBookStore = new BookStore("PanamaPapers");
		Product book = new Book("The Hobbit");
		
		myBookStore.addProducts(book);

		Assert.assertEquals(1, myBookStore.getListOfProducts().size());
	}
	
	@Test
	public void createBookStoreWithMagazine() {
		BookStore myBookStore = new BookStore("PanamaPapers");
		Product magazine = new Magazine("El grafico", Frequency.MONTHLY);
		
		myBookStore.addProducts(magazine);

		Assert.assertEquals(1, myBookStore.getListOfProducts().size());
	}

}
