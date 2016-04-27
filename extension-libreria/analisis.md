
# Análisis Extensión de Librería

## Observaciones

Clase Cliente:
-	Utiliza un System.out.println como una excepción.

System.out.println("Esa suscripcion ya esta siendo usada");

Clase Program
-	Esta clase no cumple ninguna función.  Se debería retirar del proyecto.

Clase Librería
-	Se recomienda utilizar un for-each para recorrer las colecciones en lugar de un iterador para hacer el código mas prolijo. 

Clases de Pruebas
-	Importa junit.framework.Assert; que se encuentra deprecado.
Se debe importar desde junit.org.util

-	La clase ArticuloDeLibreria se encuentra en el directorio de pruebas.

## Modificaciones:
-	Se realizó un refactor de todos los test cases importando junit.org.util y agregando los deltas en el caso de comparar un tipo de dato double.

---------------------------------------------------------------

## Nueva Funcionalidad: Alquilar libros 
-	Se agrega la clase abstracta Alquiler que es un Producto y recibe como parámetro un producto y un periodo de alquiler.
-	Se agrega la clase AlquilerDiario que hereda de Alquiler.
-	Se agrega la clase AlquilerMensual que hereda de alquiler.
-	Se agrega la clase AlquilerCuatrimestral que hereda de alquiler.



Pruebas
-	Se agregan casos de pruebas a las nuevas clases AlquilerDiario, AlquilerMensual y AlquilerCuatrimestral.
-	Se agregan casos de pruebas a LibreriaTest.

Excepciones
-	Se agrega una Excepción PeriodoDeAlquilerInvalidoException para manejar los casos de Periodos de alquileres inválidos.



