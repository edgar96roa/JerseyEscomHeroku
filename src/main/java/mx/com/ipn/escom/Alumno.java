package mx.com.ipn.escom;

public class Alumno {

	private int numeroBoleta;
	private String nombre;
	private String apellidos;
	private String carrera;
	private String correo;

	public Alumno() {
		
	}
	
	public Alumno(int numeroBoleta, String nombre, String apellidos, String carrera, String correo) {
		this.numeroBoleta = numeroBoleta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.correo = correo;
	}

	public int getNumeroBoleta() {
		return numeroBoleta;
	}

	public void setNumeroBoleta(int numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
}
