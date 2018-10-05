package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;




public class PanelTorre extends JPanel {
	
	public JTextField textid;
	public JTextField textFieldID;
	public JTextField textNombre;
	public JTextField textdescripcion;
	public JTextField textNumeroPisos;
	public JTextField textNumeroAptos;
	public JTextField textcantidad;
        public JTextField textinventario;
        public JScrollPane scroll;
        public Object[][] datos;
        public DefaultTableModel modeloTabla;
        public JTable table;
        public Object[][] datosApto;
        public DefaultTableModel modeloTablaApto;
        public JTable tableApto;
        
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTorre() {
		
		setBorder(null);
		setLayout(null);
                JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scrollPane.setBounds(0, 45, 677, 179);
		scrollPane.setBounds(0, 45, 375, 179);
		add(scrollPane);
		
                table = new JTable();
                modeloTabla = new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"idTorre", "Nombre", "PosicionX","PosicionY"
			}
		); 
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setBackground(new Color(255, 255, 0));
		table.setModel(modeloTabla);
		table.getColumnModel().getColumn(0).setPreferredWidth(64);
		table.getColumnModel().getColumn(2).setResizable(false);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPaneApto = new JScrollPane();
		scrollPaneApto.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneApto.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scrollPane.setBounds(0, 45, 677, 179);
		scrollPaneApto.setBounds(380, 45, 402, 179);
		add(scrollPaneApto);
		
                tableApto = new JTable();
                modeloTablaApto = new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"idApto", "Tipo", "Largo","Ancho","m2","Residente"
			}
		); 
		tableApto.setForeground(new Color(0, 0, 0));
		tableApto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tableApto.setBackground(new Color(255, 255, 0));
		tableApto.setModel(modeloTablaApto);
		tableApto.getColumnModel().getColumn(0).setPreferredWidth(64);
		tableApto.getColumnModel().getColumn(2).setResizable(false);
		scrollPaneApto.setViewportView(tableApto);
		
		
		JButton btnBuscar = new JButton("Buscar Torre");
		btnBuscar.setBounds(110, 11, 120, 23);
		add(btnBuscar);
		
		JLabel lbid = new JLabel("Id");
		lbid.setBounds(10, 15, 23, 14);
		add(lbid);
		
		textid = new JTextField();
		textid.setBounds(29, 12, 50, 20);
		add(textid);
		textid.setColumns(10);
		
		JButton btnEliminar = new JButton("Mostrar Aptos");
		btnEliminar.setBounds(655, 11, 120, 23);
		add(btnEliminar);
                
		
		JButton btnagregar = new JButton("Mostrar torres");
		btnagregar.setBounds(240, 11, 130, 23);
		add(btnagregar);
                
                
		
		JPanel panelmodificadorCrear = new JPanel();
		panelmodificadorCrear.setBorder(new TitledBorder(null, "Crear Torre", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(220, 20, 60)));
		panelmodificadorCrear.setBounds(0, 223, 392, 140);
		add(panelmodificadorCrear);
		panelmodificadorCrear.setLayout(null);
		
		JButton crearTorre= new JButton("Crear");
		crearTorre.setBounds(10, 23, 89, 23);
		panelmodificadorCrear.add(crearTorre);
		                         
		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(120, 75, 89, 14);
		panelmodificadorCrear.add(lbNombre);
		
		JLabel lbNumeroApto = new JLabel("No Aptos");
		lbNumeroApto.setBounds(120, 51, 105, 14);
		panelmodificadorCrear.add(lbNumeroApto);
		
		JLabel lbNumeroPisos = new JLabel("No Pisos");
		lbNumeroPisos.setBounds(120, 23, 89, 14);
		panelmodificadorCrear.add(lbNumeroPisos);
		
		textNumeroPisos = new JTextField();
		textNumeroPisos.setColumns(10);
		textNumeroPisos.setBounds(180, 20, 131, 23);
		textNumeroPisos.setEnabled(false);
        panelmodificadorCrear.add(textNumeroPisos);
		
        textNumeroAptos = new JTextField();
        textNumeroAptos.setColumns(10);
        textNumeroAptos.setBounds(180, 48, 131, 20);
        textNumeroAptos.setEnabled(false);
		panelmodificadorCrear.add(textNumeroAptos);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(180, 73, 131, 20);
        textNombre.setEnabled(false);
		panelmodificadorCrear.add(textNombre);
                       
        JButton btnregistrar = new JButton("Registrar Torre");
		btnregistrar.setBounds(180, 100, 131, 23);
		panelmodificadorCrear.add(btnregistrar);
		
		JPanel panelmodificadorModificar = new JPanel();
		panelmodificadorModificar.setBorder(new TitledBorder(null, "Modificar Torre", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(220, 20, 60)));
		panelmodificadorModificar.setBounds(394, 223, 390, 140);
		add(panelmodificadorModificar);
		panelmodificadorModificar.setLayout(null);
       
        
	}

}
