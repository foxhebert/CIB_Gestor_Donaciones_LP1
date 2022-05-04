package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;


public class FrmReporte extends JInternalFrame implements ActionListener, ItemListener{
	private JComboBox cboReporte;
	private JButton btnCerrar;
	private JButton btnReporte;
	
	
	
	//*****************************************************
	//Variables Globales
			double maxPre, minPre, maxCont, minCont;

			
		
			
			// Datos mínimos del primer producto
					public static String nombre0 = "Leche Gloria";
					public static double precio0 = 135.0;
					public static double contenido0 = 100;
					public static int año0 = 2014;
					public static String casa0 = "Ted Lapidus";
					
					// Datos mínimos del segundo producto
					public static String nombre1 = "Arroz";
					public static double precio1 = 390.0;
					public static double contenido1 = 50.0;
					public static int año1 = 1998;
					public static String casa1 = "Chanel";
					
					// Datos mínimos del tercer producto
					public static String nombre2 = "Agua";
					public static double precio2 = 62.0;
					public static double contenido2 = 90.0;
					public static int año2 = 2012;
					public static String casa2 = "Azucar";
					
					// Datos mínimos del cuarto producto
					public static String nombre3 = "Yogurt";
					public static double precio3 = 510.0;
					public static double contenido3 = 7.5;
					public static int año3 = 1997;
					public static String casa3 = "Gucci";
					
					// Datos mínimos del quinto producto
					public static String nombre4 = "Chocolate";
					public static double precio4 = 210.0;
					public static double contenido4 = 30.0;
					public static int año4 = 2015;
					public static String casa4 = "Fideos";
					
					// Porcentajes 
					public static double porcentaje1 = 4.0;
					public static double porcentaje2 = 5.5;
					public static double porcentaje3 = 7.0;
					public static double porcentaje4 = 8.5;
					
					// Cantidad óptima de productos consumidos
					public static int cantidadOptima = 40;
					
					public static int vEfecP0, vEfecP1, vEfecP2, vEfecP3, vEfecP4;
					public static int vAcuP0, vAcuP1, vAcuP2, vAcuP3, vAcuP4, vAcuPG;
					public static double ipAcuP0, ipAcuP1, ipAcuP2, ipAcuP3, ipAcuP4;
					private JScrollPane scrollPane;
					private JTextArea txtS;
					private JLabel lblSeleccione;
					
				
			
					//*****************************************************		

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmReporte frame = new FrmReporte();
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
	public FrmReporte() {
		setTitle("Reporte || Donaciones");
		setBounds(200, 55, 770, 515);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reporte de Donaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(235, 11, 258, 37);
		getContentPane().add(lblNewLabel);
		
		btnReporte = new JButton("Limpiar ");
		btnReporte.addActionListener(this);
		btnReporte.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReporte.setBounds(399, 62, 156, 29);
		getContentPane().add(btnReporte);
		
		cboReporte = new JComboBox();
		cboReporte.addItemListener(this);
		cboReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboReporte.setModel(new DefaultComboBoxModel(new String[] {"TIPO DE REPORTE ", "DONATIVOS POR PRODUCTO", "CANTIDAD EN RELACI\u00D3N AL PROMEDIO", "PROMEDIO, MAXIMO Y MINIMO"}));
		cboReporte.setBounds(149, 64, 225, 25);
		getContentPane().add(cboReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCerrar.setBounds(565, 62, 156, 29);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 121, 689, 335);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		lblSeleccione = new JLabel("SELECCIONE : ");
		lblSeleccione.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeleccione.setBounds(32, 71, 107, 14);
		getContentPane().add(lblSeleccione);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReporte) {
			actionPerformedBtnReporte(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnReporte(ActionEvent arg0) {
		txtS.setText("");
	}
	
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboReporte) {
			itemStateChangedComboBox(e);
		}
	}
	protected void itemStateChangedComboBox(ItemEvent e) {
		int posi, pma=0, pme=0;
		double ipAcuG=0.0,PromPre=0.0,PromCont=0.0, PreMay=0.0;	
		//llamar metodos
		posi=getPosi();
		ipAcuG=getipAcuG();
		PromPre=getPromPre();
		PromCont=getPromCont();

		mostrarResultados(posi, ipAcuG, PromPre, PromCont,PreMay, pma, pme);
		}
	
	
	
