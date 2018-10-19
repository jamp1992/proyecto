package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import modelo.factorymethod.EmpleadoDAO;
import modelo.persona.Empleado;
import modelo.singleton.AdministradorSingleton;
import modelo.singleton.ConjuntoResidencialSingleton;
import vista.PanelEmpleado;

public class ControladorPanelEmpleado implements ActionListener {

	private PanelEmpleado pe;
	private Empleado empleado;
	private AdministradorSingleton admin=AdministradorSingleton.getInstance();
	private ConjuntoResidencialSingleton crs=ConjuntoResidencialSingleton.getInstance();
	public ControladorPanelEmpleado(PanelEmpleado pe) {
		this.pe = pe;
	}
	

	public PanelEmpleado getPe() {
		return pe;
	}
	public void setPe(PanelEmpleado pe) {
		this.pe = pe;
	}
	
	public AdministradorSingleton getAdmin() {
		return admin;
	}


	public void setAdmin(AdministradorSingleton admin) {
		admin = admin;
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
		case "Guardar Aux. Admin":
			//empleado= new Empleado(Integer.parseInt(pe.textCedula.getText()),pe.textNombre.getText(),pe.textApellido.getText(),pe.textUsuario.getText(),pe.textContrasena.getText(),Date.valueOf(pe.textFechaIngreso.getText()));
			String formato=pe.c.getDateFormatString();
			Date date=pe.c.getCalendar().getTime();
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			pe.textCedula.setText(String.valueOf(sdf.format(date)));
			empleado= new Empleado(1024,"John","Martinez","jm","1234",date);
			//admin.gestionarEmpleado().crearAuxiliarAdmin(empleado, crs.getIdConjunto());
			//EmpleadoDAO EDAO= new EmpleadoDAO();
			//EDAO.crearAuxiliarAdmin(empleado, crs.getIdConjunto());
			
			break;
			
		case "Guardar Vigilante":
			break;
			
		case "Guardar Personal Mant.":
			break;
		}
		
	}

}
