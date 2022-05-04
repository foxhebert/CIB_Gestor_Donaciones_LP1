package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

public class ADS extends JFrame {

	private JPanel contentPane;
	private JLabel lblSolicitarLecencia;
	private JButton btnGrabar;
	private JButton btnRegistrar;
	private JButton btnImprimir;
	private JLabel lblConsultarSolicitud;
	private JTextField textField;
	private JButton btnConsultar;
	private JLabel lblDiaDeEntrega;
	private JTextField textField_1;
	private JTextField txtEstablecimientoComercial;
	private JLabel lblTipo;
	private JLabel lblArea;
	private JTextField txtS;
	private JLabel lblFalta;
	private JTextField txtInforme;
	private JTextField txtNoSeEncontr;
	private JLabel lblAnotaciones;
	private JLabel label_8;
	private JLabel label_9;
	private JComboBox comboBox_1;
	private JLabel label_10;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel label_11;
	private JLabel label_12;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel label_13;
	private JLabel label_14;
	private JTextField textField_11;
	private JLabel lblFechaIngreso;
	private JDateChooser dateChooser_1;
	private JButton btnCerrar;
	private JLabel lblNewLabel;
	private JLabel lblAutogenerado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADS frame = new ADS();
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
	public ADS() {
		setTitle("Municipalidad de Sab Miguel  || Solicitud de Licencias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblSolicitarLecencia = new JLabel("SOLICITUD DE LICENCIAS DE FUNCIONAMIENTO");
		lblSolicitarLecencia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSolicitarLecencia.setBounds(194, 11, 421, 33);
		contentPane.add(lblSolicitarLecencia);
		
		btnGrabar = new JButton("ACTUALIZAR");
		btnGrabar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGrabar.setBounds(243, 571, 152, 40);
		contentPane.add(btnGrabar);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrar.setBounds(51, 571, 152, 40);
		contentPane.add(btnRegistrar);
		
		btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImprimir.setBounds(441, 571, 152, 40);
		contentPane.add(btnImprimir);
		
		lblConsultarSolicitud = new JLabel("SOLICITUD N\u00B0 :");
		lblConsultarSolicitud.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConsultarSolicitud.setBounds(464, 70, 111, 24);
		contentPane.add(lblConsultarSolicitud);
		
		textField = new JTextField();
		textField.setText("20118001");
		textField.setForeground(new Color(0, 0, 128));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(588, 69, 97, 27);
		contentPane.add(textField);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConsultar.setBounds(695, 69, 123, 27);
		contentPane.add(btnConsultar);
		
		lblDiaDeEntrega = new JLabel("Fecha da de Entrega :");
		lblDiaDeEntrega.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDiaDeEntrega.setBounds(464, 118, 152, 24);
		contentPane.add(lblDiaDeEntrega);
		
		textField_1 = new JTextField();
		textField_1.setText("28-08-2019");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(626, 117, 192, 27);
		contentPane.add(textField_1);
		
		txtEstablecimientoComercial = new JTextField();
		txtEstablecimientoComercial.setText("Establecimiento Comercial");
		txtEstablecimientoComercial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEstablecimientoComercial.setColumns(10);
		txtEstablecimientoComercial.setBounds(578, 167, 240, 27);
		contentPane.add(txtEstablecimientoComercial);
		
		lblTipo = new JLabel("Tipo :");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo.setBounds(464, 168, 104, 24);
		contentPane.add(lblTipo);
		
		lblArea = new JLabel("Estado :");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArea.setBounds(464, 216, 92, 24);
		contentPane.add(lblArea);
		
		txtS = new JTextField();
		txtS.setText("EN PROCESO");
		txtS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtS.setColumns(10);
		txtS.setBounds(578, 215, 240, 27);
		contentPane.add(txtS);
		
		lblFalta = new JLabel("Pendientes :");
		lblFalta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFalta.setBounds(464, 264, 123, 24);
		contentPane.add(lblFalta);
		
		txtInforme = new JTextField();
		txtInforme.setText("Informe, V\u00B0B\u00B0 Gerente");
		txtInforme.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtInforme.setColumns(10);
		txtInforme.setBounds(578, 263, 240, 27);
		contentPane.add(txtInforme);
		
		txtNoSeEncontr = new JTextField();
		txtNoSeEncontr.setText("No se encontr\u00F3 expediente");
		txtNoSeEncontr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNoSeEncontr.setColumns(10);
		txtNoSeEncontr.setBounds(578, 303, 240, 27);
		contentPane.add(txtNoSeEncontr);
		
		lblAnotaciones = new JLabel("Anotaciones :");
		lblAnotaciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnotaciones.setBounds(464, 304, 104, 24);
		contentPane.add(lblAnotaciones);
		
		label_8 = new JLabel("CODIGO");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(37, 69, 65, 24);
		contentPane.add(label_8);
		
		label_9 = new JLabel("PERSONA");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(36, 108, 65, 24);
		contentPane.add(label_9);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(151, 107, 240, 27);
		contentPane.add(comboBox_1);
		
		label_10 = new JLabel("TIPO SOLIC.");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(36, 146, 104, 24);
		contentPane.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setText("ESTABLECIMIENTO");
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(150, 145, 240, 27);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Empresa Peru S.A.C.");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(151, 184, 240, 27);
		contentPane.add(textField_8);
		
		label_11 = new JLabel("RAZON SOCIAL");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(37, 185, 104, 24);
		contentPane.add(label_11);
		
		label_12 = new JLabel("NOMBRES");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(37, 223, 92, 24);
		contentPane.add(label_12);
		
		textField_9 = new JTextField();
		textField_9.setText("Heber Gonzales");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(151, 222, 240, 27);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("Av Brasil 123 - SanMiguel");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(151, 262, 240, 27);
		contentPane.add(textField_10);
		
		label_13 = new JLabel("DIRECCION");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(37, 263, 104, 24);
		contentPane.add(label_13);
		
		label_14 = new JLabel("TELEFONO");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_14.setBounds(37, 303, 104, 24);
		contentPane.add(label_14);
		
		textField_11 = new JTextField();
		textField_11.setText("99887700");
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(151, 302, 240, 27);
		contentPane.add(textField_11);
		
		lblFechaIngreso = new JLabel("FECHA INGRESO");
		lblFechaIngreso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaIngreso.setBounds(37, 343, 123, 24);
		contentPane.add(lblFechaIngreso);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 12));
		dateChooser_1.setToolTipText("");
		dateChooser_1.setDateFormatString("dd-MM-yyyy");
		dateChooser_1.setBounds(151, 340, 240, 27);
		contentPane.add(dateChooser_1);
		
		btnCerrar = new JButton("SALIR");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.setBounds(635, 571, 152, 40);
		contentPane.add(btnCerrar);
		
		lblNewLabel = new JLabel("20118001");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(151, 65, 105, 36);
		contentPane.add(lblNewLabel);
		
		lblAutogenerado = new JLabel("Autogenerado");
		lblAutogenerado.setForeground(new Color(128, 128, 128));
		lblAutogenerado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAutogenerado.setBounds(253, 70, 119, 24);
		contentPane.add(lblAutogenerado);
	}
}
