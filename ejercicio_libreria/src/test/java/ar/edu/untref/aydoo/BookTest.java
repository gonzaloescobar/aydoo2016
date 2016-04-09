package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

	@Test
	public void bookName() {
		Book book = new Book("Jobs");

		String name = book.getName();

		Assert.assertEquals("Jobs", name);
	}

}
