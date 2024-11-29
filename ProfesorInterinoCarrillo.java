package DAWDUAL;

import java.util.Calendar;

public class ProfesorInterinoCarrillo extends ProfesorCarrillo {
	
	private Calendar fecha;

	public ProfesorInterinoCarrillo(String dniProfesor, String nombre, String apellidos, int edad, asignaturas modulo,
			float nomina, Calendar fecha) {
		super(dniProfesor, nombre, apellidos, edad, modulo, nomina);
		this.fecha=fecha;
	}
	
	@Override
	public String toString() {
		return "ProfesorInterinoCarrillo " +super.toString()+ " [fechaInicioInterinidad=" + fecha.getTime() + "]";
	}

	public void importeNomina(float sueldoBase, float complementos) {
		super.importeNomina(sueldoBase, complementos, 100f);
		
	}

	


	
	
	
	

}
