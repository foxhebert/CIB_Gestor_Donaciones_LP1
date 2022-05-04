package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import vista.BarraCargando;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class VENTANA_BLOQUEADA extends JFrame implements ActionListener, MouseListener {

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
	private JLabel lblLogin;
	private JLabel imprimirReporte;
	private JLabel lblFecha;
	private JLabel lblHORA;
	private JLabel lblNewLabel;
	private JLabel lblPuntero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTANA_BLOQUEADA frame = new VENTANA_BLOQUEADA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	public VENTANA_BLOQUEADA() {
		
		setResizable(false);
		setTitle("GESTOR DONACIONES \u00AE - 2019 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 45, 1150, 670);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSistema = new JMenu("Sistema");
		mnSistema.setEnabled(false);
		mnSistema.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/Monitors.png")));
		mnSistema.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnSistema);
		
		mntmCerrar = new JMenuItem("Cerrar");
		mntmCerrar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmCerrar.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/Erase.png")));
		mntmCerrar.addActionListener(this);
		mntmCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.ALT_MASK));
		mnSistema.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setEnabled(false);
		mnMantenimiento.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/Settings.png")));
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMantenimiento);
		
		mntmDonativo = new JMenuItem("Registro Donativo");
		mntmDonativo.addActionListener(this);
		
		mntmDonante = new JMenuItem("Registro Donante");
		mntmDonante.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/List.png")));
		mntmDonante.addActionListener(this);
		
		mntmUsuario = new JMenuItem("Registro Usuario");
		mntmUsuario.addActionListener(this);
		mntmUsuario.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/admin.png")));
		mntmUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmUsuario);
		mntmDonante.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonante);
		mntmDonativo.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/Designer.png")));
		mntmDonativo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnMantenimiento.add(mntmDonativo);
		
		mnRegistro = new JMenu("Consumo");
		mnRegistro.setEnabled(false);
		mnRegistro.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/nuevo.png")));
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
		mnReportes.setEnabled(false);
		mnReportes.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/Script.png")));
		mnReportes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnReportes);
		
		mntmClientes_1 = new JMenuItem("Generar Reportes");
		mntmClientes_1.addActionListener(this);
		mntmClientes_1.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/admin.png")));
		mntmClientes_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnReportes.add(mntmClientes_1);
		
		mnUtilitarios = new JMenu("Utilitarios");
		mnUtilitarios.setEnabled(false);
		mnUtilitarios.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/select.png")));
		mnUtilitarios.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnUtilitarios);
		
		mntmEspecificaciones = new JMenuItem("Especificaciones PDF");
		mntmEspecificaciones.setEnabled(false);
		mntmEspecificaciones.addActionListener(this);
		mntmEspecificaciones.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/icons8-export-pdf-filled-32 (1).png")));
		mntmEspecificaciones.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmEspecificaciones);
		
		mntmBaseDeDatos = new JMenuItem("Base de Datos");
		mntmBaseDeDatos.setEnabled(false);
		mntmBaseDeDatos.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/icons8-database-restore-32.png")));
		mntmBaseDeDatos.addActionListener(this);
		mntmBaseDeDatos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnUtilitarios.add(mntmBaseDeDatos);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		desktopPane_escritorio = new JDesktopPane();
		desktopPane_escritorio.setBackground(getForeground());
		desktopPane_escritorio.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane_escritorio, BorderLayout.CENTER);
		
		lblLogin = new JLabel("");
		//lblLogin.setVisible(null);
		lblLogin.addMouseListener(this);
		
		lblFecha = new JLabel("");
		lblFecha.setBounds(0, 0, 0, 0);
		desktopPane_escritorio.add(lblFecha);
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setForeground(SystemColor.inactiveCaptionText);
		lblFecha.setFont(new Font("Vrinda", Font.BOLD, 25));
		
		lblHORA = new JLabel("");
		lblHORA.setHorizontalAlignment(SwingConstants.CENTER);
		lblHORA.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblHORA.setForeground(SystemColor.textHighlight);
		lblHORA.setBounds(491, 172, 140, 46);
		desktopPane_escritorio.add(lblHORA);
		
		lblPuntero = new JLabel("New label");
		lblPuntero.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/source (7).gif")));
		lblPuntero.setBounds(415, 346, 386, 241);
		desktopPane_escritorio.add(lblPuntero);
		lblLogin.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/pcsistema.png")));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(203, 18, 717, 569);
		desktopPane_escritorio.add(lblLogin);
		
		imprimirReporte = new JLabel("");
		imprimirReporte.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/imprimirReporte.png")));
		imprimirReporte.setBounds(6, 340, 11, 62);
		desktopPane_escritorio.add(imprimirReporte);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VENTANA_BLOQUEADA.class.getResource("/img/tumblr_o9cpfkAC5t1vruiago1_250.gif")));
		lblNewLabel.setBounds(808, 18, 326, 250);
		desktopPane_escritorio.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel(new ImageIcon("img/fondo002.jpg"));
		desktopPane_escritorio.add(lblFondo);
		lblFondo.setBounds(0, 0, 1148, 613);
		
		reloj();
	}
	public void actionPerformed(ActionEvent arg0) {
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
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLblLogin(MouseEvent arg0) {
		getContentPane().add(lblLogin);
		getContentPane().add(lblPuntero);
		//dispose();
		LOGIN_USUARIOS	b = new LOGIN_USUARIOS();
		b.setVisible(true);
		b.setLocationRelativeTo(this);
		
		
		
	}
}
