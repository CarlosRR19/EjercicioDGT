package go;

import utilidad.ReadData;
import utilidad.ReadPropietario;
import utilidad.ReadVehiculo;
import utilidad.RelacionarDatos;
import utilidad.Write;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReadPropietario.getDatos());
		System.out.println(ReadVehiculo.getDatos());
		System.out.println(RelacionarDatos.relacionar(ReadData.getDatos()));
		
		Write.save();
	}

}
