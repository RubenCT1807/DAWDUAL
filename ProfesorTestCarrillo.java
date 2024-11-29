package DAWDUAL;

import java.util.Calendar;

public class ProfesorTestCarrillo{

	public static void main(String[] args) {
		Calendar fecha =Calendar.getInstance();
		fecha.set(2023,Calendar.DECEMBER, 1);
		ProfesorInterinoCarrillo profesor1= new ProfesorInterinoCarrillo("45221887-K", "José", "Hernández López", 45, ProfesorCarrillo.asignaturas.BBDD, 0,fecha);
		ProfesorInterinoCarrillo profesor2= new ProfesorInterinoCarrillo("72332634-L", "Andrés", "Moltó Parra", 87,ProfesorCarrillo.asignaturas.ENTORNOS, 0,  fecha);
		ProfesorTitularCarrillo profesor3= new ProfesorTitularCarrillo("73-K", "Juan", "Pérez Pérez", 32 ,ProfesorCarrillo.asignaturas.MARCAS ,0, 5);
		ProfesorTitularCarrillo profesor4= new ProfesorTitularCarrillo("88-L", "Alberto", "Centa Mota", 49 ,ProfesorCarrillo.asignaturas.PROGRAMACION ,0, 10);
		profesor1.importeNomina(1600, 200);
		profesor2.importeNomina(1900, 50);
		profesor3.importeNomina(2200, 100);
		profesor4.importeNomina(2000, 0);
		
		System.out.println("Listado claustro profesores******");
		System.out.println(profesor1.toString());
		System.out.println(profesor2.toString());
		System.out.println(profesor3.toString());
		System.out.println(profesor4.toString());
		

	}

}
