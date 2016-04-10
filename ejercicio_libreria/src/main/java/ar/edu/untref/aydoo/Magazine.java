package ar.edu.untref.aydoo;

public class Magazine extends Product {
	
	private Frequency frequency;

	public Magazine(String name, Frequency frequency) {
		this.setName(name);
		this.setFrequency(frequency);
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

}
