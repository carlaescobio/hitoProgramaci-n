
public class Empleado extends Persona {
	private float sueldo;
	public Empleado(String nombre, String apellido, String dni, float sueldo) {
		super(nombre, apellido, dni);
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado: " + super.toString()  
				+ ", " + "Sueldo: " + this.sueldo + "€" ;
	}
	
	public void paga(int cuanto) {
		this.sueldo = this.sueldo + cuanto;
		}
		public void paga() {
		this.sueldo = this.sueldo - 50;
		}
		
		
		@Override
		public void trabajar() {
			System.out.println("El empleado trabaja");
		}
		
		
	

}
