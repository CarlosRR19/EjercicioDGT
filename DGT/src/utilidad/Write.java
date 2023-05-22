package utilidad;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import datos.Propietario;
import datos.Vehiculo;

public class Write {

	public static void save() {

		HashMap<Propietario, ArrayList<Vehiculo>> datos = RelacionarDatos.relacionar(ReadData.getDatos());
		Iterator<Propietario> it = datos.keySet().iterator();

		try {
			FileWriter file = new FileWriter("C:\\Users\\rrcar\\Desktop\\Datos\\ResultadoDGT.txt");

			while (it.hasNext()) {
				Propietario clave = (Propietario) it.next();
				ArrayList<Vehiculo> valor = datos.get(clave);

				// file.write(clave.toString() + " " + valor.toString() + "\n");
				file.write(clave.getDni() + "\n" + clave.getNombreApellido() + "\n" + clave.getFechaNacimiento() + "\n"
						+ valor.toString() + "\n");
			}

			file.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