	int getPosi(){
		return cboReporte.getSelectedIndex();
	}
	double getipAcuG(){
		return ipAcuP0+ipAcuP1+ipAcuP2+ipAcuP3+ipAcuP4;
	}
	double getPromPre(){
		return (precio0+precio1+precio2+precio3+precio4)/5;
	}
	double getPromCont(){
		return (contenido0+contenido1+contenido2+contenido3+contenido4)/5;
	}

	void mostrarResultados
	     (int posi, 
			double ipAcuG, 
			double PromPre, 
			double PromCont,
			double PreMay, 
			int pma,
			int pme){
		switch (posi) {
		case 0:
			txtS.setText("");
			break;
		case 1:
			txtS.setText("");			
			txtS.append("\n\t\tDONATIVOS POR PRODUCTO"+"\n\n");
			txtS.append("\tNombre  \t\t\t: " + nombre0 + "\n");
			txtS.append("\tCantidad total de productos  \t\t: " + vEfecP0  +"\n");
			txtS.append("\tCantidad total de unidades recibidas  \t: " + vAcuP0 + "\n");
				
			break;
		case 2: 
			
			txtS.setText("");
			txtS.append("\n\t\tPRODUCTOS MAS CONSUMIDOS"+"\n\n");	
			txtS.append("\tNombre :\t\t\t: " + nombre0 + "\n");
			txtS.append("\tCantidad total de unidades consumidas :\t: " + vAcuP0 );
			if(vAcuP0>=cantidadOptima)pma=vAcuP0-cantidadOptima;
			//else pme=cantidadOptima-vAcuP0;
			if(vAcuP0>=cantidadOptima)
			txtS.append(" ("+pma+" más que la cantidad óptima)\n\n");
			else txtS.append(" ("+pme+" menos que la cantidad óptima)\n");			
			txtS.append("\tCantidad óptima de consumo :\t: " + cantidadOptima + "\n");
		
					
			break;
		case 3: 
			
			txtS.setText("");
			txtS.append("\n\t\tCANTIDAD EN RELACIÓN AL PROMEDIO"+"\n\n");			
			txtS.append("\tNombre \t\t:  " + nombre0 + "\n");
			txtS.append("\tCantidad \t\t:  " +precio0);
			if(precio0>=PromPre)txtS.append(" (más que el promedio)\n\n");
			else txtS.append(" (menos que el promedio)\n");			
			txtS.append("\tCantidad promedio \t: " + PromPre);
			
			break;
		default:
			getPrecioMax();
			getPrecioMin();
			getContenidoMax();
			getContenidoMin();
			
			txtS.setText("");
			txtS.append("\n\t\nPROMEDIO, MAXIMO Y MINIMO"+"\n\n");			
			txtS.append("\t\t\t PROMEDIO \t\t MAXIMO \t\t MINIMO\n\n");			
			txtS.append("\t CANTIDAD (S/)\t\t S/ "+ PromPre+" \t\t S/ "+maxPre+"\t\t S/ " +minPre+"\n\n");
			txtS.append("\t CONTENIDO (ml)\t"+ PromCont+" ml\t\t"+maxCont+" ml\t\t" +minCont+" ml\n\n");			
		}
	}


	void getPrecioMax(){
		maxPre=precio0;
		
		if(precio1>maxPre) maxPre=precio1;		
		if(precio2>maxPre) maxPre=precio2;		
		if(precio3>maxPre) maxPre=precio3;		
		if(precio4>maxPre) maxPre=precio4;
			
	}

	void getPrecioMin(){
		minPre=precio0;
		
		if(precio1<minPre) minPre=precio1;
		if(precio2<minPre) minPre=precio2;		
		if(precio3<minPre) minPre=precio3;		
		if(precio4<minPre) minPre=precio4;
	}

	void getContenidoMax(){
		maxCont=contenido0;
		
		if(contenido1>maxCont) maxCont=contenido1;				
		if(contenido2>maxCont) maxCont=contenido2;		
		if(contenido3>maxCont) maxCont=contenido3;
		
		if(contenido4>maxCont) maxCont=contenido4;
	}

	void getContenidoMin(){
		minCont=contenido0;
		
		if(contenido1<minCont) minCont=contenido1;
		
		if(contenido2<minCont) minCont=contenido2;
		
		if(contenido3<minCont) minCont=contenido3;
		
		if(contenido4<minCont) minCont=contenido4;
	}
}

