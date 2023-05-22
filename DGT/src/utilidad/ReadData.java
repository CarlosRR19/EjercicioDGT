package utilidad;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadData {

	private static final String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\Datos.txt";

	public static HashMap<String, String> getDatos() {
		HashMap<String, String> datos = new HashMap<String, String>();
		BufferedReader ficheroEntrada;

		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			String dni = ficheroEntrada.readLine();

			while (dni != null) {
				String matricula = ficheroEntrada.readLine();

				datos.put(dni, matricula);

				dni = ficheroEntrada.readLine();
			}
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return datos;
	}
}
