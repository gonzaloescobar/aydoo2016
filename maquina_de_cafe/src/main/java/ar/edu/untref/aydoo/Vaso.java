package ar.edu.untref.aydoo;

public class Vaso {
	
	private boolean tieneLeche = false;
	private boolean tieneAzucar = false;
	private boolean tieneCafe = false; 
	
	public void recibirContenido(){
		
	}

	public void agregarCafe() {
		this.setTieneCafe(true);
	}
	
	public void agregarLeche(){
		this.setTieneLeche(true);
	}
	
	public void agregarAzucar(){
		this.setTieneAzucar(true);
	}

	public boolean getTieneLeche() {
		return tieneLeche;
	}

	public void setTieneLeche(boolean tieneLeche) {
		this.tieneLeche = tieneLeche;
	}

	public boolean getTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	public boolean getTieneCafe() {
		return tieneCafe;
	}

	public void setTieneCafe(boolean tieneCafe) {
		this.tieneCafe = tieneCafe;
	}
	

}
