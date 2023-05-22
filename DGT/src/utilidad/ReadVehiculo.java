package utilidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import datos.Vehiculo;

public class ReadVehiculo {

	private static final String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\Vehiculos.txt";

	public static HashMap<String, Vehiculo> getDatos() {
		HashMap<String, Vehiculo> vehiculos = new HashMap<String, Vehiculo>();
		BufferedReader ficheroEntrada;

		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			String matricula = ficheroEntrada.readLine();

			while (matricula != null) {
				String marca = ficheroEntrada.readLine();
				String modelo = ficheroEntrada.readLine();
				String color = ficheroEntrada.readLine();

				vehiculos.put(matricula, new Vehiculo(matricula, marca, modelo, color));

				matricula = ficheroEntrada.readLine();
			}
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return vehiculos;
	}
}
