package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import vista.BarraCargando;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.awt.AWTUtilities;

import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.InputEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import extras.*;
import javax.swing.JButton;

public class VENTANA_PRINCIPAL_A extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	
	/*public void quitarBorde() {	setUndecorated(true); 
	//ME QUITA EL BORDE }
	}*/
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnSistema;
	private JMenuItem mntmCerrar;
	private JMenu mnMantenimiento;
	private JMenu mnReportes;
	private JMenuItem mntmDonativo;
	private JMenuItem mntmDonante;
	private JMenuItem mntmClientes_1;
	private JDesktopPane desktopPane_escritorio;
	private JMenu mnRegistro;
	private JMenuItem mntmIngresoAlimentos;
	private JMenuItem mntmIngresoMercancia;
	private JMenuItem mntmUsuario;
	private JMenu mnUtilitarios;
	private JMenuItem mntmEspecificaciones;
	private JMenuItem mntmBaseDeDatos;
	private JLabel lblApagar;
	private JLabel lblImpresionBoton;
	private JLabel lblLogin;
	private JLabel imprimirReporte;
	private JLabel lblImprimir;
	private JLabel lblHora;
	private JLabel lblCargandoLoading;
	private JLabel lblHoraCentral;
	private JLabel lblSpinner;
	private JLabel lblNewLabel;
	private JLabel lblManten;
	private JLabel lblArchiv;
	private JMenuItem mntmOcultar;
	private JLabel lblExcel;
	private JLabel lblWord;
	private JLabel lblCarp;
	private JLabel lblImpFondo;
	private JLabel label;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTANA_PRINCIPAL_A frame = new VENTANA_PRINCIPAL_A();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	//MOUSE
	int  xMouseInDesktopBackground;
	int  yMouseInDesktopBackground;
	int  x2;
	int  y2;
	int  xMouse;
	int  yMouse;
	
	private JMenuItem mntmTemaDefoult;
	private JLabel lblFondo2;
	private JLabel lblFondo3;
	private JMenuItem mntmOcultarBordes;
	private JMenu mnNewMenu;
	private JMenuItem mntmMostrarFecha;
	private JLabel lblFecha;
	private JLabel lblBlacoimprimir;
	private JButton btnSwitchOffApagar;

	
	
	
	//MIS PUBLIC VOID
	public void transparenciaDeBotones()//-----QUITA TRANPARENCIA A MIS BOTONES
	{
		btnSwitchOffApagar.setOpaque(false);
		btnSwitchOffApagar.setContentAreaFilled(false);
		btnSwitchOffApagar.setBorderPainted(false);
	}
	
	
	
	public void fecha()
	{
		
		Thread clock = new Thread()
		{ public void run()
			{
			    try 
			    {
			    	for(;;)//Es un loop
			    	{
			    	Calendar cal = new GregorianCalendar();
			    	//int dia=  cal.get(Calendar.DAY_OF_WEEK);
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int mes = cal.get(Calendar.MONTH);
					int año = cal.get(Calendar.YEAR); 
						
					lblFecha.setText( "        "  +  "FECHA: "   + day+"."  + mes+"." + año+"   "    );	
					
				   				    	
				  sleep(1000);
				  } 
			    } 
			    catch (Exception e) {
				// TODO: handle exception
			    }					
			}			
		};
		
		clock.start();
	
	}
	
	public void reloj()
	{
		
		Thread clock = new Thread()
		{ public void run()
			{
			    try 
			    {
			    	for(;;)//Es un loop
			    	{
			    	Calendar cal = new GregorianCalendar();
			    	
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int mes = cal.get(Calendar.MONTH);
					int año = cal.get(Calendar.YEAR);
					int hora = cal.get(Calendar.HOUR);
					int minuto = cal.get(Calendar.MINUTE);
					int segundo = cal.get(Calendar.SECOND);
					
					//Mostrando en ell Label			
					lblHora.setText( "    " +
					                  "HORA: " + hora+":"+ minuto+":"+ segundo);	
					/*lblFechahora.setText( "                      " +"Fecha: " + day+"."  + mes+"." + año+"    " +
			                  "Hora: " + hora+":"+ minuto+":"+ segundo);	*/
					
					lblHoraCentral.setText(hora+":"+ minuto+":"+ segundo);
			    				    	
				  sleep(1000);
				  } 
			    } 
			    catch (Exception e) {
				// TODO: handle exception
			    }
					
			}
			
		};
		
		clock.start();
		

	}
	

	/**
	 * Create the frame.
	 */
	public VENTANA_PRINCIPAL_A() {
		
		setResizable(false);
		setTitle("GESTOR DONACIONES \u00AE - Proyecto Cibertec 2019 ");
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 45, 1150, 670);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSistema = new JMenu("Sistema");
		mnSistema.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Monitors.png")));
		mnSistema.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnSistema);
		
		mntmCerrar = new JMenuItem("Salir del Sistema");
		mntmCerrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmCerrar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Erase.png")));
		mntmCerrar.addActionListener(this);
		
		mntmOcultar = new JMenuItem("Ocultar Icocos ");
		mntmOcultar.addActionListener(this);
		
		mntmTemaDefoult = new JMenuItem("Fondo Azul");
		mntmTemaDefoult.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Touch.png")));
		mntmTemaDefoult.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmTemaDefoult.addActionListener(this);
		mnSistema.add(mntmTemaDefoult);
		mntmOcultar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/icons8-pdf-32.png")));
		mntmOcultar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnSistema.add(mntmOcultar);
		
		mntmOcultarBordes = new JMenuItem("Ocultar Bordes");
		mntmOcultarBordes.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/icons8-save-close-32.png")));
		mntmOcultarBordes.addActionListener(this);
		mntmOcultarBordes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnSistema.add(mntmOcultarBordes);
		mntmCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.ALT_MASK));
		mnSistema.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Settings.png")));
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMantenimiento);
		
		mntmDonativo = new JMenuItem("Registro Donativo");
		mntmDonativo.addActionListener(this);
		
		mntmDonante = new JMenuItem("Registro Donante");
		mntmDonante.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/List.png")));
		mntmDonante.addActionListener(this);
		
		mntmUsuario = new JMenuItem("Registro Usuario");
		mntmUsuario.addActionListener(this);
		mntmUsuario.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/admin.png")));
		mntmUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmUsuario);
		mntmDonante.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonante);
		mntmDonativo.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Designer.png")));
		mntmDonativo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonativo);
		
		mnRegistro = new JMenu("Consumo");
		mnRegistro.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/nuevo.png")));
		mnRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnRegistro);
		
		mntmIngresoAlimentos = new JMenuItem("Salida de Alimentos");
		mntmIngresoAlimentos.addActionListener(this);
		mntmIngresoAlimentos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnRegistro.add(mntmIngresoAlimentos);
		
		mntmIngresoMercancia = new JMenuItem("Salida de Mercancia");
		mntmIngresoMercancia.addActionListener(this);
		mntmIngresoMercancia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnRegistro.add(mntmIngresoMercancia);
		
		mnReportes = new JMenu("Reportes");
		mnReportes.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/Script.png")));
		mnReportes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnReportes);
		
		mntmClientes_1 = new JMenuItem("Generar Reportes");
		mntmClientes_1.addActionListener(this);
		mntmClientes_1.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/admin.png")));
		mntmClientes_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnReportes.add(mntmClientes_1);
		
		mnUtilitarios = new JMenu("Utilitarios");
		mnUtilitarios.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/select.png")));
		mnUtilitarios.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnUtilitarios);
		
		mntmEspecificaciones = new JMenuItem("Especificaciones PDF");
		mntmEspecificaciones.addActionListener(this);
		mntmEspecificaciones.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/icons8-export-pdf-filled-32 (1).png")));
		mntmEspecificaciones.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmEspecificaciones);
		
		mntmBaseDeDatos = new JMenuItem("Base de Datos");
		mntmBaseDeDatos.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/icons8-database-restore-32.png")));
		mntmBaseDeDatos.addActionListener(this);
		mntmBaseDeDatos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmBaseDeDatos);
		
		mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/calendar-clock-icon_34472.png")));
		menuBar.add(mnNewMenu);
		
		mntmMostrarFecha = new JMenuItem("Mostrar Fecha");
		mntmMostrarFecha.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmMostrarFecha.addActionListener(this);
		mnNewMenu.add(mntmMostrarFecha);
		
		lblFecha = new JLabel("");
		menuBar.add(lblFecha);
		lblFecha.setFont(new Font("Vrinda", Font.BOLD, 23));
		
		lblHora = new JLabel("");
		menuBar.add(lblHora);
		lblHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora.setForeground(SystemColor.inactiveCaptionText);
		lblHora.setFont(new Font("Vrinda", Font.BOLD, 23));
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane_escritorio = new JDesktopPane();
		desktopPane_escritorio.setBackground(getForeground());
		desktopPane_escritorio.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane_escritorio, BorderLayout.CENTER);
		

		
		lblApagar = new LabelsHoverApagar("");
		lblApagar.addMouseListener(this);
		
		lblArchiv = new JLabel("");
		lblArchiv.addMouseListener(this);
		lblArchiv.addMouseMotionListener(this);
		

		
		lblArchiv.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/folder_my_documents_15435 (1).png")));
		lblArchiv.setBounds(36, 60, 145, 145);
		desktopPane_escritorio.add(lblArchiv);
		lblApagar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/botonApagar8.png")));
		lblApagar.setHorizontalAlignment(SwingConstants.CENTER);
		lblApagar.setBounds(497, 331, 148, 145);
		desktopPane_escritorio.add(lblApagar);
		
		btnSwitchOffApagar = new JButton("New button");
		btnSwitchOffApagar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/botonApagarRojo1.png")));
		btnSwitchOffApagar.setBounds(525, 350, 109, 104);
		desktopPane_escritorio.add(btnSwitchOffApagar);
		
		lblHoraCentral = new JLabel("");
		lblHoraCentral.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraCentral.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblHoraCentral.setForeground(SystemColor.textHighlight);
		lblHoraCentral.setBounds(480, 172, 165, 38);
		desktopPane_escritorio.add(lblHoraCentral);
		
		lblCargandoLoading = new JLabel("");
		lblCargandoLoading.setIcon(null);
		lblCargandoLoading.setBounds(1055, 514, 41, 38);
		desktopPane_escritorio.add(lblCargandoLoading);
		
		
		//----------------------------------------------------HOVER
	
		lblImpresionBoton = new LabelsHover("");
		lblImpresionBoton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblImpresionBoton.addMouseListener(this);
		lblImpresionBoton.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/imprimir.png")));
		lblImpresionBoton.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpresionBoton.setBounds(4, 413, 165, 164);
		desktopPane_escritorio.add(lblImpresionBoton);
		
		lblLogin = new JLabel("");
		//lblLogin.setVisible(null);
		lblLogin.addMouseListener(this);
		lblLogin.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/login17.png")));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(203, 18, 717, 569);
		desktopPane_escritorio.add(lblLogin);
		
		imprimirReporte = new JLabel("");
		imprimirReporte.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/imprimirReporte.png")));
		imprimirReporte.setBounds(6, 340, 11, 62);
		desktopPane_escritorio.add(imprimirReporte);
		
		lblImpFondo = new JLabel("");
		lblImpFondo.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/imprimirfondo.png")));
		lblImpFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpFondo.setAlignmentX(1.0f);
		lblImpFondo.setBounds(487, 323, 165, 164);
		desktopPane_escritorio.add(lblImpFondo);
		
		lblBlacoimprimir = new JLabel("");
		lblBlacoimprimir.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/ImpresionBotonBLANCO2.png")));
		lblBlacoimprimir.setBounds(25, 441, 120, 104);
		desktopPane_escritorio.add(lblBlacoimprimir);
		
		lblImprimir = new JLabel("Imprimir");
		lblImprimir.setForeground(Color.LIGHT_GRAY);
		lblImprimir.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblImprimir.setBounds(38, 561, 129, 30);
		desktopPane_escritorio.add(lblImprimir);
		
		lblSpinner = new JLabel("");
		lblSpinner.setIcon(null);
		lblSpinner.setBounds(237, 11, 630, 595);
		desktopPane_escritorio.add(lblSpinner);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(this);
		lblNewLabel.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/tumblr_o9cpfkAC5t1vruiago1_250.gif")));
		lblNewLabel.setBounds(808, 18, 326, 250);
		desktopPane_escritorio.add(lblNewLabel);
		
		lblManten = new JLabel("");
		lblManten.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/folder_contacts_15440 (1).png")));
		lblManten.setBounds(36, 241, 145, 148);
		desktopPane_escritorio.add(lblManten);
		
		lblExcel = new LabelsHover("");
		lblExcel.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/application_office_excel_2474 (1).png")));
		lblExcel.setBounds(981, 70, 139, 145);
		desktopPane_escritorio.add(lblExcel);
		
		lblWord = new JLabel("");
		lblWord.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/request_theoffice_theword_2473 (2).png")));
		lblWord.setBounds(981, 251, 139, 145);
		desktopPane_escritorio.add(lblWord);
		
		lblCarp = new JLabel("");
		lblCarp.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/folder_options_154294.png")));
		lblCarp.setBounds(972, 430, 139, 145);
		desktopPane_escritorio.add(lblCarp);
		
		lblFondo3 = new JLabel("");
		lblFondo3.setIcon(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/fondo003.jpg")));
		lblFondo3.setBounds(4, 0, 1144, 606);
		desktopPane_escritorio.add(lblFondo3);
		
		JLabel lblFondo = new JLabel(new ImageIcon("img/fondo001.jpg"));
		desktopPane_escritorio.add(lblFondo);
		lblFondo.setBounds(0, 0, 1148, 613);
		
		lblFondo2 = new JLabel(new ImageIcon(VENTANA_PRINCIPAL_A.class.getResource("/img/fondo003.jpg")));
		lblFondo2.setBounds(0, 0, 0, 0);
		desktopPane_escritorio.add(lblFondo2);
		
		label = new JLabel("Gestor Donaciones");
		label.setForeground(new Color(211, 211, 211));
		label.setFont(new Font("Tahoma", Font.BOLD, 32));
		label.setBounds(416, 11, 313, 61);
		desktopPane_escritorio.add(label);
		
		label_1 = new JLabel("\u00AE");
		label_1.setForeground(new Color(211, 211, 211));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(716, 7, 28, 30);
		desktopPane_escritorio.add(label_1);
		
		//LLAMO A MIS VOID CREADOS
		
		transparenciaDeBotones();
		reloj();
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmMostrarFecha) {
			actionPerformedMenuItem(arg0);
		}
		if (arg0.getSource() == mntmOcultarBordes) {
			actionPerformedMntmOcultarBordes(arg0);
		}
		if (arg0.getSource() == mntmTemaDefoult) {
			actionPerformedMntmTemaDefoult(arg0);
		}
		if (arg0.getSource() == mntmOcultar) {
			actionPerformedMntmOcultar(arg0);
		}
		if (arg0.getSource() == mntmBaseDeDatos) {
			actionPerformedMntmBaseDeDatos(arg0);
		}
		if (arg0.getSource() == mntmEspecificaciones) {
			actionPerformedMntmEspecificaciones(arg0);
		}
		if (arg0.getSource() == mntmIngresoMercancia) {
			actionPerformedMntmIngresoMercancia(arg0);
		}
		if (arg0.getSource() == mntmIngresoAlimentos) {
			actionPerformedMntmIngresoAlimentos(arg0);
		}
		if (arg0.getSource() == mntmUsuario) {
			actionPerformedMntmUsuario(arg0);
		}
		if (arg0.getSource() == mntmDonativo) {
			actionPerformedMntmDonativo(arg0);
		}
		if (arg0.getSource() == mntmClientes_1) {
			actionPerformedMntmReporte(arg0);
		}
		if (arg0.getSource() == mntmDonante) {
			actionPerformedMntmDonante(arg0);
		}
		if (arg0.getSource() == mntmCerrar) {
			actionPerformedMntmCerrar(arg0);
		}
	}
	protected void actionPerformedMntmCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedMntmDonante(ActionEvent arg0) {
		
		FrmRegistroDonante donan = new FrmRegistroDonante();
		desktopPane_escritorio.add(donan);
		donan.show();	
	}
	
	protected void actionPerformedMntmDonativo(ActionEvent arg0) {
		FrmRegistroDonativo donati= new FrmRegistroDonativo();
		desktopPane_escritorio.add(donati);
		donati.show();	

	}
	
	protected void actionPerformedMntmReporte(ActionEvent arg0) {
		FrmReporte rep = new FrmReporte();
		desktopPane_escritorio.add(rep);
	    rep.show();	
	}
	protected void actionPerformedMntmUsuario(ActionEvent arg0) {
		
		FrmRegistroUsuario regis = new FrmRegistroUsuario();
		regis.setVisible(true);
	}
	protected void actionPerformedMntmIngresoAlimentos(ActionEvent arg0) {
		FrmSalidaAlimentos saal = new FrmSalidaAlimentos(); 
		//saal.setVisible(true);	
		desktopPane_escritorio.add(saal);
	    saal.show();	
	}
	
	
	protected void actionPerformedMntmIngresoMercancia(ActionEvent arg0) {
		FrmSalidaMercancias samer = new FrmSalidaMercancias();
		//samer.setVisible(true);
		desktopPane_escritorio.add(samer);
	    samer.show();
	}
	
	
	
	///*****************PDFS********************abrirarchivo
	public void abrirarchivo(String archivo){
	     try {  File objetofile = new File (archivo);
	            Desktop.getDesktop().open(objetofile);

	     }catch (IOException ex) {
	            System.out.println(ex);
	     }
	}      
	
	
	//Opciones Imprimir---------------------------------------------------------------------------IMPRIMIR	
	  public void mensajeOptionPaneImprimir() {
		 
		  Icon icono = new ImageIcon(getClass().getResource("/img/imprimirLogo70px6.png"));
		  //Icon = new ImageIcon(GeneratedClassLoader);
	    String[] choices = { "Reporte Donativos", "Reporte Donaciones", "Reporte Consumo"};
	    String input = (String) 
	    JOptionPane.showInputDialog(null, "Seleccione", "Elige el Reporte a Imprimir",
	    JOptionPane.QUESTION_MESSAGE, icono, // Use
	                                                                           // default
	                                                                           // icon
	        choices, // Array of choices
	        choices[1]); // Initial choice
	    System.out.println(input);
	  }
	
	
	public void Help() {
        if (Desktop.isDesktopSupported()) {
            try {
            InputStream is = getClass().getResourceAsStream("bd/lp.pdf");
            byte[] data = new byte[is.available()];
            is.read(data);
            is.close();
            String tempFile = "bdlp";
            File temp = File.createTempFile(tempFile, ".pdf");
            FileOutputStream fos = new FileOutputStream(temp);
            fos.write(data);
            fos.flush();
            fos.close();
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("NO PDF READER INSTALLED");
        }
    }
}
	
	protected void actionPerformedMntmEspecificaciones(ActionEvent arg0) {
		//**************************************************************2° forma
		// abrirarchivo("img/LPI_EspecificacionesProyecto.pdf");
		 
		//**************************************************************1° forma
		 /*try {			
			Desktop.getDesktop().open(new java.io.File("bd/LPI_EspecificacionesProyecto.pdf"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		 
		//**************************************************************3° forma
		BarraCargando	b = new BarraCargando();
		
		b.setVisible(true);
		b.setLocationRelativeTo(this);
		
		
		//b.BarraCargando();
		b.update();
		
		b.dispose();
		
				
		 try {
			 

			 //especificacionProyecto
			// File path = new File(getClass().getResource("/paqueteManuales/MenuPrincipal.pdf").toURI());
	        //    Desktop.getDesktop().open(path);
		    //File path = new File ("src/mensajeros.txt");
			File path = new File ("bd/especificacionProyecto.pdf");
		    Desktop.getDesktop().open(path);
		}catch (IOException ex) {
		     ex.printStackTrace();
		}
		 	

	}
	protected void actionPerformedMntmBaseDeDatos(ActionEvent arg0) {
		
		 try {

			File path = new File ("bd/mensajeros.txt");
		    Desktop.getDesktop().open(path);
		}catch (IOException ex) {
		     ex.printStackTrace();
		}
		
		
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == lblNewLabel) {
			mouseClickedLblNewLabel(arg0);
		}
		if (arg0.getSource() == lblLogin) {
			mouseClickedLblLogin(arg0);
		}
		if (arg0.getSource() == lblImpresionBoton) {
			mouseClickedLblimprimir(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
		if (arg0.getSource() == lblArchiv) {
			mousePressedLblArchiv(arg0);
		}
		if (arg0.getSource() == lblApagar) {
			mousePressedLblNewLabel(arg0);
		}
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mousePressedLblNewLabel(MouseEvent arg0) {
		//getContentPane().add(lblApagar);
		JOptionPane.showMessageDialog(this,"Confirme abandonar el Sistema" );	
		dispose();
	}
	
	//Opciones Imprimir---------------------------------------------------------------------BOTON_IMPRIMIR	
	protected void mouseClickedLblimprimir(MouseEvent arg0) {
		mensajeOptionPaneImprimir();
		//JOptionPane.showMessageDialog(this,"Seleccione Documento a Imprimir" );	
		//getContentPane().add(lblApagar);//Elimina el lbl
	
	}
	protected void mouseClickedLblLogin(MouseEvent arg0) {
		/*getContentPane().add(lblLogin);
		dispose();
		LOGIN_USUARIOS	b = new LOGIN_USUARIOS();
		b.setVisible(true);
		b.setLocationRelativeTo(this);*/
		
		
		
	}
	protected void actionPerformedMntmOcultar(ActionEvent arg0) {
		//getContentPane().add(lblImpLogo);
		//getContentPane().add(lblImprimir);
		//getContentPane().add(lblApagar);
		getContentPane().add(lblSpinner);
		getContentPane().add(lblCargandoLoading);
		getContentPane().add(lblManten);
		//getContentPane().add(lblLogin);
		getContentPane().add(lblHoraCentral);
		getContentPane().add(lblExcel);
		getContentPane().add(lblWord);
		getContentPane().add(lblArchiv);
	}
	public void mouseDragged(MouseEvent arg0) {
		if (arg0.getSource() == lblArchiv) {
			mouseDraggedLblArchiv(arg0);
		}
	}
	public void mouseMoved(java.awt.event.MouseEvent evt) {
		xMouse= evt.getX();
		yMouse = evt.getY();
		
	}
	
	protected void mousePressedLblArchiv(java.awt.event.MouseEvent evt) {
		xMouse= evt.getX();
		yMouse = evt.getY();
	}
	protected void mouseDraggedLblArchiv(java.awt.event.MouseEvent evt) {
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		lblArchiv.setLocation((x-x2)-(xMouse-xMouseInDesktopBackground), (y-y2)-(yMouse-xMouseInDesktopBackground));
	}

	protected void actionPerformedMntmTemaDefoult(ActionEvent arg0) {
		getContentPane().add(lblFondo3);
		
		reloj();
	}
	
	//BOTON OCULTAR BORDES
	protected void actionPerformedMntmOcultarBordes(ActionEvent arg0) {
	 CENTRAL bc= new CENTRAL();
	 bc.setVisible(true);
	 //bc.setLocationRelativeTo(this); //Cambia de Posicion inicial
	 dispose();
		//quitarBorde();
	}	
	protected void actionPerformedMenuItem(ActionEvent arg0) {
		fecha();
	}
	protected void mouseClickedLblNewLabel(MouseEvent arg0) {
		 try {
			 Excel ex = new Excel();
			ex.crearExcel();
			
			Reporte r = new Reporte();
			r.reporte();
			File path = new File ("ReporteProductos.xlsx");
		    Desktop.getDesktop().open(path);
		}catch (IOException ex) {
		     ex.printStackTrace();
		}
	}
}
