
public class Jefe extends Persona {
	private String cargo ;
	public Jefe(String nombre, String apellido, String dni,String cargo) {
		super(nombre, apellido, dni);
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Jefe" + super.toString() +
				" Cargo " + this.cargo;
	}
	
	
	
	

}



