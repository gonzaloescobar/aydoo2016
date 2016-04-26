package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class PeriodoDeAlquilerInvalidoException extends RuntimeException{
	
	public PeriodoDeAlquilerInvalidoException(String mensaje){
		super(mensaje);
	}

}
