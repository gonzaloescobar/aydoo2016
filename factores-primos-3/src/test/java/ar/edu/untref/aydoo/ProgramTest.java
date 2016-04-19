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
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90" };
		programa.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos360FormatoDefault() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "360" };
		programa.main(argumento);

		Assert.assertEquals("Factores primos 360: 2 2 2 3 3 5 ", outContent.toString().substring(0, 33));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPretty() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=pretty" };
		programa.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPrettyMayuscula() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=PRETTY" };
		programa.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoPrettyMayusculaYMinuscula() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=pREtTy" };
		programa.main(argumento);

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", outContent.toString().substring(0, 28));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietEnMinuscula() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=quiet" };
		programa.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietEnMayuscula() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=QUIET" };
		programa.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoQuietMayusculayMinuscula() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=quIEt" };
		programa.main(argumento);

		Assert.assertEquals("5\n3\n3\n2", outContent.toString().substring(0, 7));
	}

	@Test
	public void pruebaFactoresPrimos90FormatoInvalido() {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=yerba" };
		programa.main(argumento);

		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.",
				outContent.toString().substring(0, 63));
	}

	@Test
	public void pruebaFactoresPrimosFormatoPrettyImpresoEnArchivo() throws IOException {
		Program programa = new Program();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		String[] argumento = { "90", "--format=pretty", "--output-file=salida.txt" };
		programa.main(argumento);

		String cadena = "";
		String resultado = "";
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado + cadena;
		}
		bufferedReader.close();

		 Assert.assertEquals("Factores primos 90: 2 3 3 5 ", resultado);
	}

}
