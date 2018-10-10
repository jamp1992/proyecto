package vista;

import java.util.ArrayList;
import java.util.List;


import modelo.builder.Nivel;
import modelo.builder.Torre;
import modelo.builder.Torre.TorreBuilder;
import modelo.factorymethod.NivelDAO;
import modelo.factorymethod.TorreDAO;
import modelo.prototype.AptoImpl;
import modelo.prototype.AptoPrototype;
import modelo.singleton.AdministradorSingleton;
import modelo.singleton.ConjuntoResidencialSingleton;

public class Main {

	public static void main(String[] args) {
		/*
		ConjuntoResidencialSingleton CRS1= ConjuntoResidencialSingleton.getInstance();
		ConjuntoResidencialSingleton CRS2= ConjuntoResidencialSingleton.getInstance();
		System.out.println(CRS1.getIdConjunto());
		System.out.println(CRS2.getDireccion());
		System.out.println("Misma referencia ==> " + (CRS1 == CRS2));
		AdministradorSingleton AS1= AdministradorSingleton.getInstance();
		AdministradorSingleton AS2= AdministradorSingleton.getInstance();
		System.out.println("Misma referencia ==> " + (AS1 == AS2));
		System.out.println(AS1.cedula);
		System.out.println(AS1.nombre);
		//Prueba creacion de una torre con 4 niveles
		
		Torre torre=new Torre.TorreBuilder().setNombre("Torre5").setPosicionX(1).setPosicionY(3).addNivel(4).build();
		TorreDAO TDAO = new TorreDAO();
		TDAO.saveTorre(torre, CRS1.getIdConjunto());
		
		
		
		List<Torre> torreList=TDAO.finAllTorres();
		
		
		System.out.println(torreList.get(torreList.size()-1).getIdTorre());
		NivelDAO NDAO = new NivelDAO();
		for(int i=0;i<torre.getNivel().size(); i++) {
			NDAO.saveNivel(torre.getNivel().get(i) , torreList.get(torreList.size()-1).getIdTorre());
		}
		System.out.println(torre.getNivel().size());
		*/
		
		//creacion Aptos prototipos
		AptoImpl apto =new AptoImpl("Apto1",101,12,13,50,20000,null);
		AptoPrototype.addPrototype(apto.getNombreApto(), apto);
		System.out.println(apto);
		
		AptoImpl apto2 = (AptoImpl)AptoPrototype.getPrototype("Apto1");
		apto2.setNombreApto("apto2");
		apto2.setLargo(13);
		apto2.setAncho(13);
		apto2.setM2(60);
		apto2.setValor((double) 30000);
		apto2.setResidente(null);
		apto2.setNumeroApto(102);
		AptoPrototype.addPrototype(apto2.getNombreApto(), apto2);
		System.out.println(apto2);
		System.out.println(apto);
		
	}

}
