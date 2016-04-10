package ar.edu.untref.aydoo;

import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Buy {
	private Month month;
	private double amount;
	private List<Product> listOfProducts = new LinkedList<Product>();

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void addProduct(Product product) {
		this.listOfProducts.add(product);
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}
}
