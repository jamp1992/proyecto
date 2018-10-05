package vista;

import modelo.singleton.AdministradorSingleton;
import modelo.singleton.ConjuntoResidencialSingleton;

public class Main {

	public static void main(String[] args) {
		/*ConjuntoResidencialSingleton CRS1= ConjuntoResidencialSingleton.getInstance();
		ConjuntoResidencialSingleton CRS2= ConjuntoResidencialSingleton.getInstance();
		System.out.println(CRS1.getIdConjunto());
		System.out.println(CRS2.getDireccion());
		System.out.println("Misma referencia ==> " + (CRS1 == CRS2));*/
		AdministradorSingleton AS1= AdministradorSingleton.getInstance();
		AdministradorSingleton AS2= AdministradorSingleton.getInstance();
		System.out.println("Misma referencia ==> " + (AS1 == AS2));
		System.out.println(AS1.cedula);
		System.out.println(AS1.nombre);
	}

}
