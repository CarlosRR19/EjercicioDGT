package datos;

public class Propietario {

	private String dni;
	private String nombreApellido;
	private String fechaNacimiento;

	public Propietario(String dni, String nombreApellido, String fechaNacimiento) {
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String toString() {
		return "DNI: " + dni;
	}
}
