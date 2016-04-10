package ar.edu.untref.aydoo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Buy {
	private Date date;
	private double amount;
	private List<Product> listOfProducts = new LinkedList<Product>();

	public Date getData() {
		return date;
	}

	public void setData(Date date) {
		this.date = date;
	}

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
}
