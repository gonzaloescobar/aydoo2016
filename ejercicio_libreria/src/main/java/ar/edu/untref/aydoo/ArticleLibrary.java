package ar.edu.untref.aydoo;

public class ArticleLibrary extends Product {
	
	private double IVA = 1.21;

	public ArticleLibrary(String name) {
		this.setName(name);
	}

	public double getIVA() {
		return IVA;
	}

	public void setIva(double iva) {
		this.IVA = iva;
	}
	
	public double getPriceWithIVA(){
		return this.getPrice()*this.IVA;
	}

}
