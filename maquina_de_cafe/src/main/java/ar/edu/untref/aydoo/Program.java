package ar.edu.untref.aydoo;

public class Program {

    public static final void main(String args[]){
    	
        int numero = Integer.parseInt(args[0]);
        
    	FactoresPrimos factoresPrimos = new FactoresPrimos();
    	String resultado = factoresPrimos.descomponerFactoresPrimos(numero);
    	System.out.println(resultado);
    }
}