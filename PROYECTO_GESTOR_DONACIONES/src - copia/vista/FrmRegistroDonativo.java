package vista;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;



public class FrmRegistroDonativo extends JInternalFrame implements ActionListener {
	private JTextField txtProducto;
	private JComboBox cboTipo;
	private JScrollPane scrollPane;
	private JTable tblSalida;
	private JButton btnActualizar;
	private JButton btnRegistrar;
	private JButton btnAlatabla;
	private JButton btnCerrar;
	private JLabel lblCodigo;
	private JDateChooser txtFechaIngreso;
	private JLabel lblFechaIngreso;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JLabel lblFechaExpiracion;
	private JDateChooser txtFechaExpiracion;
	private JLabel lblDescripcion;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistroDonativo frame = new FrmRegistroDonativo();
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
	public FrmRegistroDonativo() {
		setTitle("Mantenimiento || Registro de Donativo");
		setBounds(170, 40, 770, 515);
		getContentPane().setLayout(null);
		
		JLabel lblCdigoDonativo = new JLabel("Cod Donativo:");
		lblCdigoDonativo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoDonativo.setBounds(22, 72, 91, 25);
		getContentPane().add(lblCdigoDonativo);
		
		JLabel lblProducto = new JLabel("Producto   :");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProducto.setBounds(22, 112, 82, 14);
		getContentPane().add(lblProducto);
		
		txtProducto = new JTextField();
		txtProducto.setText("");
		txtProducto.setColumns(10);
		txtProducto.setBounds(107, 112, 164, 20);
		getContentPane().add(txtProducto);
		
		JLabel lblTipo = new JLabel("Tipo           :");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipo.setBounds(22, 189, 105, 25);
		getContentPane().add(lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTipo.setBounds(107, 189, 164, 20);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Alimento", "Mercancia", "Otros"}));
		getContentPane().add(cboTipo);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnActualizar.setIcon(null);
		btnActualizar.addActionListener(this);
		btnActualizar.setBounds(582, 131, 153, 36);
		getContentPane().add(btnActualizar);
		
		btnRegistrar = new JButton("Registrar");	
		btnRegistrar.setSelectedIcon(null);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setIcon(null);
	
		btnRegistrar.setBounds(582, 84, 153, 36);
		getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setIcon(null);
		btnEliminar.setBounds(582, 178, 153, 36);
		getContentPane().add(btnEliminar);
		
		JLabel lblMantenimientoDonativo = new JLabel("Nuevo de Donativo");
		lblMantenimientoDonativo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblMantenimientoDonativo.setBounds(273, 10, 237, 36);
		getContentPane().add(lblMantenimientoDonativo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 238, 716, 223);
		getContentPane().add(scrollPane);
		
		tblSalida = new JTable();
		scrollPane.setViewportView(tblSalida);
		tblSalida.setModel(new DefaultTableModel(
				new Object[][] {	},
				
			    new String[] {	"CODIGO",   "NOMBRE", "TIPO"	}
			
		));
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrar.setBounds(582, 37, 153, 36);
		getContentPane().add(btnCerrar);
		
		lblCodigo = new JLabel("Autogenerago");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCodigo.setBounds(134, 73, 105, 22);
		getContentPane().add(lblCodigo);
		
		txtFechaIngreso = new JDateChooser();
		txtFechaIngreso.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFechaIngreso.setDateFormatString("dd-MM-yyyy");
		txtFechaIngreso.setBounds(409, 143, 155, 20);
		getContentPane().add(txtFechaIngreso);
		
		lblFechaIngreso = new JLabel("Fecha Ingreso:");
		lblFechaIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaIngreso.setBounds(295, 137, 104, 28);
		getContentPane().add(lblFechaIngreso);
		
		lblCantidad = new JLabel("Cantidad    :");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(22, 144, 82, 25);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setText("");
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(107, 149, 164, 20);
		getContentPane().add(txtCantidad);
		
		lblFechaExpiracion = new JLabel("Fecha Expiracion:");
		lblFechaExpiracion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaExpiracion.setBounds(295, 184, 123, 28);
		getContentPane().add(lblFechaExpiracion);
		
		txtFechaExpiracion = new JDateChooser();
		txtFechaExpiracion.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFechaExpiracion.setDateFormatString("dd-MM-yyyy");
		txtFechaExpiracion.setBounds(409, 190, 155, 20);
		getContentPane().add(txtFechaExpiracion);
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(295, 72, 82, 25);
		getContentPane().add(lblDescripcion);
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBounds(409, 72, 155, 48);
		getContentPane().add(textField);
		
		
		
	}

	
	void ingresar(){
		String cod, prod;
		int cant;
		double pre;
		int tipo;
		
		cod  = lblCodigo.getText(); // terminar leerCodigo()
		prod = leerProducto();
		cant = leerCantidad();
		pre  = leerPrecio();
		tipo = leerTipo();
		
		// -- validacion
		

		
	}
	
	int leerTipo(){
		return cboTipo.getSelectedIndex();
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
		lblCodigo.setText(codigo+"\n");
		txtProducto.setText(producto+"\n");
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	
		if (arg0.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(arg0);
		}
		if (arg0.getSource() == btnActualizar) {
			actionPerformedBtnActualizar(arg0);
		}
	}
	
	protected void actionPerformedBtnActualizar(ActionEvent arg0) {
					
	}
	
	void limpieza() {
		lblCodigo.setText(null) ;
		txtProducto.setText(null) ;
	
				cboTipo.setSelectedIndex(0);	
	}

	//Boton Mostrar en Tabla
	 protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		DefaultTableModel model = (DefaultTableModel)tblSalida.getModel();
		model.addRow(new Object[]{lblCodigo.getText(), 
				                  txtProducto.getText(),
				                  cboTipo.getSelectedIndex() 
				                  				                         });
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
