package ar.edu.untref.aydoo;
public class FactoresPrimos {
	
/**
 * pre: Se debe ingresar un numero que se pueda descomponer.
 * post: Retorna un String con los factores primos.
 */
	public String descomponerFactoresPrimos(int numero) { 
		
		int numeroOriginal = numero;
		String resultado = "";
		
		if(numero == 2){
			resultado = "2 ";
		}
		if(numero % 2 == 0){
			for(int divisor = 2; divisor < numeroOriginal; divisor++){
				while(numero % divisor == 0){
					numero = numero/divisor;
					resultado = resultado + Integer.toString(divisor) + " ";
				}
			}
			
		/*Si no se puede descomponer. Ej: 3, 5, 7...*/	
		}else{
			resultado = Integer.toString(numeroOriginal) + " ";
		}
		
		return "Factores primos " + numeroOriginal + ": " + resultado;
	} 
}
