package DAWDUAL;

public class ProfesorCarrillo {
	
	public enum asignaturas{BBDD, MARCAS, PROGRAMACION, ENTORNOS, INTERFACES}
	private String dniProfesor;
	private String nombre;
	private String apellidos;
	private int edad;
	protected float nomina;
	private float complementos;
	private float deducciones;
	private float sueldoBase;
	private asignaturas modulo;
	/**
	 * @param dniProfesor
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param nomina
	 * @param modulo
	 */
	public ProfesorCarrillo(String dniProfesor, String nombre, String apellidos, int edad, asignaturas modulo, float nomina) {
		super();
		this.dniProfesor = dniProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nomina = nomina;
		this.modulo = modulo;
	}
	@Override
	public String toString() {
		return "[dniProfesor=" + dniProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", modulo=" + modulo + ", nomina=" + nomina +"]";
	}
	
	public float importeNomina(float sueldoBase, float complementos, float deducciones){
		return nomina=sueldoBase+complementos-deducciones;
		
		
	}
	
	public boolean equals (Object otro) {
		ProfesorCarrillo profesor= (ProfesorCarrillo) otro;
		boolean iguales;
		if(this.importeNomina(sueldoBase, complementos, deducciones)==profesor.importeNomina(sueldoBase, complementos, deducciones)) {
			iguales=true;
		}else {
			iguales=false;
		}
		return iguales;
	}
	
	
	
	

}