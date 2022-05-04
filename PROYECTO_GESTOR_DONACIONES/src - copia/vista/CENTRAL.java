package vista;

import java.awt.AWTError;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import com.sun.awt.AWTUtilities;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CENTRAL extends javax.swing.JFrame implements MouseListener, ActionListener {

	public void myInitComponents() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(332, 115, 739, 631);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
	}
	
	public CENTRAL() {
	    
	    myInitComponents();
		setBackground(new Color(0, 0, 0));
		this.setUndecorated(true);//ME QUITA EL BORDE
		AWTUtilities.setWindowOpaque(this, false);
		
		
		getContentPane().setLayout(null);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIngresar.setBounds(263, 344, 144, 88);
		getContentPane().add(btnIngresar);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(241, 277, 195, 42);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(this);
		
		lblCerrar = new JLabel("");
		lblCerrar.addMouseListener(this);
		
		lblRestaurar = new JLabel("");
		lblRestaurar.setIcon(new ImageIcon(CENTRAL.class.getResource("/img/b_restaurar_n2.png")));
		lblRestaurar.setBounds(427, 96, 45, 47);
		getContentPane().add(lblRestaurar);
		
		lblOcultar = new JLabel("");
		lblOcultar.setIcon(new ImageIcon(CENTRAL.class.getResource("/img/b_ocultar_n2.png")));
		lblOcultar.setBounds(389, 77, 45, 47);
		getContentPane().add(lblOcultar);
		lblCerrar.setIcon(new ImageIcon(CENTRAL.class.getResource("/img/b_cerrar_n2.png")));
		lblCerrar.setBounds(461, 123, 45, 45);
		getContentPane().add(lblCerrar);
		lblNewLabel.setIcon(new ImageIcon(CENTRAL.class.getResource("/img/login23.png")));
		lblNewLabel.setBounds(49, 11, 629, 571);
		getContentPane().add(lblNewLabel);
		
		
		lblNewLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
		public void mouseDragged(java.awt.event.MouseEvent evt) {		
				LblNewLabelMouseDragged(evt);
		}
		});
		
		lblNewLabel.addMouseListener(new java.awt.event.MouseAdapter() {
		public void mousePressed(java.awt.event.MouseEvent evt) {		
				LblNewLabelMousePressed(evt);
		}
		});
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
				new CENTRAL().setVisible(true);	
				
			}
		});
	}
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnIngresar;
	private JTextField textField;
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLblCerrar(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	

	
	int xx,xy;
	private JLabel lblCerrar;
	private JLabel lblRestaurar;
	private JLabel lblOcultar;
	private void LblNewLabelMousePressed(java.awt.event.MouseEvent evt) {
		xx=evt.getX();
		xy=evt.getY();

	}
	private void LblNewLabelMouseDragged(java.awt.event.MouseEvent evt) {
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x-xx, y-xy);
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	protected void mouseClickedLblCerrar(MouseEvent e) {
		this.dispose();
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		VENTANA_PRINCIPAL 	b = new VENTANA_PRINCIPAL();
		b.setVisible(true);
		b.setLocationRelativeTo(this);
		dispose();
	}
}
