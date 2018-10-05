package modelo.singleton;


import modelo.factorymethod.ConjuntoResidencialDAO;

public class ConjuntoResidencialSingleton {
	
	private static ConjuntoResidencialSingleton singleton;
	
	private static final int Numero=0;
	
	private int idConjunto;
	private String direccion;
   
    private ConjuntoResidencialSingleton() {
    	ConjuntoResidencialDAO CRDAO = new ConjuntoResidencialDAO();
    	this.idConjunto=CRDAO.listarConjunto().get(Numero).getId();
    	this.direccion=CRDAO.listarConjunto().get(Numero).getDireccion();
    }
    
    private static synchronized void createInstance(){
		if(singleton ==null){
			singleton = new ConjuntoResidencialSingleton();
		}
	}



    public static ConjuntoResidencialSingleton getInstance() {
    	if(singleton == null) {
			createInstance();
		}
		return singleton;
    }
    
    @Override
	public String toString() {
		//return "ConfigurationSingleton{"+"appName=" + appName +", appVersion=" + appVersion +'}';
		return null;		
	}
    
    //Get and Set
	public static ConjuntoResidencialSingleton getSingleton() {
		return singleton;
	}

	public static void setSingleton(ConjuntoResidencialSingleton singleton) {
		ConjuntoResidencialSingleton.singleton = singleton;
	}

	public int getIdConjunto() {
		return idConjunto;
	}

	public void setIdConjunto(int idConjunto) {
		this.idConjunto = idConjunto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static int getNumero() {
		return Numero;
	}
	
	
			
}