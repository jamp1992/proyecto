  package modelo.singleton;
import java.util.*;

import modelo.factorymethod.AdmnistradorDAO;
import modelo.factorymethod.ConjuntoResidencialDAO;
import modelo.otros.PagoAdmin;
import modelo.otros.PagoServicioMantenimeinto;
import modelo.persona.PersonaAcceso;
/**
 * 
 */
public class AdministradorSingleton extends PersonaAcceso{
	
	private static AdministradorSingleton singleton;	
    
	private AdministradorSingleton() {
    	AdmnistradorDAO ADAO = new AdmnistradorDAO();
    	ADAO.ObtenerAdmin(this);
    }
	
	private static synchronized void createInstance(){
		if(singleton ==null){
			singleton = new AdministradorSingleton();
		}
	}



    public static AdministradorSingleton getInstance() {
    	if(singleton == null) {
			createInstance();
		}
		return singleton;
    }

    private void AdministradorSingleton() {
        // TODO implement here
        
    }


    public void gestionarTorre() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void gestionarEmpleado() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void gestionarResidente() {
        // TODO implement here
       
    }

    /**
     * @return
     */
    public List<PagoAdmin> solicitarInformePagoAdmin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<PagoServicioMantenimeinto> solicitarInformeAptos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void solicitarGastosMantenimiento() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public CuentaCorrienteSingleton revisarCuentaCorriente() {
        // TODO implement here
        return null;
    }

}