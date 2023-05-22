package utilidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import datos.Propietario;
import datos.Vehiculo;

public class RelacionarDatos {

	public static HashMap<Propietario, ArrayList<Vehiculo>> relacionar(HashMap<String, String> datos) {
		HashMap<String, Propietario> propietarios = ReadPropietario.getDatos();
		HashMap<String, Vehiculo> vehiculos = ReadVehiculo.getDatos();
		HashMap<Propietario, ArrayList<Vehiculo>> datosRelacionados = new HashMap<Propietario, ArrayList<Vehiculo>>();

		for (Map.Entry<String, String> set : datos.entrySet()) {

			ArrayList<Vehiculo> coches = new ArrayList<Vehiculo>();

			Propietario propietario1 = propietarios.get(set.getValue());
			if (datosRelacionados.containsKey(propietario1)) {

				coches = datosRelacionados.getOrDefault(propietario1, coches);
				coches.add(vehiculos.get(set.getKey()));
				datosRelacionados.put(propietario1, coches);

			} else {
				coches.add(vehiculos.get(set.getKey()));
				datosRelacionados.put(propietarios.get(set.getValue()), coches);
			}
		}
		return datosRelacionados;
	}

	/*
	 * 
	 * if (set.getValue().equalsIgnoreCase(key)) {
	 * coches.add(vehiculos.get(set.getKey()));
	 * datosRelacionados.put(propietarios.get(set.getValue()), coches); } else {
	 * coches = new ArrayList(); ; coches.add(vehiculos.get(set.getKey()));
	 * datosRelacionados.put(propietarios.get(set.getValue()), coches); }
	 * 
	 * key = set.getValue();
	 * 
	 */

}
