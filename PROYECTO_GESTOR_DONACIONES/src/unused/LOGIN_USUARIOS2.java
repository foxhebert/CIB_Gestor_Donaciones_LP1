package unused;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Visual.Visual;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.UIManager;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.Dimension;
import vista.VENTANA_PRINCIPAL;


public class LOGIN_USUARIOS2 extends JFrame implements ActionListener {
	int contador;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblUsuarios;
	private JLabel lblContraseña;
	private JComboBox<?> cboUsuarios;
	private JPasswordField password;
	private JButton btnentrar;
	private JButton btncancelar;
	private JLabel lblLeDaLa;
	private JLabel lblDesarrolladores;
	private JLabel lblJeanMarcoDaniel;
	private JLabel lblCibertecIi;
	private JLabel label_1;
	private JLabel lblGestorDonaciones;
	private JLabel label_2;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_USUARIOS2 frame = new LOGIN_USUARIOS2();
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
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public LOGIN_USUARIOS2() {
		
		setTitle("Acceso a Gestor Donaciones \u00AE ");
		setBounds(100, 100, 455, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		//contentPane.setBackground(new Color(0, 0, 0, 0));
		
		{
			lblUsuarios = new JLabel("Usuario");
			lblUsuarios.setForeground(Color.DARK_GRAY);
			lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblUsuarios.setBounds(170, 137, 89, 20);
			contentPane.add(lblUsuarios);
		}
		{
			lblContraseña = new JLabel("Contrase\u00F1a\r\n");
			lblContraseña.setForeground(Color.DARK_GRAY);
			lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
			lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblContraseña.setBounds(159, 225, 121, 20);
			contentPane.add(lblContraseña);
		}
		{
			cboUsuarios = new JComboBox();
			cboUsuarios.setAlignmentX(Component.LEFT_ALIGNMENT);
			cboUsuarios.setAlignmentY(Component.TOP_ALIGNMENT);
			cboUsuarios.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			cboUsuarios.setBorder(null);
			cboUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
			cboUsuarios.setModel(new DefaultComboBoxModel(new String[] {"Heber", "Jean Marco", "Daniel", "Jesus"}));
			cboUsuarios.setBounds(112, 161, 220, 31);
			contentPane.add(cboUsuarios);
		}
		{
			password = new JPasswordField();
			password.setHorizontalAlignment(SwingConstants.CENTER);
			password.setBackground(SystemColor.control);
			password.setFont(new Font("Tahoma", Font.PLAIN, 18));
			password.setBounds(112, 251, 220, 31);
			contentPane.add(password);
		}
		{
			btnentrar = new JButton("Ingresar");
			btnentrar.setBackground(SystemColor.controlHighlight);
			btnentrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnentrar.addActionListener(this);
			btnentrar.setBounds(112, 307, 220, 46);
			contentPane.add(btnentrar);
		}
		{
			btncancelar = new JButton("Cancelar");
			btncancelar.setBackground(SystemColor.controlHighlight);
			btncancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btncancelar.addActionListener(this);
			btncancelar.setBounds(112, 375, 220, 46);
			contentPane.add(btncancelar);
		}
		{
			lblLeDaLa = new JLabel("Ingrese para usar el sistema");
			lblLeDaLa.setBackground(Color.DARK_GRAY);
			lblLeDaLa.setForeground(SystemColor.controlDkShadow);
			lblLeDaLa.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblLeDaLa.setBounds(79, 65, 274, 61);
			contentPane.add(lblLeDaLa);
		}
		{
			lblDesarrolladores = new JLabel("Desarrolladores : ");
			lblDesarrolladores.setForeground(SystemColor.windowBorder);
			lblDesarrolladores.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblDesarrolladores.setBounds(37, 465, 141, 21);
			contentPane.add(lblDesarrolladores);
		}
		{
			lblJeanMarcoDaniel = new JLabel(" Jean Marco, Daniel, Jesus, Heber ");
			lblJeanMarcoDaniel.setForeground(SystemColor.windowBorder);
			lblJeanMarcoDaniel.setFont(new Font("Dialog", Font.PLAIN, 16));
			lblJeanMarcoDaniel.setBounds(166, 465, 263, 21);
			contentPane.add(lblJeanMarcoDaniel);
		}
		{
			lblCibertecIi = new JLabel("Copyright \u00AE");
			lblCibertecIi.setForeground(SystemColor.windowBorder);
			lblCibertecIi.setFont(new Font("Dialog", Font.PLAIN, 17));
			lblCibertecIi.setBounds(172, 491, 99, 21);
			contentPane.add(lblCibertecIi);
		}
		{
			label_1 = new JLabel("123");
			label_1.setForeground(Color.LIGHT_GRAY);
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_1.setBounds(339, 256, 36, 21);
			contentPane.add(label_1);
		}
		{
			lblGestorDonaciones = new JLabel("Gestor Donaciones");
			lblGestorDonaciones.setForeground(SystemColor.controlDkShadow);
			lblGestorDonaciones.setFont(new Font("Tahoma", Font.BOLD, 32));
			lblGestorDonaciones.setBounds(59, 7, 334, 61);
			contentPane.add(lblGestorDonaciones);
		}
		{
			label_2 = new JLabel("\u00AE");
			label_2.setForeground(SystemColor.controlDkShadow);
			label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
			label_2.setBounds(352, -12, 36, 56);
			contentPane.add(label_2);
		}
		
		/*JLabel lblFondo = new JLabel(new ImageIcon("img/innerMainbgImgUrl.jpg"));
		lblFondo.setBounds(0, 0, 436, 523);
		getContentPane().add(lblFondo);*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnentrar) {
			do_btnentrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btncancelar) {
			do_btncancelar_actionPerformed(arg0);
		}
		// TODO Auto-generated method stub
		
	}
	protected void do_btncancelar_actionPerformed(ActionEvent arg0) {
		dispose();
	}
	protected void do_btnentrar_actionPerformed(ActionEvent arg0) {
		
		 validarUsuario_Contraseña();
	}
	
	
	// void abrir VentanaPrincipal()
	
	void VentanaPrincipal(){
		closeAllDialogs();
		VENTANA_PRINCIPAL 	b = new VENTANA_PRINCIPAL();
		b.setVisible(true);
		b.setLocationRelativeTo(this);
		
		
		
		//VENTANA_BLOQUEADA 	c = new VENTANA_BLOQUEADA();
		//c.setVisible(false);
		//c.setLocationRelativeTo(this);
		
		
		
		
		
	}	
	
	public void closeAllDialogs()
	{
	    Window[] windows = getWindows();

	    for (Window window : windows)
	    {
	        if (window instanceof JFrame)
	        {
	            window.dispose();
	        }
	    }
	}
	//valida al usuario si la contraseña es correcta
		void validarUsuario_Contraseña(){
			
			//Declaracion de variables
			@SuppressWarnings("unused")
			String usuario,contraseña,contraseña2,contraseña3,contraseña4,contraseña5,pass;
			int posicion=cboUsuarios.getSelectedIndex();
			
			//entrada de datos
			contraseña="123";
			contraseña2="123";
			contraseña3="123";
			contraseña4="123";
			
			
			pass = new String(password.getPassword());
			
			//condicional si es que el usuario es de lo contrario aparecera cerrar el programa
			
			if (posicion==0 && pass.equals(contraseña)){
				dispose();
				VentanaPrincipal();
				JOptionPane.showMessageDialog(this,  cboUsuarios.getSelectedItem().toString() 
						+ "\t Bienvenido al Sistema " ,"Has Ingresado Satisfactoriamente", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			else if (posicion==1 && pass.equals(contraseña2)){
				dispose(); 
				VentanaPrincipal();
				JOptionPane.showMessageDialog(this, cboUsuarios.getSelectedItem().toString() + "\t Bienvenido al Sistema " +  
						("\nPrivilegios: "+"Moderador"),"Has Ingresado Satisfactoriamente", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
			
			else if (posicion==2 && pass.equals(contraseña3)){
				dispose();
				VentanaPrincipal();
				JOptionPane.showMessageDialog(this, cboUsuarios.getSelectedItem().toString() + "\t Bienvenido al Sistema " +  
						("\nPrivilegios: "+"Moderador"),"Has Ingresado Satisfactoriamente", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
			
			else if (posicion==3 && pass.equals(contraseña4)){
				dispose();
				VentanaPrincipal();
				JOptionPane.showMessageDialog(this, cboUsuarios.getSelectedItem().toString() + "\t Bienvenido al Sistema " + 
						("\nPrivilegios: "+"Moderador"),"Has Ingresado Satisfactoriamente", JOptionPane.INFORMATION_MESSAGE);
								
			}
			
					
			else{
				
				switch(contador){
				case 0:JOptionPane.showMessageDialog(LOGIN_USUARIOS2.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 4 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 1:JOptionPane.showMessageDialog(LOGIN_USUARIOS2.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 3 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 2:JOptionPane.showMessageDialog(LOGIN_USUARIOS2.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 2 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 3:JOptionPane.showMessageDialog(LOGIN_USUARIOS2.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 1 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				default:
					JOptionPane.showMessageDialog(LOGIN_USUARIOS2.this,
							"A excedido el numero de intentos , intente de nuevo en 30 segundos", "Error",
							JOptionPane.WARNING_MESSAGE);
					dispose();
				}
				contador++;
				}
			}
	}