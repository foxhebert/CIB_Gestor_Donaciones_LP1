package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//import model.Personas;
import model.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;


import mantenimientos.GestionUsuario;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class FrmRegistroUsuario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblDocumento;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblCargo;
	private JLabel lblFechaIngreso;
	private JTextField txtDNI;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtCargo;
	private JButton btnRegistrar;
	private JDateChooser txtFechaIngreso;
	private JLabel lblRegistroDeUsuario;
	private JButton btnEliminar;
	private JButton btnCerrar;
	private JButton btnActualizar;
	private JButton btnListar;
	private JTextField txtClave;
	private JLabel lblClave;
	
	/***************************C*********************************/
	private JScrollPane scrollPane;
	//private JTable MiTablaPaListar;
	private JTable MiTablaPaListar;
	//Objetos para cargar el JTable
	DefaultTableModel Tabla;
	//DefaultComboBoxModel<Integer> Combo;//----------------------------------------------1
	String Columnas[]={"DNI","NOMBRE","APELLIDOS","CARGO","FECHA INGRESO" ,"CLAVE"};//,"PRECIO","STOCK","CATEGORÍA"};//----------2
	Object Filas[][];//-----------------------------------------------------------------3
	int    fila;//----------------------------------------------------------------------4

	// METODO DE CARGA del JTable
	public void CargarTabla(){
			List<Usuario> lstUsuario =(new GestionUsuario()).listado(); 
			// Inicializar el objeto Tabla
			Tabla = new DefaultTableModel();
			// Cargar los nonbres de las columnas
			for(String x:Columnas)Tabla.addColumn(x);
			// Cargar las filas
			Filas = new Object[lstUsuario.size()][6];
			for(int i = 0; i < lstUsuario.size(); i++){
				Filas[i][0] = lstUsuario.get(i).getDni();
			    Filas[i][1] = lstUsuario.get(i).getNombre();
			    Filas[i][2] = lstUsuario.get(i).getApellido();
			    Filas[i][3] = lstUsuario.get(i).getCargo();
			    Filas[i][4] = lstUsuario.get(i).getFechaIngreso();
			    Filas[i][5] = lstUsuario.get(i).getClave();
			    
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
					FrmRegistroUsuario frame = new FrmRegistroUsuario();
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
	public FrmRegistroUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmRegistroUsuario.class.getResource("/img/admin.png")));
		setTitle("Registro || Usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(295, 170, 775, 515 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDocumento = new JLabel("Numero DNI  :");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDocumento.setBounds(32, 83, 118, 14);
		contentPane.add(lblDocumento);
		
		lblApellidos = new JLabel("Apellidos :");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(32, 140, 118, 14);
		contentPane.add(lblApellidos);
		
		lblNombre = new JLabel("Nombres :");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(32, 113, 118, 14);
		contentPane.add(lblNombre);
		
		lblCargo = new JLabel("Cargo :");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargo.setBounds(32, 162, 118, 26);
		contentPane.add(lblCargo);
		
		lblFechaIngreso = new JLabel("Fecha de Ingreso :");
		lblFechaIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaIngreso.setBounds(368, 75, 118, 24);
		contentPane.add(lblFechaIngreso);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(160, 81, 155, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(160, 138, 155, 20);
		contentPane.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(160, 111, 155, 20);
		contentPane.add(txtNombre);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(160, 165, 155, 20);
		contentPane.add(txtCargo);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(FrmRegistroUsuario.class.getResource("/img/icons8-save-close-32 (1).png")));
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(562, 73, 176, 36);
		contentPane.add(btnRegistrar);
				
		txtFechaIngreso = new JDateChooser();
		txtFechaIngreso.setDateFormatString("dd-MM-yyyy");
		txtFechaIngreso.setBounds(358, 107, 155, 20);
		contentPane.add(txtFechaIngreso);
		
		/***************************TABLA EN LA GUI*********************************/
		//DISEÑO DE LA TABLA DENTRO DE UN SCROLL PANE
				scrollPane = new JScrollPane();
				scrollPane.setBounds(23, 215, 715, 204);
				contentPane.add(scrollPane);
				MiTablaPaListar = new JTable();
				MiTablaPaListar.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					}
				));
				scrollPane.setViewportView(MiTablaPaListar);
	    /**************************************************************************/
				
				lblRegistroDeUsuario = new JLabel("Registro de Usuario");
				lblRegistroDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 21));
				lblRegistroDeUsuario.setBounds(276, 11, 222, 26);
				contentPane.add(lblRegistroDeUsuario);
				
				btnEliminar = new JButton("Limpiar");
				btnEliminar.addActionListener(this);
				btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnEliminar.setBounds(562, 168, 176, 36);
				contentPane.add(btnEliminar);
				
				btnCerrar = new JButton("Cerrar");
				btnCerrar.addActionListener(this);
				btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnCerrar.setBounds(562, 25, 176, 36);
				contentPane.add(btnCerrar);
				
				btnActualizar = new JButton("Actualizar");
				btnActualizar.addActionListener(this);
				btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnActualizar.setBounds(562, 119, 176, 36);
				contentPane.add(btnActualizar);
				
				btnListar = new JButton("Listar Usuarios Existentes");
				btnListar.addActionListener(this);
				btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnListar.setBounds(239, 429, 259, 36);
				contentPane.add(btnListar);
				
				txtClave = new JTextField();
				txtClave.setColumns(10);
				txtClave.setBounds(358, 162, 155, 20);
				contentPane.add(txtClave);
				
				lblClave = new JLabel("Clave de Usuario");
				lblClave.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblClave.setBounds(380, 140, 106, 14);
				contentPane.add(lblClave);

		
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnActualizar) {
			actionPerformedBtnActualizar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnLimpiar(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
	}
	
	
	/*public void validarNombre (String nombre){
    	if(nombre.equals("")){
    JOptionPane.showMessageDialog(null, "Ingrese Datos","EROOR", JOptionPane.INFORMATION_MESSAGE);
    }}*/
	
	//************************************************************************************REGISTRAR
	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {		
		//String idPersonal;
	    String dniF, nombreF, apellidoF, cargoF,fechaIngresoF, claveF;//, cargo, fechaIngreso;
	    //double sueldo;		
		
	    
	    
		try {
			dniF=txtDNI.getText();
			nombreF =txtNombre.getText();
			apellidoF=txtApellido.getText();
			cargoF = txtCargo.getText();
			claveF = txtClave.getText();
			//Coger la Fecha del txtFechaIngreso
			DateFormat dayformat = new SimpleDateFormat("yy/MM/dd");
			fechaIngresoF      = dayformat.format(txtFechaIngreso.getDate());
			
			/*cargo=txtCargo.getText();
			//sueldo=Double.parseDouble(txtSueldo.getText());
			DateFormat df = new SimpleDateFormat("yy/MM/dd");
			fechaIngreso      = df.format(txtFecha.getDate());*/
			
			
			
				
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error, Tiene que llenar todos los campos");
			return;
		}						
		Usuario usu = new Usuario();
		        usu.setDni(dniF);
		        usu.setNombre(nombreF);
		        usu.setApellido(apellidoF);
		        usu.setCargo(cargoF);
		        usu.setFechaIngreso(fechaIngresoF);
		        usu.setClave(claveF);
		/*person.setIdPersonal(idPersonal);
		
		
		person.setCargo(cargo);
		person.setSueldo(sueldo);
		person.getFechaIngreso();*/
		
		GestionUsuario gesUsu=new GestionUsuario();
		int ok=gesUsu.registrar(usu);
		CargarTabla();

		if (ok==0) {
			JOptionPane.showMessageDialog(this, "Error al Registrar");
		}else {
			JOptionPane.showMessageDialog(this, "El Registro Fue Exitoso");
		}
		
		CargarTabla();
	}
	
	//************************************************************************************************LIMPIAR
	protected void actionPerformedBtnLimpiar(ActionEvent arg0) {
		
		txtDNI.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtCargo.setText("");
		txtClave.setText("");
		txtFechaIngreso.setDate(null);
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	
	protected void actionPerformedBtnActualizar(ActionEvent arg0) {
		//String idPersonal;
	    String dniF, nombreF, apellidoF, cargoF,fechaIngresoF;//, cargo, fechaIngreso;
	    //double sueldo;		
		
		try {
			dniF=txtDNI.getText();
			nombreF =txtNombre.getText();
			apellidoF=txtApellido.getText();
			cargoF = txtCargo.getText();
			//Coger la Fecha del txtFechaIngreso
			DateFormat dayformat = new SimpleDateFormat("yy/MM/dd");
			fechaIngresoF      = dayformat.format(txtFechaIngreso.getDate());
			
			/*cargo=txtCargo.getText();
			//sueldo=Double.parseDouble(txtSueldo.getText());
			DateFormat df = new SimpleDateFormat("yy/MM/dd");
			fechaIngreso      = df.format(txtFecha.getDate());*/
			
			
			
				
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error en los datos, revisar");
			return;
		}						
		Usuario usu = new Usuario();
		        usu.setDni(dniF);
		        usu.setNombre(nombreF);
		        usu.setApellido(apellidoF);
		        usu.setCargo(cargoF);
		        usu.setFechaIngreso(fechaIngresoF);
		/*person.setIdPersonal(idPersonal);
		
		
		person.setCargo(cargo);
		person.setSueldo(sueldo);
		person.getFechaIngreso();*/
		
		GestionUsuario gesUsu=new GestionUsuario();
		int ok=gesUsu.actualizar(usu);
		CargarTabla();

		if (ok==0) {
			JOptionPane.showMessageDialog(this, "Error al Actualizar");
		}else {
			JOptionPane.showMessageDialog(this, "Actualizacion Exitosa");
		}
		
		CargarTabla();
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		CargarTabla();
	}
}
