
public class Principal {

	public static void main(String[] args) {
		Empleado miEmpleado = new Empleado("Juan","Perez","499998635W",500);
		System.out.println(miEmpleado);
		miEmpleado.paga(); //Resta 50 euros al salario
		miEmpleado.paga(500); //Abona 500 euros en el salario
		System.out.println(miEmpleado);
	
		
		
	}



}




