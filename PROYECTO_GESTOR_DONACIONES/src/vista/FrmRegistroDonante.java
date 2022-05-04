package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;

import mantenimientos.GestionDonante;
import mantenimientos.GestionUsuario;
import model.Donante;
import model.Usuario;

import javax.swing.SwingConstants;



public class FrmRegistroDonante extends JInternalFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField txtNombreRep;
	private JTextField txtApellRep;
	private JComboBox cboTipoDonate;
	private JButton btnConsultar;
	private JButton btnRegistrar;
	private JButton btnAlatabla;
	private JButton btnCerrar;
	private JLabel lblRazonSocial;
	private JTextField txtRazonSocialDonanF;
	private JLabel lblFechaRegistro;
	private JDateChooser txtFechaRegistro;
	private JLabel lblCodigo;
	private JLabel lblNombreRepresentante;
	private JTextField txtCargoRep;
	private JLabel lblCargo;
	private JTextField txtTelefonoDonanF;
	private JTextField txtDireccionDonan;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	//
	private JTable table;
	
	
	
	
	/***************************C*********************************/
	private JScrollPane scrollPaneListaDonante;
	//private JTable MiTablaPaListar;
	private JTable MiTablaPaListar;
	//Objetos para cargar el JTable
	DefaultTableModel Tabla;
	//DefaultComboBoxModel<Integer> Combo;//----------------------------------------------1
	String Columnas[]={"RAZ_SOCIAL","NOMBRE R.","APELLIDOS R.","CARGO R.","FECHA REGISTRO" ,"DIRECCION", "TELEFONO"};//,"PRECIO","STOCK","CATEGORÍA"};//----------2
	Object Filas[][];//-----------------------------------------------------------------3
	int    fila;//----------------------------------------------------------------------4
	private JButton btnListarDonantes;
	private JTextField txtCodigoF;
	private JTextArea txtConsultaCodigo;
	private JTextArea txtS;
	private JButton btnLimpiar;

	// METODO DE CARGA del JTable
	public void CargarTabla(){
			List<Donante> lstDonante =(new GestionDonante()).listado(); 
			// Inicializar el objeto Tabla
			Tabla = new DefaultTableModel();
			// Cargar los nonbres de las columnas
			for(String x:Columnas)Tabla.addColumn(x);
			// Cargar las filas
			Filas = new Object[lstDonante.size()][7];
			for(int i = 0; i < lstDonante.size(); i++){
				Filas[i][0] = lstDonante.get(i).getRazonSocial();
			    Filas[i][1] = lstDonante.get(i).getNomRepresenante();
			    Filas[i][2] = lstDonante.get(i).getApeRepresenante();
			    Filas[i][3] = lstDonante.get(i).getCargoRepresenante();
			    Filas[i][4] = lstDonante.get(i).getFechaRegistro();
			    Filas[i][5] = lstDonante.get(i).getDireccion();
			    Filas[i][6] = lstDonante.get(i).getTelefono();
			    
			    /*
			     	d.setRazonSocial(razonSocialF);
			        d.setNomRepresenante(nomRepresenanteF);
			        d.setApeRepresenante(apeRepresenanteF);
			        d.setCargoRepresenante(cargoRepresenanteF);
			        d.setFechaRegistro(fechaRegistroF);
			        d.setDireccion(direccionF);
			        d.setDireccion(direccionF);
			     **/
			    
			  /*Filas[i][2] = lstProducto.get(i).getPrecio();
				Filas[i][3] = lstProducto.get(i).getStock();
				Filas[i][4] = lstProducto.get(i).getCategoria();*/
				
				Tabla.addRow(Filas[i]);
			}
			// Asignar Tabla al control JTable
			MiTablaPaListar.setModel(Tabla);	
		}
	/*************************************************************************/
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistroDonante frame = new FrmRegistroDonante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the frame.
	 */
	public FrmRegistroDonante() {
		setFrameIcon(new ImageIcon(FrmRegistroDonante.class.getResource("/img/Designer.png")));
		
		setTitle("Mantenimiento || Registro Donante");
		setBounds(180, 50, 770, 515);
		getContentPane().setLayout(null);
		
		JLabel lblCodigoAutoGenerado = new JLabel("Consultar Codigo -->");
		lblCodigoAutoGenerado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoAutoGenerado.setBounds(22, 61, 141, 21);
		getContentPane().add(lblCodigoAutoGenerado);
		
		txtNombreRep = new JTextField();
		txtNombreRep.setText("");
		txtNombreRep.setColumns(10);
		txtNombreRep.setBounds(179, 118, 127, 28);
		getContentPane().add(txtNombreRep);
		
		JLabel lblNombre = new JLabel("Apellido Representante:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(22, 149, 147, 18);
		getContentPane().add(lblNombre);
		
		txtApellRep = new JTextField();
		txtApellRep.setText("");
		txtApellRep.setColumns(10);
		txtApellRep.setBounds(179, 148, 127, 28);
		getContentPane().add(txtApellRep);
		
		JLabel lblTipoDonante = new JLabel("Tipo de Donante:");
		lblTipoDonante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDonante.setBounds(316, 84, 119, 14);
		getContentPane().add(lblTipoDonante);
		
		cboTipoDonate = new JComboBox();
		cboTipoDonate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTipoDonate.setBounds(448, 78, 129, 28);
		cboTipoDonate.setModel(new DefaultComboBoxModel(new String[] {"Particular", "Empresa"}));
		getContentPane().add(cboTipoDonate);
		
		btnRegistrar = new JButton("Registrar");	
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setIcon(null);
	
		btnRegistrar.setBounds(593, 81, 145, 37);
		getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnActualizar.setIcon(null);
		btnActualizar.setBounds(593, 123, 145, 37);
		getContentPane().add(btnActualizar);
		
		JLabel lblMantenimientoDonante = new JLabel("Registro de Donante");
		lblMantenimientoDonante.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblMantenimientoDonante.setBounds(266, 11, 249, 34);
		getContentPane().add(lblMantenimientoDonante);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(593, 164, 145, 37);
		getContentPane().add(btnConsultar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrar.setBounds(593, 39, 144, 37);
		getContentPane().add(btnCerrar);
		
		lblRazonSocial = new JLabel("Razon Social:");
		lblRazonSocial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRazonSocial.setBounds(22, 91, 119, 14);
		getContentPane().add(lblRazonSocial);
		
		txtRazonSocialDonanF = new JTextField();
		txtRazonSocialDonanF.setText("");
		txtRazonSocialDonanF.setColumns(10);
		txtRazonSocialDonanF.setBounds(179, 88, 127, 28);
		getContentPane().add(txtRazonSocialDonanF);
		
		lblFechaRegistro = new JLabel("Fecha de Registro:");
		lblFechaRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaRegistro.setBounds(316, 121, 135, 14);
		getContentPane().add(lblFechaRegistro);
		
		txtFechaRegistro = new JDateChooser();
		txtFechaRegistro.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFechaRegistro.setDateFormatString("dd-MM-yyyy");
		txtFechaRegistro.setBounds(448, 116, 129, 28);
		getContentPane().add(txtFechaRegistro);
		
		lblCodigo = new JLabel("CODIGO");
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setForeground(new Color(25, 25, 112));
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCodigo.setBounds(28, 30, 106, 27);
		getContentPane().add(lblCodigo);
		
		lblNombreRepresentante = new JLabel("Nombre Representante:");
		lblNombreRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreRepresentante.setBounds(22, 119, 147, 14);
		getContentPane().add(lblNombreRepresentante);
		
		txtCargoRep = new JTextField();
		txtCargoRep.setText("");
		txtCargoRep.setColumns(10);
		txtCargoRep.setBounds(179, 178, 127, 28);
		getContentPane().add(txtCargoRep);
		
		lblCargo = new JLabel("Cargo Representante :");
		lblCargo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargo.setBounds(22, 178, 147, 19);
		getContentPane().add(lblCargo);
		
		txtTelefonoDonanF = new JTextField();
		txtTelefonoDonanF.setText("");
		txtTelefonoDonanF.setColumns(10);
		txtTelefonoDonanF.setBounds(448, 178, 129, 28);
		getContentPane().add(txtTelefonoDonanF);
		
		txtDireccionDonan = new JTextField();
		txtDireccionDonan.setText("");
		txtDireccionDonan.setColumns(10);
		txtDireccionDonan.setBounds(448, 147, 129, 28);
		getContentPane().add(txtDireccionDonan);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(316, 183, 135, 14);
		getContentPane().add(lblTelefono);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccion.setBounds(316, 152, 135, 14);
		getContentPane().add(lblDireccion);
		
		scrollPaneListaDonante = new JScrollPane();
		scrollPaneListaDonante.setBounds(22, 214, 715, 214);
		//getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPaneListaDonante.setViewportView(table);
		
		/***************************TABLA EN LA GUI*********************************/
		//DISEÑO DE LA TABLA DENTRO DE UN SCROLL PANE

				getContentPane().add(scrollPaneListaDonante);
				MiTablaPaListar = new JTable();
				MiTablaPaListar.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					}
				));
				scrollPaneListaDonante.setViewportView(MiTablaPaListar);
				
				btnListarDonantes = new JButton("Listar Donantes Registrados");
				btnListarDonantes.addActionListener(this);
				btnListarDonantes.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnListarDonantes.setBounds(105, 439, 257, 36);
				getContentPane().add(btnListarDonantes);
				
				txtCodigoF = new JTextField();
				txtCodigoF.setForeground(new Color(0, 0, 128));
				txtCodigoF.setBackground(new Color(211, 211, 211));
				txtCodigoF.setBounds(179, 59, 127, 28);
				getContentPane().add(txtCodigoF);
				txtCodigoF.setColumns(10);
				
				txtS = new JTextArea();
				txtS.setBounds(22, 218, 716, 205);
				getContentPane().add(txtS);
				//TEXT AREA TRANSPARENTE
				//txtS = new JTextArea();
				//txtConsultaCodigo= new JTextArea();
				txtS.setFont(new Font("Consolas", Font.PLAIN, 17));
				//txtConsultaCodigo.setOpaque(false);
				txtS.setBorder(null);
				//TRANPARENCIA CON NIMBUS
				txtS.setOpaque(false); // added by OP
				txtS.setBorder(BorderFactory.createEmptyBorder());
				txtS.setBackground(new Color(0,0,0,0));
				
				btnLimpiar = new JButton("Limpiar");
				btnLimpiar.addActionListener(this);
				btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnLimpiar.setBounds(431, 439, 257, 36);
				getContentPane().add(btnLimpiar);
	    /**************************************************************************/
		
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(arg0);
		}
		if (arg0.getSource() == btnListarDonantes) {
			actionPerformedBtnListarDonantes(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
	}

	/*****************************CONSULTAR**********************************/ 
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	GestionDonante gd = new GestionDonante();
	int codigo = leerCodigoDonante();
	Donante  don = gd.buscar(codigo);
	   
	if (don!=null) {//Si don no es nulo
	   //----1--imprimir en la caja de texto lo siguiente
    txtCargoRep.setText(don.getCargoRepresenante());
	txtRazonSocialDonanF.setText(don.getRazonSocial());//--------------------2
	txtApellRep.setText(don.getApeRepresenante());
    //lblCodigo.setVisible(!lblCodigo.isVisible());  revalidate(); repaint();//Me esconde el label codigo
	//---2 y tambien que haga lo siguiente
	txtDireccionDonan.setText(don.getDireccion());
    txtNombreRep.setText(don.getNomRepresenante());    
    txtTelefonoDonanF.setText(don.getTelefono());
    lblCodigo.setText(String.valueOf(don.getCodigo()));
    
    
    
    scrollPaneListaDonante.setVisible(false);
    revalidate();
    repaint();
    
    ConsultaCodigo();
    
  
	}

	

    
	else{
		
		limpieza();
		JOptionPane.showMessageDialog(this, "Donante buscado no está registrado");
		txtCodigoF.setText("");
		txtRazonSocialDonanF.setText("");
	    }
	
	}
	
	private int leerCodigoDonante() {  //---------COGER DESDE LA CAJA DE TEXTO
		return Integer.parseInt(txtCodigoF.getText().trim());
	}
	
	
	public void ConsultaCodigo(){
		
		txtS.setText("");
		txtS.append("     =====================================================================" +"\n");	
		txtS.append("        Nombre de Donante  \t\t: " + " Alejandro Toledo Manrique"+"\n");
		txtS.append("     ====================================================================="+"\n");
		txtS.append("        Nombre de Producto  \t\t: "      + "     Wisky"      +"\n");
		txtS.append("        Cantidad Donado  \t\t: "         + "     50 Botellas"            +"\n");
		txtS.append("        Marca Producto  \t\t: "          + "     Jack Daniels"            +"\n");
		txtS.append("        Fecha recibida  \t\t: "          + "     29/06/19"      +"\n");
		txtS.append("        Area a de Consumo \t\t: "        + "     Comedor"      +"\n");
		txtS.append("        Categoria de Producto    \t: "   + "     Alimentos"         +"\n");
		
		
	}
	
		
	
	

	
	
	/*****************************LISTAR**********************************/ 	
	protected void actionPerformedBtnListarDonantes(ActionEvent arg0) {
		
		 //ACTIVA O DESACTIVA EL CONTENEDOR DE LA TABLA
	    scrollPaneListaDonante.setVisible(true);
	    revalidate();
	    repaint();
	    
		CargarTabla();		
	}
	
	
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	
	/**************************************REGISTRAR*********************************BOTON REGISTRAR*/
	 protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		    
			//int codigoF, tipoF;
			String  razonSocialF, nomRepresenanteF, apeRepresenanteF,cargoRepresenanteF,
		            fechaRegistroF ,direccionF,telefonoF;
		
			try {
				razonSocialF=txtRazonSocialDonanF.getText();
				nomRepresenanteF =txtNombreRep.getText();
				apeRepresenanteF=txtApellRep.getText();
				cargoRepresenanteF = txtCargoRep.getText();
				DateFormat DF = new SimpleDateFormat("yy/MM/dd");
				fechaRegistroF      = DF.format(txtFechaRegistro.getDate());
				direccionF = txtDireccionDonan.getText();
				telefonoF = txtTelefonoDonanF.getText();
				
				//Coger la Fecha del txtFechaIngreso

				/*****************TABLA DONANTE***************
				1-- codigo  int auto_increment,
				2 razonSocial varchar(25),
				3 nomRepresenante varchar(15),
				4 apeRepresenante varchar(15),
				5 cargoRepresenante varchar(15),
				6-- tipoDonante    int DEFAULT 2,
				7 fechaRegistro date  null,
				8 direccion varchar(25),
				9 telefono varchar(9),
				primary key (codigo)*************************/
				
				/*cargo=txtCargo.getText();
				//sueldo=Double.parseDouble(txtSueldo.getText());
				DateFormat df = new SimpleDateFormat("yy/MM/dd");
				fechaIngreso      = df.format(txtFecha.getDate());*/				
					
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Error, No deje espacios en blanco");
				return;
			}						
			Donante d = new Donante();
			        d.setRazonSocial(razonSocialF);
			        d.setNomRepresenante(nomRepresenanteF);
			        d.setApeRepresenante(apeRepresenanteF);
			        d.setCargoRepresenante(cargoRepresenanteF);
			        d.setFechaRegistro(fechaRegistroF);
			        d.setDireccion(direccionF);
			        d.setTelefono(telefonoF);
			/*person.setIdPersonal(idPersonal);
	
			person.setCargo(cargo);
			person.setSueldo(sueldo);
			person.getFechaIngreso();*/
			
			GestionDonante GD=new GestionDonante();
			int ok=GD.registrar(d);
			CargarTabla();

			if (ok==0) {
				JOptionPane.showMessageDialog(this, "Error al Registrar");
			}else {
				
				
				 //ACTIVA O DESACTIVA EL CONTENEDOR DE LA TABLA
			    scrollPaneListaDonante.setVisible(true);
			    revalidate();
			    repaint();
				JOptionPane.showMessageDialog(this, "El Registro Fue Exitoso");
			}
			
			CargarTabla();
					  
		    limpieza();
		    
		    
			                  				                         
	}
	
	 
	void limpieza() {
		txtCodigoF.setText(null);
		txtRazonSocialDonanF.setText(null);
		txtCargoRep.setText(null);
		txtNombreRep.setText(null) ;
		txtCargoRep.setText(null) ;
		txtApellRep.setText(null) ;	
		//txtFechaRegistro.
		txtTelefonoDonanF.setText(null);
		txtDireccionDonan.setText(null);
		cboTipoDonate.setSelectedIndex(0);	
		txtS.setText(null);
		
	}
	protected void actionPerformedBtnLimpiar(ActionEvent arg0) {
		
		limpieza();
	}
}




/***********************************************************************
 * 
 * 
//Boton Mostrar en Tabla
	 protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		DefaultTableModel model = (DefaultTableModel)tblSalida.getModel();
		model.addRow(new Object[]{txtNombreRep.getText(), 
				                  txtApellRep.getText(),
				                  cboTipoDonate.getSelectedIndex() 
				                  				                         });
	}
	
void ingresar(){
	String cod, prod;
	int cant;
	double pre;
	int tipo;
	
	cod = txtNombreRep.getText(); // terminar leerCodigo()
	prod = leerProducto();
	cant = leerCantidad();
	pre  = leerPrecio();
	tipo = leerTipo();
	
	// -- validacion
	

	
}

int leerTipo(){
	return cboTipoDonate.getSelectedIndex();
}

int leerCantidad(){
	int cantidad = -1; // valor x default		
	return cantidad;
}

double leerPrecio(){
	double pre = -1;		
	return pre;
}

String leerProducto(){
	String prod = null;		
	return prod;
}

void mostrarResultados(String codigo, String producto, int cantidad, double precio){
	txtNombreRep.setText(codigo+"\n");
	txtApellRep.setText(producto+"\n");		
	
}
************************************************************************************************/
