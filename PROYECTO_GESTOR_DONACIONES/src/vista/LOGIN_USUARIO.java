
package vista;
import java.util.ArrayList;

import javax.swing.JFrame;

import utils.Conexion_integrantes;
import vista.VENTANA_PRINCIPAL;

import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Window;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Heber
 */
public class LOGIN_USUARIO extends JFrame implements ActionListener {

	
	
	int contador;
    public LOGIN_USUARIO() {
        initComponents();
        Conexion_integrantes.conectar();
        
        cboUsuarios.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = Conexion_integrantes.llenar_combo();
        for(int i = 0; i<lista.size();i++){
            cboUsuarios.addItem(lista.get(i));
        }
        
        
    }


    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1, Short.MAX_VALUE))
        );
                panel.setLayout(null);
        
                cboUsuarios = new javax.swing.JComboBox();
                cboUsuarios.addActionListener(this);
                cboUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
                cboUsuarios.setBounds(107, 172, 236, 31);
                panel.add(cboUsuarios);
                
                        cboUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                        
                        label = new JLabel("Gestor Donaciones");
                        label.setForeground(SystemColor.controlDkShadow);
                        label.setFont(new Font("Tahoma", Font.BOLD, 32));
                        label.setBounds(54, 11, 334, 61);
                        panel.add(label);
                        
                        label_1 = new JLabel("Ingrese para usar el sistema");
                        label_1.setForeground(SystemColor.controlDkShadow);
                        label_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
                        label_1.setBackground(Color.DARK_GRAY);
                        label_1.setBounds(74, 69, 274, 61);
                        panel.add(label_1);
                        
                        label_2 = new JLabel("Usuario");
                        label_2.setHorizontalAlignment(SwingConstants.CENTER);
                        label_2.setForeground(Color.DARK_GRAY);
                        label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
                        label_2.setBounds(165, 141, 89, 20);
                        panel.add(label_2);
                        
                        label_3 = new JLabel("Contrase\u00F1a\r\n");
                        label_3.setHorizontalAlignment(SwingConstants.CENTER);
                        label_3.setForeground(Color.DARK_GRAY);
                        label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
                        label_3.setBounds(154, 229, 121, 20);
                        panel.add(label_3);
                        
                        password = new JPasswordField();
                        password.setHorizontalAlignment(SwingConstants.CENTER);
                        password.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        password.setBackground(SystemColor.menu);
                        password.setBounds(107, 255, 236, 31);
                        panel.add(password);
                        
                        btnentrar = new JButton("Ingresar");
                        btnentrar.addActionListener(this);
                        btnentrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
                        btnentrar.setBackground(SystemColor.controlHighlight);
                        btnentrar.setBounds(107, 311, 236, 46);
                        panel.add(btnentrar);
                        
                        btncancelar = new JButton("Cancelar");
                        btncancelar.addActionListener(this);
                        btncancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
                        btncancelar.setBackground(SystemColor.controlHighlight);
                        btncancelar.setBounds(107, 379, 236, 46);
                        panel.add(btncancelar);
                        
                        label_4 = new JLabel("Desarrolladores : ");
                        label_4.setForeground(SystemColor.windowBorder);
                        label_4.setFont(new Font("Dialog", Font.PLAIN, 16));
                        label_4.setBounds(32, 469, 141, 21);
                        panel.add(label_4);
                        
                        label_5 = new JLabel(" Jean Marco, Daniel, Jesus, Heber ");
                        label_5.setForeground(SystemColor.windowBorder);
                        label_5.setFont(new Font("Dialog", Font.PLAIN, 16));
                        label_5.setBounds(161, 469, 263, 21);
                        panel.add(label_5);
                        
                        label_6 = new JLabel("Copyright \u00AE");
                        label_6.setForeground(SystemColor.windowBorder);
                        label_6.setFont(new Font("Dialog", Font.PLAIN, 17));
                        label_6.setBounds(167, 495, 99, 21);
                        panel.add(label_6);
        getContentPane().setLayout(layout);

        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
       	/*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_USUARIO().setVisible(true);
            }
        });
    }

  
    private javax.swing.JComboBox cboUsuarios;
    private JPanel panel;
    private JLabel label;
    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;
    private JPasswordField password;
    private JButton btnentrar;
    private JButton btncancelar;
    private JLabel label_4;
    private JLabel label_5;
    private JLabel label_6;
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btncancelar) {
			actionPerformedBtncancelar(arg0);
		}
		if (arg0.getSource() == btnentrar) {
			actionPerformedBtnentrar(arg0);
		}
		if (arg0.getSource() == cboUsuarios) {
			actionPerformedCboUsuarios(arg0);
		}
	}
	protected void actionPerformedCboUsuarios(ActionEvent arg0) {
	}
	
	
	void VentanaPrincipal(){
		closeAllDialogs();
		VENTANA_PRINCIPAL	b = new VENTANA_PRINCIPAL();
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
			String usuario,contraseña,contraseña2,contraseña3,contraseña4,contraseña5,contraseña9,pass;
			int posicion=cboUsuarios.getSelectedIndex();
			
			//entrada de datos
			contraseña="123";
			contraseña2="123";
			contraseña3="123";
			contraseña4="123";
			contraseña9="123";
			
			
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
			
			else if (posicion==9 && pass.equals(contraseña9)){
				dispose();
				VentanaPrincipal();
				JOptionPane.showMessageDialog(this, cboUsuarios.getSelectedItem().toString() + "\t Bienvenido al Sistema " + 
						(""),"Has Ingresado al Sistema", JOptionPane.INFORMATION_MESSAGE);
								
			}
			
					
			else{
				
				switch(contador){
				case 0:JOptionPane.showMessageDialog(LOGIN_USUARIO.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 4 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 1:JOptionPane.showMessageDialog(LOGIN_USUARIO.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 3 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 2:JOptionPane.showMessageDialog(LOGIN_USUARIO.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 2 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				case 3:JOptionPane.showMessageDialog(LOGIN_USUARIO.this,
						"Usuario o contraseña incorrecto." + "\nLe queda 1 intentos, intente de nuevo.", "Error",
						JOptionPane.ERROR_MESSAGE);
				password.setText("");
				break;
				
				default:
					JOptionPane.showMessageDialog(LOGIN_USUARIO.this,
							"A excedido el numero de intentos , intente de nuevo en 30 segundos", "Error",
							JOptionPane.WARNING_MESSAGE);
					dispose();
				}
				contador++;
				}
			}
		
	
	
	
	protected void actionPerformedBtnentrar(ActionEvent arg0) {
		validarUsuario_Contraseña();
		
	}
	protected void actionPerformedBtncancelar(ActionEvent arg0) {
		dispose();
	}
}
