package DAWDUAL;

public class ProfesorTitularCarrillo extends ProfesorCarrillo {

	private int añosAntiguedad;

	public ProfesorTitularCarrillo(String dniProfesor, String nombre, String apellidos, int edad, asignaturas modulo,
			float nomina, int  añosAntiguedad) {
		super(dniProfesor, nombre, apellidos, edad, modulo, nomina);
		// TODO Auto-generated constructor stub
	}

	public void importeNomina(float sueldoBase, float complementos) {
		super.importeNomina(sueldoBase, complementos, 10*añosAntiguedad);
	}

	@Override
	public String toString() {
		return "ProfesorTitular [añosAntiguedad=" + añosAntiguedad + ", toString()= " + super.toString() + "]";
	}
	
	

}
