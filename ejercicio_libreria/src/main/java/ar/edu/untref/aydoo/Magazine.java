package ar.edu.untref.aydoo;

public class Magazine extends Product {
	
	private String frequency;

	public Magazine(String name, String frequency) {
		this.setName(name);
		this.setFrequency(frequency);
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

}
