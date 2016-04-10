package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Customer {

	private String name;
	private String address;
	private List<Buy> buys;

	public Customer(String name) {
		this.setName(name);
		this.buys = new LinkedList<Buy>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Buy> getListOfBuys() {
		return buys;
	}
	
	public void addBuy(Buy buy){
		this.buys.add(buy);
	}

}
