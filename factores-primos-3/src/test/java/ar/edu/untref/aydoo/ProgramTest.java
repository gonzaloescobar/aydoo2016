package ar.edu.untref.aydoo;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

	@Test
	public void pruebaFactoresPrimoDe90FormatoDefault() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90" };
		Program.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos360FormatoDefault() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "360" };
		Program.main(argumento);

		Assert.assertEquals("Factores primos 360: 2 2 2 3 3 5 ", outContent.toString().substring(0, 33));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPretty() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=pretty" };
		Program.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPrettyMayuscula() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=PRETTY" };
		Program.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPrettyMayusculaYMinuscula() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=pREtTy" };
		Program.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietEnMinuscula() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=quiet" };
		Program.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietEnMayuscula() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=QUIET" };
		Program.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietMayusculayMinuscula() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=quIEt" };
		Program.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoInvalido() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=yerba" };
		Program.main(argumento);

		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.",
				outContent.toString().substring(0, 63));
	}

	@Test
	public void pruebaFactoresPrimosFormatoPrettyImpresoEnArchivo() throws IOException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--format=pretty", "--output-file=salida.txt" };
		Program.main(argumento);

		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado + cadena;
		}
		bufferedReader.close();

		 Assert.assertEquals("Factores primos 90: 2 3 3 5 ", resultado);
	}
	
	@Test
	public void pruebaFactoresPrimos90FormatoPrettyMayusculaImpresoEnArchivo() throws IOException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=PRETTY", "--output-file=salida.txt"};
		Program.main(argumento);
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado + cadena;
		}
		bufferedReader.close();

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", resultado);
	}
	
	@Test
	public void pruebaFactoresPrimos90FormatoQuietImpresoEnArchivo() throws IOException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--format=quiet", "--output-file=salida.txt"};
		Program.main(argumento);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado  + cadena + "\n";
		}
		bufferedReader.close();

		Assert.assertEquals("5\n3\n3\n2\n", resultado);
	}
	
	@Test
	public void pruebaFactoresPrimosImpresoEnArchivoConParametrosEnOrdenInverso() throws IOException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--output-file=salida.txt", "--format=quiet"};
		Program.main(argumento);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado  + cadena + "\n";
		}
		bufferedReader.close();

		Assert.assertEquals("5\n3\n3\n2\n", resultado);
	}

}
