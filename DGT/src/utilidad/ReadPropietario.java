package utilidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import datos.Propietario;

public class ReadPropietario {

	private static final String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\Propietarios.txt";

	public static HashMap<String, Propietario> getDatos() {
		HashMap<String, Propietario> propietarios = new HashMap<String, Propietario>();
		BufferedReader ficheroEntrada;

		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			String dni = ficheroEntrada.readLine();

			while (dni != null) {
				String nombreApellidos = ficheroEntrada.readLine();
				String fechaNacimiento = ficheroEntrada.readLine();

				propietarios.put(dni, new Propietario(dni, nombreApellidos, fechaNacimiento));

				dni = ficheroEntrada.readLine();
			}
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return propietarios;
	}
}
