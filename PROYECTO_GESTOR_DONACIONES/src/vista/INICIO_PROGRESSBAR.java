package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //Lo usara el Timer
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;//Para el Timer

public class INICIO_PROGRESSBAR extends javax.swing.JFrame {

	private JPanel contentPane;
	private JProgressBar pb;
	
	
	//--------------------------
	private Timer t;
	private final  ActionListener ac;
	private int x=0;
	private JProgressBar barraDeProgreso;
	private JLabel lblCargandoArchivos;
	private JLabel lblCibertec;

    public INICIO_PROGRESSBAR() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				x = x+1;
				barraDeProgreso.setValue(x);
				//Asignamos los archivos mientras durare la carga
				
				if (barraDeProgreso.getValue()==1)
				{
					lblCargandoArchivos.setText("Cargando Proyecto Cibertec Arcivos");
				}
				
				if (barraDeProgreso.getValue()==1)
				{
					lblCargandoArchivos.setText("Cargando Proyecto Donaciones");
				}
				
				if (barraDeProgreso.getValue()==10)
				{
					lblCargandoArchivos.setText("Cargando Proyecto Cibertec 2019 Conectar ");
					
					//new Conectar();
				}
				
				if (barraDeProgreso.getValue()==20)
				{
					lblCargandoArchivos.setText("Cargando Proyecto Cibertec 2019 Registro Donante");
					//new FrmRegistroDonante();
				}
				
				if (barraDeProgreso.getValue()==30)
				{
					lblCargandoArchivos.setText("Cargando Proyecto Cibertec 2019  FrmRegistroDonativo");
					//new FrmRegistroDonativo();
				}
								
				if (barraDeProgreso.getValue()==40)
				{
					lblCargandoArchivos.setText("Proyecto Cibertec 2019 Hebert Gonzales");
					//new FrmRegistroDonativo();
				}
				
				
				if (barraDeProgreso.getValue()==50)
				{
					lblCargandoArchivos.setText("Proyecto Cibertec 2019 Daniel Huari");
				}
				
				if (barraDeProgreso.getValue()==60)
				{
					lblCargandoArchivos.setText("Proyecto Cibertec 2019 Jean Vilafana");
				}
				
				if (barraDeProgreso.getValue()==70)
				{
					lblCargandoArchivos.setText("Proyecto Cibertec 2019 Marcos Ccopa");
				}
				
				if (barraDeProgreso.getValue()==80)
				{
					lblCargandoArchivos.setText("Proyecto Cibertec 2019 Hebert Gonzales");
				}
				
				if (barraDeProgreso.getValue()==90)
				{
					lblCargandoArchivos.setText("CIBERTEC 2019 Registro Donaciones");
				}
				
						
				
				if (barraDeProgreso.getValue()==100) {
					VENTANA_BLOQUEADA 	b = new VENTANA_BLOQUEADA();
					b.setVisible(true);
					//b.setLocationRelativeTo(this);
					
					dispose();
					t.stop();
					
					
				}
			}
			
		};
        
	    t = new Timer(100,ac);
	    t.start();
    }
    
	
	/**
	 * Launch the application.*/
	 
	public static void main(String[] args) {
		VENTANA_PRINCIPAL v = new VENTANA_PRINCIPAL();
		v.nimbus ();
		INICIO_PROGRESSBAR pb = new INICIO_PROGRESSBAR();
		  //frame.pack();
		  pb.setVisible(true);
		  //pb.update();
		
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROGRESSBAR frame = new PROGRESSBAR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the frame.
	 */
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		barraDeProgreso = new JProgressBar();
		barraDeProgreso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		barraDeProgreso.setForeground(Color.BLACK);
		barraDeProgreso.setStringPainted(true);
		//pb = new JProgressBar(0, 10000);
		barraDeProgreso.setBounds(10, 358, 654, 23);
		contentPane.add(barraDeProgreso);
		
		lblCargandoArchivos = new JLabel("");
		lblCargandoArchivos.setForeground(Color.LIGHT_GRAY);
		lblCargandoArchivos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCargandoArchivos.setBounds(10, 325, 654, 30);
		contentPane.add(lblCargandoArchivos);
		
		lblCibertec = new JLabel("");
		lblCibertec.setIcon(new ImageIcon(INICIO_PROGRESSBAR.class.getResource("/img/ciberbar.png")));
		lblCibertec.setBounds(0, 0, 686, 411);
		contentPane.add(lblCibertec);
		
		setUndecorated(true);
		
		

	}
}
