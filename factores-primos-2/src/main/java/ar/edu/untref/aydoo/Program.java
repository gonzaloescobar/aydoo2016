package ar.edu.untref.aydoo;

public class Program {

    public static final void main(String args[]){
    	
        int numero = Integer.parseInt(args[0]);
        String formato = "pretty";
        if(args.length == 2){        	
        	formato = args[1].substring(9);
        }
        
    	FactoresPrimos factoresPrimos = new FactoresPrimos();
    	String resultado = factoresPrimos.descomponerFactoresPrimos(numero);
    	
    	
    	switch(formato.toLowerCase()){
    		case "pretty":
    			imprimirPretty(resultado, numero);
    			break;
    		case "quiet":
    			imprimirQuiet(resultado);
    			break;
    		default:
    			System.out.println("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
    			break;
    	}
    }
    
    
    
    private static void imprimirPretty(String resultado, int numero){
    	System.out.println("Factores primos " + numero + ": " + resultado);
    }
    
    private static void imprimirQuiet(String resultado){
    	resultado = invertir(resultado);
    	System.out.println(resultado.replace(" ", "\n"));
    }

    private static String invertir(String palabra){
		String resultado = "";
		
		for(int i = palabra.length()-2; i >= 0; i--){
			resultado = resultado + palabra.substring(i,i+1);
		}	
		return resultado;
	}
}