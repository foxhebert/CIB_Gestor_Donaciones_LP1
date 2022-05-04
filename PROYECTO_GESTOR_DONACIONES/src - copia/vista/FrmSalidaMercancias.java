package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class FrmSalidaMercancias extends JInternalFrame implements ActionListener {
	
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblSalidaDeAlimentos;
	private JLabel lblCodSalida;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblMotivo;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_4;
	private JLabel lblArea;
	private JTextField textField_2;
	private JDateChooser dateChooser;
	private JLabel lblFechaSalida;
	private JButton btnListar;
	private JButton btnActualizareditar;
	private JButton btnRegistrarSalida;
	private JButton button_7;
	private JTextField textField_3;
	private JLabel lblRegistrarLaSalida;
	private JLabel lblRegistrarLaSalida_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSalidaMercancias frame = new FrmSalidaMercancias();
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
	public FrmSalidaMercancias() {
		setTitle("Consumo || Salida de Mercancias");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(180, 50, 770, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 241, 716, 223);
		contentPane.add(scrollPane);
		
		lblSalidaDeAlimentos = new JLabel("Salida de Mercacias");
		lblSalidaDeAlimentos.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSalidaDeAlimentos.setBounds(275, 11, 237, 36);
		contentPane.add(lblSalidaDeAlimentos);
		
		lblCodSalida = new JLabel("Cod Salida:");
		lblCodSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodSalida.setBounds(18, 96, 91, 25);
		contentPane.add(lblCodSalida);
		
		label_1 = new JLabel("Producto   :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(18, 145, 82, 14);
		contentPane.add(label_1);
		
		label_2 = new JLabel("Cantidad    :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(18, 186, 82, 25);
		contentPane.add(label_2);
		
		lblMotivo = new JLabel("Motivo      :");
		lblMotivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMotivo.setBounds(305, 96, 82, 25);
		contentPane.add(lblMotivo);
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBounds(103, 188, 153, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setColumns(10);
		textField_1.setBounds(103, 142, 153, 20);
		contentPane.add(textField_1);
		
		label_4 = new JLabel("Autogenerago");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(130, 97, 105, 22);
		contentPane.add(label_4);
		
		lblArea = new JLabel("Area       :");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArea.setBounds(305, 140, 65, 25);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(397, 98, 163, 20);
		contentPane.add(textField_2);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 12));
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(397, 188, 163, 20);
		contentPane.add(dateChooser);
		
		lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaSalida.setBounds(305, 184, 104, 28);
		contentPane.add(lblFechaSalida);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBounds(581, 181, 153, 36);
		contentPane.add(btnListar);
		
		btnActualizareditar = new JButton("Actualizar/Editar");
		btnActualizareditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnActualizareditar.setBounds(581, 134, 153, 36);
		contentPane.add(btnActualizareditar);
		
		btnRegistrarSalida = new JButton("Registrar Salida");
		btnRegistrarSalida.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarSalida.setBounds(581, 87, 153, 36);
		contentPane.add(btnRegistrarSalida);
		
		button_7 = new JButton("Cerrar");
		button_7.addActionListener(this);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_7.setBounds(581, 40, 153, 36);
		contentPane.add(button_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 142, 163, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblRegistrarLaSalida = new JLabel("productos varios para consumo local.");
		lblRegistrarLaSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegistrarLaSalida.setBounds(18, 40, 247, 25);
		contentPane.add(lblRegistrarLaSalida);
		
		lblRegistrarLaSalida_1 = new JLabel("Registrar la salida de donativos de ");
		lblRegistrarLaSalida_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegistrarLaSalida_1.setBounds(18, 10, 220, 42);
		contentPane.add(lblRegistrarLaSalida_1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_7) {
			actionPerformedButton_7(arg0);
		}
		// TODO Auto-generated method stub
		
	}
	protected void actionPerformedButton_7(ActionEvent arg0) {
		dispose();
	}
}
