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
	public void createBookStore() {
		BookStore myBookStore = new BookStore("PanamaPapers");
		Product book = new Book("Jobs");
		
		myBookStore.addProducts(book);

		Assert.assertEquals(1, myBookStore.getListOfProducts().size());
	}

}
