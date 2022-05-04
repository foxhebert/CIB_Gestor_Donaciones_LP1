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

public class VENTANA_PRINCIPAL_AZUL extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	
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
	private JLabel lblImpLogo;
	private JLabel lblLogin;
	private JLabel imprimirReporte;
	private JLabel lblImprimir;
	private JLabel lblFecha;
	private JLabel lblCargandoLoading;
	private JLabel lblHORA;
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
					VENTANA_PRINCIPAL_AZUL frame = new VENTANA_PRINCIPAL_AZUL();
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
	private JLabel lblFondo3;
	private JMenuItem mntmOcultarBordes;


	
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
					lblFecha.setText( "                      " +"Fecha: " + day+"."  + mes+"." + año+"    " +
					                  "Hora: " + hora+":"+ minuto+":"+ segundo);	
					
					lblHORA.setText(hora+":"+ minuto+":"+ segundo);
			    				    	
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
	public VENTANA_PRINCIPAL_AZUL() {
		
		setResizable(false);
		setTitle("GESTOR DONACIONES \u00AE - Proyecto Cibertec 2019 ");
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 45, 1150, 670);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSistema = new JMenu("Sistema");
		mnSistema.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Monitors.png")));
		mnSistema.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnSistema);
		
		mntmCerrar = new JMenuItem("Salir del Sistema");
		mntmCerrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmCerrar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Erase.png")));
		mntmCerrar.addActionListener(this);
		
		mntmOcultar = new JMenuItem("Ocultar Icocos ");
		mntmOcultar.addActionListener(this);
		
		mntmTemaDefoult = new JMenuItem("Fondo Azul");
		mntmTemaDefoult.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Touch.png")));
		mntmTemaDefoult.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmTemaDefoult.addActionListener(this);
		mnSistema.add(mntmTemaDefoult);
		mntmOcultar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/icons8-pdf-32.png")));
		mntmOcultar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnSistema.add(mntmOcultar);
		
		mntmOcultarBordes = new JMenuItem("Ocultar Bordes");
		mntmOcultarBordes.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/icons8-save-close-32.png")));
		mntmOcultarBordes.addActionListener(this);
		mntmOcultarBordes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnSistema.add(mntmOcultarBordes);
		mntmCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.ALT_MASK));
		mnSistema.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Settings.png")));
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMantenimiento);
		
		mntmDonativo = new JMenuItem("Registro Donativo");
		mntmDonativo.addActionListener(this);
		
		mntmDonante = new JMenuItem("Registro Donante");
		mntmDonante.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/List.png")));
		mntmDonante.addActionListener(this);
		
		mntmUsuario = new JMenuItem("Registro Usuario");
		mntmUsuario.addActionListener(this);
		mntmUsuario.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/admin.png")));
		mntmUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmUsuario);
		mntmDonante.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonante);
		mntmDonativo.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Designer.png")));
		mntmDonativo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonativo);
		
		mnRegistro = new JMenu("Consumo");
		mnRegistro.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/nuevo.png")));
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
		mnReportes.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/Script.png")));
		mnReportes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnReportes);
		
		mntmClientes_1 = new JMenuItem("Generar Reportes");
		mntmClientes_1.addActionListener(this);
		mntmClientes_1.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/admin.png")));
		mntmClientes_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnReportes.add(mntmClientes_1);
		
		mnUtilitarios = new JMenu("Utilitarios");
		mnUtilitarios.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/select.png")));
		mnUtilitarios.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnUtilitarios);
		
		mntmEspecificaciones = new JMenuItem("Especificaciones PDF");
		mntmEspecificaciones.addActionListener(this);
		mntmEspecificaciones.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/icons8-export-pdf-filled-32 (1).png")));
		mntmEspecificaciones.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmEspecificaciones);
		
		mntmBaseDeDatos = new JMenuItem("Base de Datos");
		mntmBaseDeDatos.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/icons8-database-restore-32.png")));
		mntmBaseDeDatos.addActionListener(this);
		mntmBaseDeDatos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmBaseDeDatos);
		
		lblFecha = new JLabel("");
		menuBar.add(lblFecha);
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setForeground(SystemColor.inactiveCaptionText);
		lblFecha.setFont(new Font("Vrinda", Font.BOLD, 25));
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane_escritorio = new JDesktopPane();
		desktopPane_escritorio.setBackground(getForeground());
		desktopPane_escritorio.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane_escritorio, BorderLayout.CENTER);
		

		
		lblApagar = new JLabel("");
		lblApagar.addMouseListener(this);
		
		lblArchiv = new JLabel("");
		lblArchiv.addMouseListener(this);
		lblArchiv.addMouseMotionListener(this);
		lblArchiv.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/folder_my_documents_15435 (1).png")));
		lblArchiv.setBounds(36, 60, 145, 145);
		desktopPane_escritorio.add(lblArchiv);
		lblApagar.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/botonApagar8.png")));
		lblApagar.setHorizontalAlignment(SwingConstants.CENTER);
		lblApagar.setBounds(497, 331, 148, 145);
		desktopPane_escritorio.add(lblApagar);
		
		lblCargandoLoading = new JLabel("");
		lblCargandoLoading.setIcon(null);
		lblCargandoLoading.setBounds(1055, 514, 41, 38);
		desktopPane_escritorio.add(lblCargandoLoading);
		
		lblImpLogo = new JLabel("");
		lblImpLogo.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblImpLogo.addMouseListener(this);
		lblImpLogo.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/imprimir.png")));
		lblImpLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpLogo.setBounds(4, 413, 165, 164);
		desktopPane_escritorio.add(lblImpLogo);
		
		lblLogin = new JLabel("");
		//lblLogin.setVisible(null);
		lblLogin.addMouseListener(this);
		
		lblHORA = new JLabel("");
		lblHORA.setHorizontalAlignment(SwingConstants.CENTER);
		lblHORA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHORA.setForeground(SystemColor.textHighlight);
		lblHORA.setBounds(491, 172, 129, 38);
		desktopPane_escritorio.add(lblHORA);
		lblLogin.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/login15.png")));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(203, 18, 717, 569);
		desktopPane_escritorio.add(lblLogin);
		
		imprimirReporte = new JLabel("");
		imprimirReporte.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/imprimirReporte.png")));
		imprimirReporte.setBounds(6, 340, 11, 62);
		desktopPane_escritorio.add(imprimirReporte);
		
		lblImpFondo = new JLabel("");
		lblImpFondo.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/imprimirfondo.png")));
		lblImpFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpFondo.setAlignmentX(1.0f);
		lblImpFondo.setBounds(487, 323, 165, 164);
		desktopPane_escritorio.add(lblImpFondo);
		
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
		lblNewLabel.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/tumblr_o9cpfkAC5t1vruiago1_250.gif")));
		lblNewLabel.setBounds(808, 18, 326, 250);
		desktopPane_escritorio.add(lblNewLabel);
		
		lblManten = new JLabel("");
		lblManten.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/folder_contacts_15440 (1).png")));
		lblManten.setBounds(36, 241, 145, 148);
		desktopPane_escritorio.add(lblManten);
		
		lblExcel = new JLabel("");
		lblExcel.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/application_office_excel_2474 (1).png")));
		lblExcel.setBounds(981, 70, 139, 145);
		desktopPane_escritorio.add(lblExcel);
		
		lblWord = new JLabel("");
		lblWord.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/request_theoffice_theword_2473 (2).png")));
		lblWord.setBounds(981, 251, 139, 145);
		desktopPane_escritorio.add(lblWord);
		
		lblCarp = new JLabel("");
		lblCarp.setIcon(new ImageIcon(VENTANA_PRINCIPAL_AZUL.class.getResource("/img/folder_options_154294.png")));
		lblCarp.setBounds(972, 430, 139, 145);
		desktopPane_escritorio.add(lblCarp);
		
		lblFondo3 = new JLabel("");
		lblFondo3.setIcon(null);
		lblFondo3.setBounds(4, 0, 1144, 606);
		desktopPane_escritorio.add(lblFondo3);
		
		JLabel lblFondo = new JLabel(new ImageIcon("img/fondo001.jpg"));
		desktopPane_escritorio.add(lblFondo);
		lblFondo.setBounds(0, 0, 1148, 613);
		
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
		
		reloj();
	}
	public void actionPerformed(ActionEvent arg0) {
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
		if (arg0.getSource() == lblLogin) {
			mouseClickedLblLogin(arg0);
		}
		if (arg0.getSource() == lblImpLogo) {
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
	protected void mouseClickedLblimprimir(MouseEvent arg0) {
		JOptionPane.showMessageDialog(this,"Seleccione Documento a Imprimir" );	
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
		getContentPane().add(lblHORA);
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
	}
	
	//BOTON OCULTAR BORDES
	protected void actionPerformedMntmOcultarBordes(ActionEvent arg0) {
	 CENTRAL bc= new CENTRAL();
	 bc.setVisible(true);
	 //bc.setLocationRelativeTo(this); //Cambia de Posicion inicial
	 dispose();
		//quitarBorde();
	}/**/
}
