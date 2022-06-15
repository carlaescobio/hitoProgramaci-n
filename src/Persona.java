
public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return this.nombre + " - " + this.apellido + " - " + this.dni;
	}

	public void trabajar() {
		System.out.println("Esta persona trabaja");
		
	}
	
	
}

