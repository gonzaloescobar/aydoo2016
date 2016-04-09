package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class BookStore {

	private List<Product> listOfProducts;
	private String name;

	public BookStore(String name) {
		this.name = name;
		this.listOfProducts = new LinkedList<Product>();
	}

	public String getName() {
		return name;
	}

	public void addProducts(Product book) {
		this.listOfProducts.add(book);
	}

}
